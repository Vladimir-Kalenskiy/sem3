package hw3.task1;

import hw3.task1.Calculate;

public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        float n2 = 1.99f;

        System.out.println(Calculate.sum(n1, n2));
        System.out.println(Calculate.subtract(n1,n2));
        System.out.println(Calculate.multi(n1,n2));
        System.out.println(Calculate.div(n1,n2));
    }
}
