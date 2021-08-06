public class Producer extends Thread {
    private final Warehouse warehouse;

    public Producer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (true) {
            warehouse.addProduct();
        }
    }
}
