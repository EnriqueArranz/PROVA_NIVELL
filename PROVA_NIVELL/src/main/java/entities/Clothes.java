package entities;

public class Clothes extends Product{

    private int size;
    private String type;
    private String material;

    public Clothes(String name, float price, int size, String type, String material) {
        super(name, price);
        this.size = size;
        this.type = type;
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", salePercentage=" + salePercentage +
                '}';
    }
}
