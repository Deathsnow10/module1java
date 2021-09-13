import java.util.Scanner;

public class takinginput {
    public static void main (String[] args){
        System.out.println("Taking input from the user : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of the numbers are : ");
        System.out.println(sum);
    }
}
