public class TablePrinter implements Runnable {
    private final int number;

    public TablePrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (TablePrinter.class) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6};
        Thread[] threads = new Thread[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            TablePrinter tablePrinter = new TablePrinter(numbers[i]);
            threads[i] = new Thread(tablePrinter);

            if (i > 0) {
                try {
                    threads[i - 1].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            threads[i].start();
        }
    }
}
