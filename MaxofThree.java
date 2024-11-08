import java.util.scanner;
	public class MaxofThree
	{
		public static void main(string[] args)
		 Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3]; 

        System.out.println("Enter three integers:");
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < 3; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The maximum number among the three is: " + max);
    }
}
	}
}