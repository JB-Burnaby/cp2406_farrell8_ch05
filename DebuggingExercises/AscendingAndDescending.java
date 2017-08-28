import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;

        int num1;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter the first number");
        num1 = input1.nextInt();

        int num2;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the second number");
        num2 = input2.nextInt();

        int num3;
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter the third number");
        num3 = input3.nextInt();

        if (num1 <= num2 && num1 <= num3){
            pos1 = num1;
            System.out.println(num1);
        }
        if (num2 <= num3){
            pos2 = num2;
            pos3 = num3;
        }
        System.out.println("Ascending: " + pos1 + ", " + pos2 + ", " + pos3);
        System.out.println("Descending: " + pos3 + ", " + pos2 + ", " + pos1);
    }
}
