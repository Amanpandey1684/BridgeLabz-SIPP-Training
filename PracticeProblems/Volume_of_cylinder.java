import java.util.Scanner;
// This program calculates the volume of a cylinder given its radius and height.
public class Volume_of_cylinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume of the cylinder is: %.2f\n", volume);
        sc.close();
    }
    
}
