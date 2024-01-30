package entities;

import enums.Battery;
import enums.ProductType;
import enums.Season;
import exceptions.ProductNotFoundException;
import main.ProductFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class CorteIrlandes {
    private String name;
    private Stock stock;
//    private TicketHistory ticketHistory;

    public CorteIrlandes(String name, Stock stock) {
        this.name = name;
        this.stock = stock;
    }

    public void initializeStock() {
        stock.addProduct(new Beauty("Maquillaje", 0.05F, false, Season.WINTER), 3);
        stock.addProduct(new Beauty("Skincare", 0.05F, false, Season.WINTER), 4);
        stock.addProduct(new Electronics("Computer", 100, 100, Battery.mAh3000), 30);
        stock.addProduct(new Clothes("Coat", 60, 42, "WinterClothing", "Wool"), 70);
    }

    public void addNewProductStock() {
        String productTypeString = Reader.askString("Introduce its type (Beauty, Electrodomestic, Electronics, Clothes)").toUpperCase();
        ProductType productType = Enum.valueOf(ProductType.class, productTypeString);
        String name = Reader.askString("Introduce its name");
        float price = Reader.askFloat("Introduce its price per unit");
        ProductFactory productFactory = new ProductFactory();
        Product product = null;
        switch (productType) {
            case BEAUTY:
                String seasonString = Reader.askString("Introduce season SUMMER/SPRING/AUTUMN/WINTER").toUpperCase();
                Season season = Enum.valueOf(Season.class, seasonString);
                boolean vegan = Reader.askBoolean("Vegan yes/no");
                product = productFactory.create(name, price, vegan, season);
                break;
            case ELECTRODOMESTIC:
                int consumo = Reader.askInt("Introduce its consumo");
                LocalDate fabricDate = Reader.askDate("Introduce its fabric date");
                int maxKgs = Reader.askInt("Introduce its maximum capacity");
                product = productFactory.create(name, price, consumo, fabricDate, maxKgs);
                break;
            case ELECTRONICS:
                String batteryString = Reader.askString("Introduce its battery type mAh2500, mAh3000, mAh4000").toUpperCase();
                Battery battery = Enum.valueOf(Battery.class, batteryString);
                int resolution = Reader.askInt("Introduce its resolution");
                product = productFactory.create(name, price, resolution, battery);
                break;
            case CLOTHES:
                int size = Reader.askInt("Introduce size");
                String type = Reader.askString("Introduce its name");
                String material = Reader.askString("Introduce its name");
                product = productFactory.create(name, price, size, type, material);
                break;
            default:
                System.out.println("This is not a valid type");
        }
        int quantity = Reader.askInt("Introduce its quantity");
        stock.addProduct(product, quantity);
    }

    public void incrementProductStock() throws ProductNotFoundException {
        int id = Reader.askInt("Introduce id of product you want to increase its quantity");
        Product product = stock.findProductById(id);
        int quantity = Reader.askInt("Introduce the quantity you want to add");
        stock.increaseProductQuantity(product, quantity);
    }

    public void decrementProductStock() throws ProductNotFoundException {
        int id = Reader.askInt("Introduce id of product you want to decrease its quantity");
        Product product = stock.findProductById(id);
        int quantity = Reader.askInt("Introduce the quantity you want to add");
        stock.decreaseProductQuantity(product, quantity);
    }

    public void findProductInStock() throws ProductNotFoundException {
        int id = Reader.askInt("Introduce id of product you want to know its stock");
        Product product = stock.findProductById(id);
        System.out.println(stock.getProductQuantity(product));
    }

    public void calculateGarantyDate() throws ProductNotFoundException {
        int id = Reader.askInt("Introduce id of product you want to know its garanty Date");
        Product product = stock.findProductById(id);
        LocalDate date = Reader.askDate("Introduce date of purchase");
        stock.getProductQuantity(product);
    }

    public void showProductsWithSales() {
        stock.getProductsWithSales();
    }

    public void removeProductStock() throws ProductNotFoundException {
        int id = Reader.askInt("Introduce id of product you want to remove");
        Product product = stock.findProductById(id);
        stock.removeProduct(product);
    }

    public void showCatalogWithQuantities() {
        List<Product> productList = new ArrayList<>(stock.getProductList().keySet());
        productList.sort(Comparator.comparingInt(Product::getId));
        productList.forEach(product -> System.out.println(product + "Quantity: " + stock.getProductList().get(product) + "\n"));
    }
}
