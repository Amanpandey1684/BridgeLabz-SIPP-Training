import java.util.Scanner;
public class SI {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.printf("Simple Interest is: %.2f\n", simpleInterest);
        sc.close();
    }
    
}
