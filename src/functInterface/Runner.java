package functInterface;
import java.util.Scanner;

/**
 * Программа реализует определенную логику на основе введенного с консоли числа.
 * Если введено "1", то запрашивается строка, которая выводится в обратном порядке.
 * Если введено "2", то запрашивается число, для которого высчитывается факториал.
 */

public class Runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1 или 2: ");
        int consoleNumber = sc.nextInt();

        MyClassTest.doBySetNumber(consoleNumber);
        sc.close();
    }
}
