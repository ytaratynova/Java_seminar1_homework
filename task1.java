// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)


package seminar1_homework;
import java.util.Scanner;
public class task1 {

    static int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum += i;
        }
    return sum;
    }

    static int factor(int number) {
        if(number==1)return 1;
    return number * factor(number-1);
    }

    public static void main(String[] args) {
        Scanner iScann = new Scanner(System.in);
            System.out.printf("Input n: ");
            int n = iScann.nextInt();
            int triangle_number = sum(n);
            int factorial_number = factor(n);
        System.out.printf("Сумма чисел от 1 до n = %d\n", triangle_number);
        System.out.printf("n! = %d\n", factorial_number);
        
    }    
    
}
