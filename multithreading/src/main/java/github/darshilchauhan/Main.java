package github.darshilchauhan;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(30);
        MyThread ta = new MyThread("A", 1, counter);
        MyThread tb = new MyThread("B", 2, counter);
        MyThread tc = new MyThread("C", 3, counter);
        MyThread td = new MyThread("D", 4, counter);
        MyThread te = new MyThread("E", 5, counter);
        ta.start();
        tb.start();
        tc.start();
        td.start();
        te.start();

        ta.join();
        tb.join();
        tc.join();
        td.join();
        te.join();
        System.out.println();
        counter.printData();
    }
}