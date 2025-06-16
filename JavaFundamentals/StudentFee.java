import java.util.Scanner;
public class StudentFee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int discountedPercentage=sc.nextInt();
        int discountAmount = (fee * discountedPercentage) / 100;
        int finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and the final discounted fee is INR " + finalFee + ".");
    }
}
