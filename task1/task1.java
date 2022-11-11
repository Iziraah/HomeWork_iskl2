
//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
//вместо этого, необходимо повторно запросить у пользователя ввод данных.



package task1;

import java.util.Scanner;


public class task1 {

    public static void main(String[] args) {

        Boolean flag = getFloat();
        while (!flag) {
            flag = getFloat();
        }
    }

    public static boolean getFloat() {
        Scanner out = new Scanner(System.in);
        System.out.print("Введите десятичную дробь = ");
        String input = out.nextLine();
        try {
            Float number = Float.parseFloat(input);
            System.out.println(String.format("Введенное число = %.2f", number)); 
            return true;
        }
        catch (NumberFormatException ex) {
              return false;
        }
    }
}

