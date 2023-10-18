import java.util.Scanner;

public class ForMultiples15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple = 15;
        int sum = 0;
        int counter = 0;

        System.out.println("Input the multiple: ");
        multiple = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
            }
        }

        double average = (double) sum / counter; // Calculate the average as a double

        System.out.printf("There are %d numbers that are multiples of %d in the range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in the range 1 to 50 is %d.\n", multiple, sum);
        System.out.printf("The average of all multiples of %d in the range 1 to 50 is %.2f.\n", multiple, average);
    }
}
