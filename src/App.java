import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Enter the power levels of 10 creatures.
        int[] powerLevels = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the power levels of creatures: ");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            powerLevels[i] = scanner.nextInt();
        }

        System.out.println();

        // Bubble Sort in ascending order.
        for (int i = 0; i < powerLevels.length - 1; i++) {
            for (int j = 0; j < powerLevels.length - i - 1; j++) {
                if (powerLevels[j] > powerLevels[j + 1]) {
                    int sorted = powerLevels[j];
                    powerLevels[j] = powerLevels[j + 1];
                    powerLevels[j + 1] = sorted;
                }
            }
        }

        // Print the bubble sorted power levels.
        System.out.println("Bubble Cort (Ascending): ");
        for (int i = 0; i < powerLevels.length; i++) {
            System.out.print(powerLevels[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Selection Sort in descending order.
        for (int i = 0; i < powerLevels.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < powerLevels.length; j++) {
                if (powerLevels[j] > powerLevels[maxIndex]) {
                    maxIndex = j;
                }
            }
            int sorted = powerLevels[maxIndex];
            powerLevels[maxIndex] = powerLevels[i];
            powerLevels[i] = sorted;
        }

        // Print the selection sorted power levels.
        System.out.println("Selection Cort (Descending): ");
        for (int i = 0; i < powerLevels.length; i++) {
            System.out.print(powerLevels[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Calculate the sum of even, odd, minimum, and maximum power level.
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int minPowerLevel = powerLevels[0];
        int maxPowerLevel = powerLevels[0];
        for (int i = 0; i < powerLevels.length; i++) {
            if (powerLevels[i] % 2 == 0) {
                sumEvenNumbers += powerLevels[i];
            }
            if (powerLevels[i] % 2 != 0) {
                sumOddNumbers += powerLevels[i];
            }
            if (powerLevels[i] < minPowerLevel) {
                minPowerLevel = powerLevels[i];
            }
            if (powerLevels[i] > maxPowerLevel) {
                maxPowerLevel = powerLevels[i];
            }
        }

        // Print the Analysis
        System.out.println("Analysis: ");
        System.out.println("Sum of even numbers: " + sumEvenNumbers);
        System.out.println("Sum of odd numbers: " + sumOddNumbers);
        System.out.println("Minimum power level: " + minPowerLevel);
        System.out.println("Maximum power level: " + maxPowerLevel);
        System.out.println();

        scanner.close();
    }
}