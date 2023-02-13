// +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
// могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
// восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет.

package seminar1_homework;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in); // считываем строку
        System.out.printf("введите уравнение вида q + w = e, q, w, e >= 0 < 100 (некторые цифры могут быть заменены '?'): ");
        String equation = iScanner.nextLine();    
        iScanner.close();

        String new_equation = equation.replace(" + ", " ")
                                  .replace(" = ", " ");

    
        String[] eq_arr = new_equation.split(" ");
       
        Boolean solution = true;
        for (int i = 0; i < 10; i++) {
            int q = Integer.parseInt(eq_arr[0].replace("?", Integer.toString(i)));
            for (int j =0; j < 10; j++) {
                int w = Integer.parseInt(eq_arr[1].replace("?", Integer.toString(j)));
                for (int k = 0; k < 10; k++) {
                    int e = Integer.parseInt(eq_arr[2].replace("?", Integer.toString(k)));
                    if (q + w == e) {
                        System.out.printf("Предлагаю следующее равенство, под Ваш запрос => %d + %d = %d\n", q, w, e);
                        solution = false;
                        break;
                    }
                }
                if (solution == false) break;
            }
            if (solution == false) break;
        } 
        if (solution){
            System.out.println("Решений нет!");   
        } 
                                   
        

    }
    
}
