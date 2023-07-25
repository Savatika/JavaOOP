import java.util.Scanner;

import Callculator.ComCal;
import Callculator.Operation;
import Logger.File;
import Logger.Logger;
import Callculator.Calculator;

public class Programm {
    public static void main(String[] args) throws Exception {

        Logger log = new File("log.txt");
        Calculator cal = new ComCal(log);
        Scanner iScanner = new Scanner(System.in);

        // Ввод 1 комплексного числа
        System.out.println("Введите действительную часть:");
        double material = iScanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary1 = iScanner.nextDouble();
        Operation n1 = new Operation(material, imaginary1);

        System.out.print("Введите действие (+,*,/): ");
        char oper = iScanner.next().charAt(0);

        // Ввод 2 комплексного числа
        System.out.println("Введите действительную часть:");
        double material2 = iScanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary2 = iScanner.nextDouble();
        Operation n2 = new Operation(material2, imaginary2);

        switch (oper) {
            case '+':
                Operation sum = cal.add(n1, n2);
                System.out.println("Сумма: " + sum);
                break;
            case '*':
                Operation prod = cal.multiply(n1, n2);
                System.out.println("Произведение: " + prod);
                break;
            case '/':
                Operation quot = cal.divide(n1, n2);
                System.out.println("Частное: " + quot);
                break;
            default:
                System.out.println("Ошибка");
                break;

        }
        iScanner.close();

    }

}
