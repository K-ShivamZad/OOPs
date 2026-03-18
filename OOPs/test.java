class Test {
    public static void main(String[] args) {
        System.out.println("Main Begin");
        System.out.println("Go To Other Threads");

        First f = new First();
        Second s = new Second();

        f.start();
        s.start();

        try {
            f.join();
            s.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Come Back to main");
        System.out.println("Main End " + f.getName() + " " + s.getName());
    }
}

class First extends Thread {
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("First i = " + i);
        }
        System.out.println("Over First thread");
    }
}

class Second extends Thread {
    public void run() {
        for (int j = 0; j <= 3; j++) {
            System.out.println("Second j = " + j);
        }
        System.out.println("Over Second thread");
    }
}
