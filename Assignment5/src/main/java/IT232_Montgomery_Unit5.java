import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IT232_Montgomery_Unit5 {

    private final static String MESSAGE = "There are %d products in the file.";
    private final static String PRODUCT_ITEM = "\n%d. %s %.2f";
    private final static String FILENAME = "ProducePrice";

    public static void main(String[] args) throws IOException {
        List<Product> products = part1();
        System.out.println();
        part2(products);
        for (int pos = 0; pos < products.size(); pos++) {
            Product p = products.get(pos);
            System.out.printf(PRODUCT_ITEM, pos + 1, p.getName(), p.getPrice());
        }
    }

    //*********************************************************
    //****Assignment 5 Section 1
    //*********************************************************
    public static List < Product > part1() throws IOException {
        List < Product > produceList = new ArrayList < > (
                Arrays.asList(
                        new Product("bananas", 0.59),
                        new Product("grapes", 2.99),
                        new Product("apples", 1.49),
                        new Product("pears", 1.39),
                        new Product("lettuce", 0.99),
                        new Product("onions", 0.79),
                        new Product("potatoes", 0.59),
                        new Product("peaches", 1.59)
                )
        );

        Path filePath = Paths.get(FILENAME);
        persistList(produceList, filePath);
        System.out.printf(MESSAGE, fileLineCount(FILENAME));
        return produceList;
    }

    public static int fileLineCount(String fileName) {
        Path file = Paths.get(fileName);
        try (InputStream in = Files.newInputStream(file); BufferedReader reader = new BufferedReader(new InputStreamReader( in ))) {
            int count = 0;
            String line = null;
            while ((line = reader.readLine()) != null) {
                count += 1;
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    //*********************************************************
    //****Assignment 5 Section 2
    //*********************************************************
    public static void part2(List < Product > produceList) throws IOException {
        produceList.addAll(
                Arrays.asList(
                        new Product("peppers", 0.99),
                        new Product("celery", 1.29),
                        new Product("cabbage", 0.79),
                        new Product("tomatoes", 1.39)
                )
        );

        Path filePath = Paths.get(FILENAME);
        persistList(produceList, filePath);
        System.out.printf(MESSAGE, fileLineCount(FILENAME));
    }

    public static void persistList(List < Product > list, Path file) throws IOException {
        Files.deleteIfExists(file);
        Files.createFile(file);
        list
                .forEach(x -> {
                    String line = String.format("%s,%.2f\n", x.getName(), x.getPrice());
                    try {
                        Files.writeString(file, line, StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

    }

    public static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}