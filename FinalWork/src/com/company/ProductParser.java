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
 * Класс, реализующий методы для чтения и записи данных класса Product.
 */
public class ProductParser {

    /**
     * Метод чтения списка объектов класса Product из файла.
     * @param file - файл для чтения.
     * @return возвращает список объектов класса Product.
     */
    public List<Product> readFromFile(File file) throws ParserConfigurationException, IOException, SAXException {
        List<Product> productList = new ArrayList<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element root = document.getDocumentElement();
        NodeList children = root.getChildNodes();
        for (int i = 0; i < children.getLength(); i++){
            Node child = children.item(i);

            if (child instanceof Element childElement) {
                int id = Integer.parseInt(childElement.getAttribute("id"));
                String name = childElement.getAttribute("name");

                productList.add(new Product(id, name));
            }
        }

        return productList;
    }
}
