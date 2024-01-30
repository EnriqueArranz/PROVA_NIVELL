package entities;

public abstract class Product {
    protected int id;
    protected String name;
    protected String brand;
    protected float price;
    private static int counter = 1;
    protected int salePercentage=0;

    public int getSalePercentage() {
        return salePercentage;
    }

    public void setSalePercentage(int salePercentage) {
        this.salePercentage = salePercentage;
    }

    public Product(String name, float price) {

        this.name = name;
        this.price = price;
        this.setId(counter++);
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int _id) {
        this.id = _id;
        if (counter < _id) {
            counter = _id;
        }
    }
}
