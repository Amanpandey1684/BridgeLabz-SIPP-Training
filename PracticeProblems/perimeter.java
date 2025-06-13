
import java.util.Scanner;
public class perimeter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.printf("Perimeter of the rectangle is: %.2f\n", perimeter);
        sc.close();
    }
    
}
