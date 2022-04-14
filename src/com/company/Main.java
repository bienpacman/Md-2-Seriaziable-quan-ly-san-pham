package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Máy giặt", "Linux", 9000000, "giat"));
        products.add(new Product(2, "Tủ lạnh", "Sam sung", 8400000, "bao quan"));
        products.add(new Product(3, "Điều hòa", "Panasonic", 7100000, "lam mat"));
        products.add(new Product(4, "Tivi", "Sony", 9000000, "Giai tri"));
        products.add(new Product(5, "Exciter", "Yamaha", 9000000, "Trom cho"));
        writeToFile("Product.txt", products);
        hienthi("Product.txt");
        System.out.println("----------------------");
        search(5, "Product.txt");
        System.out.println("----------------------------------");
        addP(new Product(6,"nong lanh","linix",9000000,"sssj"),"Product.txt");
        hienthi("Product.txt");
    }

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();

        } catch (Exception ex) {
            ex.printStackTrace();


        }
        return products;
    }

    public static Product search(int id, String path) {
        List<Product> products = readDataFromFile(path);
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                System.out.println(products.get(i));
            }
        }
        return null;

    }
    public static void hienthi(String path){
        List<Product> productDateFromFile = readDataFromFile("Product.txt");
        for (Product product : productDateFromFile) {
            System.out.println(product);

        }
    }
    public static void addP(Product product,String path){
        List<Product> productDateFromFile = readDataFromFile("Product.txt");
        productDateFromFile.add(product);
        writeToFile(path,productDateFromFile);

    }

}
