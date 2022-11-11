package task2;

public class review2 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2, 7, 3};
            abc[3] = 9;
            } 
        catch (NullPointerException ex) {
            System.out.println("Пусто. Попробуй еще раз");
            } 
        catch (IndexOutOfBoundsException ex) {
            System.out.println("У массива размер меньше!");
        } 
        catch (Throwable ex) { 
            System.out.println("ты где-то ошибся...");
        }
    }

     public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
        }
}
