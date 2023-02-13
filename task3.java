// Реализовать простой калькулятор.

package seminar1_homework;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class task3 {
    private static PrintStream printf;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // считываем строку
        System.out.printf("Что вы хотите посчитать?: ");
        String calculate = iScanner.nextLine();
        iScanner.close();
        
        String new_calculate = calculate.replace("+", " + ") // 'причесываем' введенные пользователем данные
                                        .replace("*", " * ")
                                        .replace("/", " / ")
                                        .replace("-", " -") // - приклеиваем к цифре
                                        .replace("- ", "-")
                                        .replace("  ", " ");
        
        String[] calc_arr = new_calculate.split(" ");
        
        List<String> calc_list = new ArrayList<>(Arrays.asList(calc_arr)); // преобразуем массив в лист для более удобной работы
        
        while (calc_list.contains("*") | calc_list.contains("/")){   
        
            for (int i = 1; i < calc_list.size() - 1; i++){

                if (calc_list.get(i).equals("*")){
                    float result = Float.parseFloat(calc_list.get(i-1)) * Float.parseFloat(calc_list.get(i+1));
                    calc_list.set(i-1, Float.toString(result));
                    calc_list.remove(i);
                    calc_list.remove(i);
                    break;
                }

                if (calc_list.get(i).equals("/")){
                    float result = Float.parseFloat(calc_list.get(i-1)) / Float.parseFloat(calc_list.get(i+1));
                    calc_list.set(i-1, Float.toString(result));
                    calc_list.remove(i);
                    calc_list.remove(i);
                    break;
                }
            }
        }
        
        while (calc_list.contains("+")){ // удаляем знак + из ссписка, чтобы просто сложить элементы
            calc_list.remove("+"); 
        }
        
        
        float sum = 0;
        for (int i = 0; i<calc_list.size(); i++) {
            sum += Float.parseFloat(calc_list.get(i));
        }
        
        printf = System.out.printf("Результат выражения равен = %.2f", sum);
    }

}
