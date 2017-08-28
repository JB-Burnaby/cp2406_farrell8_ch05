import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int item;
        item = input.nextInt();
        if (item % 2 == 0) {
            System.out.println("Integer is even");
        } else {
            System.out.println("Integer is odd");
        }

    }
}
