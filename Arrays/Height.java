import java.util.Scanner;

public class Height {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] heights = new double[11];
        
        for(int i = 0; i < heights.length; i++) {
            System.out.print("Enter height " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }
        double totalHeight = 0;
        for(int i = 0; i < heights.length; i++) {
            totalHeight += heights[i];
        }
        double meanHeight= totalHeight/11;
        System.out.println("Mean height: " + meanHeight);
    }
}
