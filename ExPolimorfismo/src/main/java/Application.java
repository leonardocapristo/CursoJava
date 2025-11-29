import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number od products : ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Product> listProducts = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i +" data : ");
            System.out.println("Common, used or imported (c/u/i) ? ");
            char typeProduct = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Name : ");
            String name = sc.nextLine();


            System.out.println("Price : ");
            double price = sc.nextDouble();



            if (typeProduct == 'c'){

                Product product = new Product(name, price);
                listProducts.add(product);

            }else if (typeProduct == 'u') {
                sc.nextLine();

                System.out.println("Enter manufacture date (DD/MM/YYYY) : ");

                String manufactureDateText = sc.nextLine();
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate manufactureDate = LocalDate.parse(manufactureDateText, dateTimeFormatter);

                Product product = new UsedProduct(name,price,manufactureDate);
                listProducts.add(product);
                
            }else if(typeProduct == 'i') {

                System.out.println("Enter customs fee: ");
                double customsFee = sc.nextDouble();

                Product product = new ImportedProduct(name,price,customsFee);

                ImportedProduct importedProduct = (ImportedProduct) product;
                importedProduct.totalPrice(customsFee);


                listProducts.add(product);
            }

        }

        for (Product product : listProducts){

            System.out.println(product.priceTag());
        }



        sc.close();
    }
}
