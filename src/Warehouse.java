import java.util.LinkedList;


public class Warehouse {
    private final LinkedList<Product> data = new LinkedList<>();


    public void addProduct() {

        synchronized (this) {
            while (data.size() >= 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Product current = new Product();
            data.add(current);
            System.out.println("Added:" + current + ": Products in warehouse:" + data.size());
            notifyAll();

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
            System.out.println("Deleted:" + deleted + ": Products in warehouse:" + data.size());
            notifyAll();
        }
    }
}
