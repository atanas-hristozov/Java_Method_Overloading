import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int x = add(1,2);
         System.out.println(x);
         int y = add(1,2,4,6);
         System.out.println(y);
         double z = add(1.02,2.3, 6.2);
         System.out.println(z);
         double m = add(1,2.5,23.2,11.22);
         System.out.println(m);

    }

    static int add(int a, int b){
        System.out.println("This is method number 1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is method number 2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is method number 3");
        return a+b+c+d;
    }
    static int add(int a, int b, int c, int d, int e){
        System.out.println("This is method number 4");
        return a+b+c+d+e;
    }
    static double add(double a, double b){
        System.out.println("This is method number 5");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is method number 6");
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is method number 7");
        return a+b+c+d;
    }
    static double add(double a, double b, double c, double d, double e){
        System.out.println("This is method number 8");
        return a+b+c+d+e;
    }
}
