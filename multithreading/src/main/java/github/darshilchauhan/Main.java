package github.darshilchauhan;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(11);
        MyThread ta = new MyThread("A", 3, counter);
        MyThread tb = new MyThread("B", 3, counter);
        MyThread tc = new MyThread("C", 3, counter);
        MyThread td = new MyThread("D", 3, counter);
        MyThread te = new MyThread("E", 2, counter);
        ta.run();
        tb.run();
        tc.run();
        td.run();
        te.run();
        System.out.println();
        counter.printData();
    }
}