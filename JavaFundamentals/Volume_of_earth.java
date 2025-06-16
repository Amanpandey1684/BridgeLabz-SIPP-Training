import java.util.Scanner;
public class Volume_of_earth{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of earth:");
        double radius=6371;
        double volume=(4.0/3.0)*Math.PI*Math.pow(radius, 3);
        System.out.println("The volume of the earth is: " + volume + " cubic units.");
        sc.close();
        System.out.println("Convert it in cubic miles:");
        double volumeInCubicMiles = volume * 0.000000239913;
        System.out.println("The volume of the earth in cubic miles is: " + volumeInCubicMiles + " cubic miles.");
        System.out.println("The volume of earth in cubic kilometers is" + volume  + " and cubic miles is " + volumeInCubicMiles);

    }
}