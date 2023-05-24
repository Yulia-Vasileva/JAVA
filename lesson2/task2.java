// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации вывести в консоль.
package lesson2;

public class task2 {
    public static void main(String args[]) {
        int[] sortArr = {7, 20, 9, 1, 21, 72, 2};
        for (int j = 0; j < sortArr.length; j++){
        for (int i = 0; i < sortArr.length - 1; i++) {
            if (sortArr[i + 1] < sortArr[i]) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[i + 1];
                sortArr[i + 1] = swap;
                }
            }
            System.out.println();
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + " ");
        }
        }
    }
}

