import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        //#1
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Было: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                array[i] = 1;
            } else{
                array[i] = 0;
            }
        }
        System.out.println("Стало: " + Arrays.toString(array));

        //#2
        int[] arr2 = new int[8];
        for (int i = 0; i < 8; i++) {
            arr2[i] = i * 3;
        }
        System.out.println("Результат заполнения массива: " + Arrays.toString(arr2));

        //#3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6 ){
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println("Результат заполнения массива: " + Arrays.toString(arr3));
        
        //#4
        int [][] arr4 = new int[9][9];
        System.out.println("Результат заполнения: ");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i==j || i+j==arr4.length - 1){
                    arr4[i][j] = 1;
                }else{
                    arr4[i][j] = 0;
                }
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }

        //#5
        int min = arr3[0];
        int max = arr3[0];
        for (int i = 1; i < arr3.length; i++) {
            if (min > arr3[i]){
                min = arr3[i];
            }else if (max < arr3[i]){
                max = arr3[i];
            }
        }
        System.out.println("Массив: " + Arrays.toString(arr3));
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);

        //#6
        int arr5[] = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Массив для поиска места: " + Arrays.toString(arr5));
        if (checkBalance(arr5)){
            System.out.println("Есть место!");
        }else {
            System.out.println("Места нет.");
        }
    }
    public static boolean checkBalance(int [] arr){
        int sumLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            int sumRight = 0;
            sumLeft = sumLeft + arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sumRight = sumRight + arr[j];
            }
            if (sumLeft==sumRight){
                return true;
            }
        }
        return false;
    }
}
