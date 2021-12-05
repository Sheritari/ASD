package com.company;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

/**
 * Final work.
 *
 * @author Sheritari (Severgin Andrey)
 */
public class Main {

    /**
     * Метод для получения фамилии продавца по его номеру.
     * @param id - номер продавца.
     * @param sellers - список продавцов.
     * @return возвращает фамилию продавца или "unknown", в случае, если продавца нет в списке.
     */
    public static String getSellerSurname(int id, List<Seller> sellers) {
        return sellers.stream()
                .filter(seller -> seller.getId() == id).map(Seller::getSurname).findFirst()
                .orElse("unknown");
    }

    /**
     * Метод для получения имени продавца по его номеру.
     * @param id - номер продавца.
     * @param sellers - список продавцов.
     * @return возвращает имя продавца или "unknown", в случае, если продавца нет в списке.
     */
    public static String getSellerName(int id, List<Seller> sellers) {
        return sellers.stream()
                .filter(seller -> seller.getId() == id).map(Seller::getName).findFirst()
                .orElse("unknown");
    }

    public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException, IOException, SAXException, XMLStreamException {
        SaleParser sp = new SaleParser();
        File file = new File("Sales.xml");
        List<Sale> sales = sp.readFromFile(file);
        SellerParser sP = new SellerParser();
        File file2 = new File("Sellers.xml");
        List<Seller> sellers = sP.readFromFile(file2);

        Map<Integer, Integer> map = new HashMap<>();
        for (Sale sale : sales) {
            int value = 0;

            // Получение id товара
            Integer id = sale.getSellerId();

            // Получение количества проданного товара,
            // уже хранящегося в множестве
            if (map.get(id) != null) {
                value = map.get(id);
            }

            // Увеличение хранящегося количества
            map.put(id, value + sale.getQuantityOfSold());
        }

        // Создание отсортированного множества
        LinkedHashMap<Integer, Integer> sorted_map = new LinkedHashMap<>();
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sorted_map.put(x.getKey(), x.getValue()));

        // Записываем первый выходной файл
        File outFile = new File("out.xml");
        XMLOutputFactory outFactory = XMLOutputFactory.newInstance();
        Writer writerOut = new PrintWriter(outFile);
        XMLStreamWriter outStreamWriter = outFactory.createXMLStreamWriter(writerOut);
        outStreamWriter.writeStartDocument();
        outStreamWriter.writeStartElement("sellers");

        int s = 0;
        for (Map.Entry<Integer, Integer> entry : sorted_map.entrySet()) {
            if (s > 4) {
                break;
            }
            outStreamWriter.writeStartElement("seller");
            outStreamWriter.writeAttribute("quantityOfSold", entry.getValue().toString());
            outStreamWriter.writeAttribute("id", entry.getKey().toString());
            outStreamWriter.writeAttribute("surname", getSellerSurname(entry.getKey(), sellers));
            outStreamWriter.writeAttribute("name", getSellerName(entry.getKey(), sellers));
            outStreamWriter.writeEndElement();
            s++;
        }
        outStreamWriter.writeEndElement();
        outStreamWriter.writeEndDocument();
        outStreamWriter.close();

        Map<LocalDate, Integer> map2 = new HashMap<>();
        for (Sale sale : sales) {
            int value = 0;

            // Получение даты продажи
            LocalDate date = sale.getDate();

            // Получение количества проданного товара,
            // уже хранящегося в множестве
            if (map2.get(date) != null) {
                value = map2.get(date);
            }

            // Увеличение хранящегося количества
            map2.put(date, value + sale.getQuantityOfSold());
        }

        // Создание отсортированного множества
        LinkedHashMap<LocalDate, Integer> sorted_map2 = new LinkedHashMap<>();
        map2.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sorted_map2.put(x.getKey(), x.getValue()));

        // Записываем второй выходной файл
        File outFile2 = new File("out2.xml");
        XMLOutputFactory outFactory2 = XMLOutputFactory.newInstance();
        Writer writerOut2 = new PrintWriter(outFile2);
        XMLStreamWriter outStreamWriter2 = outFactory2.createXMLStreamWriter(writerOut2);
        outStreamWriter2.writeStartDocument();
        outStreamWriter2.writeStartElement("dates");

        s = 0;
        for (Map.Entry<LocalDate, Integer> entry : sorted_map2.entrySet()) {
            if (s > 4) {
                break;
            }
            outStreamWriter2.writeStartElement("date");
            outStreamWriter2.writeAttribute("quantityOfSold", entry.getValue().toString());
            outStreamWriter2.writeAttribute("date", entry.getKey().toString());
            outStreamWriter2.writeEndElement();
            s++;
        }
        outStreamWriter2.writeEndElement();
        outStreamWriter2.writeEndDocument();
        outStreamWriter2.close();
    }
}
