import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(findValue(sum));

    }
    public static int findValue(int sum) {
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()) {
            System.out.println("Неправильно задано число");
        }
        int firstValue = scanner.nextInt();
        if(!scanner.hasNextInt()) {
            System.out.println("Неправильно задано число");
        }
        int secondValue = scanner.nextInt();
        sum = firstValue+secondValue;
        return sum;
    }
}


