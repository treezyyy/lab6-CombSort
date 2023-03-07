
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность размер массива");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите эл массива");
        for (int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        System.out.println("введённый массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        CombSort(array);
        System.out.println("отсортированный массив: " + Arrays.toString(array));
    }

    private static void CombSort(int[] array) {
        double factor = 1.247;
        int step = array.length;
        while (step > 1){
            step = (int) (step/factor);
            System.out.println(step);
            for(int i = 0; step + i < array.length; i++){
                if (array[i] > array[i +  step]) {
                    swap(array, i, i + step);
                }
            }
        }
    }
    public static void swap(int[] array, int x, int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    }