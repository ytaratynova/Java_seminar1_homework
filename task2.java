// Вывести все простые числа от 1 до 1000 

package seminar1_homework;

public class task2 {
    public static void main(String[] args) {
        for (int i = 2; i <=1000; i++){
            for (int j = 1; j < i; j++){
                if (i % j == 0 && j != 1){
                    break;
                } else {
                    if (i == j + 1){
                        System.out.printf("%d ", i);
                    }
                }
            }
        }    
    }    
}

