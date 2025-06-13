import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("Area of the circle is: %.2f\n", area);
        sc.close();
    }

    
}
