import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        String[] sign = {"+", "-", "*", "/"};
        String[] ch = {"\\+", "-", "\\*", "/"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите выражение");
        String expr = scn.nextLine();
        int index = -1;
        for (int i = 0; i < sign.length; i++) {
            if (expr.contains(sign[i])) {
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("Введен не верный знак");
            return;
        }
        String[] array = expr.split(ch[index]);
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        if (a>10 || b>10) {
            System.out.println("Введите число меньше 10");
            return;
        }
        int result;
        switch (sign[index]) {
            case "+":
                result = a + b;
                System.out.print("Резульат выражения: ");
                System.out.println(result);
                break;
            case "-":
                result = a - b;
                System.out.print("Резульат выражения: ");
                System.out.println(result);
                break;
            case "*":
                result = a * b;
                System.out.print("Резульат выражения: ");
                System.out.println(result);
                break;
            case "/":
                result = a / b;
                System.out.print("Резульат выражения: ");
                System.out.println(result);
                break;
            default:
                System.out.println("Введен неверный знак");
        }
    }
}