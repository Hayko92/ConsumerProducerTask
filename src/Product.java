public class Product {
    private static int id = 0;

    public Product() {
        id++;
    }

    @Override
    public String toString() {
        return "Product{"+id+"}";
    }
}
