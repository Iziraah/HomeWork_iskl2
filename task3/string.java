package task3;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


import java.util.Scanner;

public class string {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
        String myString = in.nextLine();
        if (myString == null || myString.isEmpty()) {
            throw new RuntimeException("ай-яй!.. пустые строки вводить нельзя.");
        }
    }
}
}
