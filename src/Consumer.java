public class Consumer extends Thread {
    private final Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            warehouse.getProduct();
        }
    }
}
