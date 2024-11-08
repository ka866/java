import java.util.Scanner;

public class TallestMountain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of mountains (N): ");
        int N = scanner.nextInt();
        
        int[] heights = new int[N];
        System.out.println("Enter the heights of the mountains:");
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }

        int maxHeight = heights[0];
        
       
        for (int height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        
        System.out.println("The height of the tallest mountain is: " + maxHeight);
    }
}