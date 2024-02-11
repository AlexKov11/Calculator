import java.util.Scanner;

public class Culc2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите выражение");
        String expr = scn.nextLine();
        String [] array = expr.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        if (a>10 || b>10) {
            System.out.println("Введите число меньше 10");
            return;
        }
        String op = array[1];
        int result;
        switch (op) {
            case "+" :
                result = a + b;
                System.out.print("Резульат выражения: ");
                System.out.println(result);
                break;
            case "-" :
                result = a - b;
                System.out.print("Резульат выражения: ");
                System.out.println(result);
                break;
            case "/" :
                result = a / b;
                System.out.print("Резульат выражения: ");
                System.out.println(result);
                break;
            case "*" :
                result = a * b;
                System.out.print("Резульат выражения: ");
                System.out.println(result);
                break;
            default:
                System.out.println("Введен неверный знак");
        }

    }
}

