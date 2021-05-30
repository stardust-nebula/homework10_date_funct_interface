package functInterface;
import java.util.Scanner;

public class MyClassTest {

    static void doBySetNumber (int consoleNumber) {
        Scanner getValue = new Scanner(System.in);
        if (consoleNumber == 1) {
            IFuncInterfaceCustom<String> iFunc = (str) -> {
                StringBuilder buffer = new StringBuilder(str);
                return buffer.reverse().toString();
            };
            System.out.println("Введите строку для обработки: ");
            System.out.println(iFunc.func(getValue.nextLine()));

        } else if (consoleNumber == 2) {
            IFuncInterfaceCustom<Integer> iFunc = (n) -> {
                int result = 1;
                for (int i = 1; i <= n; i++) {
                    result = i * result;
                }
                return result;
            };
            System.out.println("Введите число для подсчета факториала: ");
            System.out.println(iFunc.func(getValue.nextInt()));
        } else System.out.println("Конец программы без реализации.");
        getValue.close();
    }
}
