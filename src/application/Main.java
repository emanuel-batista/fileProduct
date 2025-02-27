package application;

import model.entities.Product;

import javax.xml.transform.Source;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file path: ");
        String strPath = sc.nextLine();

        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();
            while (line != null){
                String[] itemDetails = line.split(",");
                String name = itemDetails[0];
                double price = Double.parseDouble(itemDetails[1]);
                int quantity = Integer.parseInt(itemDetails[2]);

                products.add(new Product(name, price, quantity));

                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        File sourceFile = new File(strPath);
        File outFolder = new File(sourceFile.getParent() + "\\out");
        if (!outFolder.exists()) {
            outFolder.mkdir();
        }

        String newPath = outFolder.getPath() + "\\summary.csv";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))){
            for (Product product : products){
                bw.write(product.toString());
                bw.newLine();
            }

        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }



//        for(Product product : products){
//            System.out.println(product.toString());
//        }

    }
}
