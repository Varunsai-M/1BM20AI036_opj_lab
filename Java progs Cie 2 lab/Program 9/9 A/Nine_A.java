class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }
}
class Product {
    private String manufacturer;
    private int weight;

    public Product(String manufacturer, int weight) {
        this.manufacturer = manufacturer;
        this.weight = weight;
    }
    public void verifyProduct() throws InvalidProductException {
        if (weight > 100 && !manufacturer.equals("BMS")) {
            throw new InvalidProductException("Invalid product: weight is more than 100kg and manufacturer is not BMS.");
        } else {
            System.out.println("Product is valid.");
        }
    }
}
public class Nine_A{
    public static void main(String[] args) {
        Product product = new Product("BMS", 90);
        try {
            product.verifyProduct();
        } catch (InvalidProductException e) {
            System.out.println(e.getMessage());
        }
    }
}
