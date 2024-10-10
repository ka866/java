
public class MethodSession {
	public static void main(String[] args) {
		calculateSum();
		calculateProduct();
		findMaximum();
		calculateSquareRoot();
		checkEvenOrOdd();
		calculateCube();
		calculateDivision();
		calculateCircleArea();
		printOddNumbers();
		printMultiplesOfFive();
	}

	public static void calculateSum() {
        int firstNumber = 5;
        int secondNumber = 3;
        int sumResult = firstNumber + secondNumber;
        System.out.println("Sum of " + firstNumber + " and " + secondNumber + ": " + sumResult);
    }

    public static void calculateProduct() {
        int firstValue = 4;
        int secondValue = 6;
        int productResult = firstValue * secondValue;
        System.out.println("Product of " + firstValue + " and " + secondValue + ": " + productResult);
    }

    public static void findMaximum() {
        int firstValue = 10;
        int secondValue = 20;
        int maxValue = (firstValue > secondValue) ? firstValue : secondValue;
        System.out.println("Maximum between " + firstValue + " and " + secondValue + ": " + maxValue);
    }

    public static void calculateSquareRoot() {
        int numberToCalculate = 16;
        double squareRoot = Math.sqrt(numberToCalculate);
        System.out.println("Square root of " + numberToCalculate + ": " + squareRoot);
    }

    public static void checkEvenOrOdd() {
        int numberToCheck = 9;
        if (numberToCheck % 2 == 0) {
            System.out.println(numberToCheck + " is even.");
        } else {
            System.out.println(numberToCheck + " is odd.");
        }
    }

    public static void calculateCube() {
        int numberToCube = 3;
        int cubeResult = numberToCube * numberToCube * numberToCube;
        System.out.println("Cube of " + numberToCube + ": " + cubeResult);
    }

    public static void calculateDivision() {
        int dividend = 20;
        int divisor = 4;
        int divisionResult = dividend / divisor;
        System.out.println("Division of " + dividend + " by " + divisor + ": " + divisionResult);
    }

    public static void calculateCircleArea() {
        double radius = 7.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area of a circle with radius " + radius + ": " + area);
    }

    public static void printOddNumbers() {
        int count = 10;
        System.out.print("First " + count + " odd numbers: ");
        for (int i = 1; i <= count; i++) {
            System.out.print((i * 2) - 1 + " ");
        }
        System.out.println();
    }

    public static void printMultiplesOfFive() {
        int count = 10;
        System.out.print("First " + count + " multiples of 5: ");
        for (int i = 1; i <= count; i++) {
            System.out.print(i * 5 + " ");
        }
        System.out.println();
    }

}
