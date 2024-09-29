class Product implements Cloneable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Product [Name=" + name + ", Price=" + price + "]";
    }
}

public class PrototypeDemo {
    public static void main(String[] args) {
        Product originalProduct = new Product("Laptop", 1200.00);
        Product clonedProduct = originalProduct.clone();
        clonedProduct = new Product("Laptop", 1000.00);
        
        System.out.println(originalProduct);
        System.out.println(clonedProduct);
    }
}
