public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Consumer consumer1 = new Consumer(warehouse);
        Consumer consumer2 = new Consumer(warehouse);
        Consumer consumer3 = new Consumer(warehouse);
        Consumer consumer4 = new Consumer(warehouse);
        Consumer consumer5 = new Consumer(warehouse);
        Consumer consumer6 = new Consumer(warehouse);

        Producer producer1 = new Producer(warehouse);
        Producer producer2 = new Producer(warehouse);
        Producer producer3 = new Producer(warehouse);
        Producer producer4 = new Producer(warehouse);
        Producer producer5 = new Producer(warehouse);
        Producer producer6 = new Producer(warehouse);


        consumer1.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();
        consumer5.start();
        consumer6.start();
        producer5.start();
        producer4.start();
        producer3.start();
        producer2.start();
        producer1.start();
        producer6.start();

    }
}
