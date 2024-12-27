import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        for(int i = 1; i <= 5; i++) {
            printtenstar();
            System.out.println("");
        }
    }

    public static void printtenstar() {
        for(int i = 1; i <= 10; i++) System.out.print("*");
    }
}