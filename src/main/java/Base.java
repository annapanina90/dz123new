import java.util.Scanner;

/**
 * @author Anna Panina
 * @see Base
 * @see Scanner
 */
public class Base {
    @SuppressWarnings("LoopStatementThatDoesntLoop")
    public static void main(String[] args) {
        //  System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию (1-калькулятор, 2- массив): ");
        int oper = scanner.nextInt() ;
        if (oper == 1) {
            System.out.println("Введите первое число: ");
            //введем первое дробное число
            double a = scanner.nextFloat();
            System.out.println("Введите второе число: ");
            //введем второе дробное число
            double b = scanner.nextFloat();
            //выберем операцию
            System.out.println("Введите операцию: ");
            String operator = scanner.next();

            if (operator.equals("+")) {
                System.out.printf("Сумма = %.4f", (a + b));
            }
            if (operator.equals("*")) {
                System.out.printf("Сумма = %.4f", (a * b));
            }
            if (operator.equals("/")) {
                System.out.printf("Сумма = %.4f", (a / b));
            }
            if (operator.equals("-")) {
                System.out.printf("Сумма = %.4f", (a - b));
            }
        }
        System.out.println();
        if (oper == 2) {
            System.out.println("Введите длину массива: ");
            int size = scanner.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
            String array[] = new String[size]; // Создаём массив string размером в size
            System.out.println("Введите значения массива: ");
            /*Пройдёмся по всему массиву, заполняя его*/
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.next();
            }
            // Заполняем массив элементами, введёнными с клавиатуры

            /*
            for (int i = 0; i < array.length; i++)

                if (array.length < array[++i].length()) {
                    System.out.println("Самое длинное слово в массиве = " + array[++i]);
                } else {
                    i++;
                }*/
            String max = array[0];
            for (int i = 0; i < array.length-1; i++) {
                for (int j = i + 1; j < array.length; j++ ) {
                    if (array[i].length() < array[j].length()) {
                        max = array[j];
                    }
                }
            }
            System.out.println("Самое длинное слово в массиве = " + max);


        }
        scanner.close();
    }

}





