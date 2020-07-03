import java.util.Arrays;

public class TestSort {
    public static void testSort() {

        System.out.print("Дан массив: ");
        int[] arr1 = {1, 3, 4, 7, 11, 89};
        String toarr1 = Arrays.toString(arr1);
        System.out.println(toarr1);

        System.out.println("Ожидаемый результат сортировки: [89, 11, 7, 4, 3, 1,] ");
        System.out.print("Фактический результат: ");

        Sort.reverseSort(arr1);
        String toarr2 = Arrays.toString(arr1);
        System.out.println(toarr2);

    }
}
