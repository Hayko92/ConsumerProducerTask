import java.util.LinkedList;
import java.util.List;

public class Warehouse {
    private LinkedList<Product> data = new LinkedList<>();

    public void addProduct() {
        synchronized (this) {
            while (data.size() >= 5) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Product current = new Product();
            data.add(current);
            System.out.println("Added:" + current+": Products in warehouse:"+ data.size());
            notify();

        }
    }

    public void getProduct() {
        synchronized (this) {
            while (data.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Product deleted = data.pop();
            System.out.println("Deleted:" + deleted+": Products in warehouse:"+ data.size());
            notify();
        }
    }
}
