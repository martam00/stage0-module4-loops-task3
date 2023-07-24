package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int x0 = 0;
        int x1 = 1;
        System.out.println(x0);
        System.out.println(x1);
        for (int i = 2; i < lastFibonacci; i++) {
            int fibb = x0 + x1;
            System.out.println(fibb);
            x0 = x1;
            x1 = fibb;
        }
    }
}
