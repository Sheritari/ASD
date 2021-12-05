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
import java.util.ArrayList;
import java.util.List;

/**
 * Класс, реализующий методы для чтения и записи данных класса SellerProduct.
 */
public class SellerProductParser {

    /**
     * Метод чтения списка объектов класса SellerProduct из файла.
     * @param file - файл для чтения.
     * @return возвращает список объектов класса SellerProduct.
     */
    public List<SellerProduct> readFromFile(File file) throws ParserConfigurationException, IOException, SAXException {
        List<SellerProduct> sellerProducts = new ArrayList<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element root = document.getDocumentElement();
        NodeList children = root.getChildNodes();
        for (int i = 0; i < children.getLength(); i++){
            Node child = children.item(i);

            if (child instanceof Element childElement) {
                int sellerId = Integer.parseInt(childElement.getAttribute("sellerId"));
                int productId = Integer.parseInt(childElement.getAttribute("productId"));
                int price = Integer.parseInt(childElement.getAttribute("price"));
                int quantity = Integer.parseInt(childElement.getAttribute("quantity"));

                sellerProducts.add(new SellerProduct(sellerId, productId, price, quantity));
            }
        }

        return sellerProducts;
    }
}
