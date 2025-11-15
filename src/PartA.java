import java.util.Random;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        int [] dataPoints;
        double sum = 0;
        double average;
        int val;
        int found = 0;
        int index = 0;
        int min;
        int max;

        dataPoints = new int[100];
        Random rnd = new Random();

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < dataPoints.length; i++){
            dataPoints [i] = rnd.nextInt(100) + 1;
        }

        for (int dataPoint : dataPoints) {
            System.out.print(dataPoint + " | ");
            sum += dataPoint;
        }

        System.out.println();

        System.out.println("The sum of the random array dataPoints is: " + sum);

        average = sum / dataPoints.length;

        System.out.println("The average of the random array dataPoints is: " + average);

        val = SafeInput.getRangedInt(in, "Enter a number between 1-100", 1, 100);

        for (int dataPoint : dataPoints) {
            if (val == dataPoint) {
                found++;
            }
        }

        System.out.println("Your number was found " + found + " times");

        val = SafeInput.getRangedInt(in, "Enter a number between 1-100", 1, 100);

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == val) {
                index = i;
                break;
            }

        }

        if (val == dataPoints[index]) {
            System.out.println("The value " + val + " was found at array index " + index);
        }
        else {
            System.out.println("The value " + val + " was not found");
        }


        min = dataPoints[0];
        max = dataPoints[0];

        for (int dataPoint : dataPoints) {
            if (dataPoint < min) {
                min = dataPoint;
            } else if (dataPoint > max) {
                max = dataPoint;
            }
        }
        System.out.println("Highest Number: " + max);
        System.out.println("Lowest Number: " + min);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int[] values) {
        double sum = 0;
        double average;

        for (int value : values) {
            sum += value;
        }
        average = sum / values.length;
        return average;
    }
}
