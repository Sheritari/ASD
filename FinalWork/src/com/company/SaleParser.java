package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс, реализующий методы для чтения и записи данных класса Sale.
 */
public class SaleParser {

    /**
     * Метод чтения списка объектов класса Sale из файла.
     * @param file - файл для чтения.
     * @return возвращает список объектов класса Sale.
     */
    public List<Sale> readFromFile(File file) throws ParserConfigurationException, IOException, SAXException {
        List<Sale> sales = new ArrayList<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element root = document.getDocumentElement();
        NodeList children = root.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);

            if (child instanceof Element childElement) {
                int id = Integer.parseInt(childElement.getAttribute("id"));
                int sellerId = Integer.parseInt(childElement.getAttribute("sellerId"));
                int productId = Integer.parseInt(childElement.getAttribute("productId"));
                int quantityOfSold = Integer.parseInt(childElement.getAttribute("quantityOfSold"));

                String[] t = childElement.getAttribute("date").split("-");
                LocalDate date = LocalDate.of(Integer.parseInt(t[2]), Integer.parseInt(t[1]), Integer.parseInt(t[0]));

                sales.add(new Sale(id, sellerId, productId, quantityOfSold, date));
            }
        }

        return sales;
    }
}
