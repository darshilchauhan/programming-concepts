package github.darshilchauhan;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(11);
        MyThread ta = new MyThread("A", 3, counter);
        ta.run();
        MyThread tb = new MyThread("B", 3, counter);
        tb.run();
        MyThread tc = new MyThread("C", 3, counter);
        tc.run();
        MyThread td = new MyThread("D", 3, counter);
        td.run();
        MyThread te = new MyThread("E", 2, counter);
        te.run();
        System.out.println();
        counter.printData();
    }
}