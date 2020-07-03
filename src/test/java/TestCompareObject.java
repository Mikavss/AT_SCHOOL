import java.util.ArrayList;
import java.util.LinkedList;

public class TestCompareObject {
    public static void testCompareObject() {

        System.out.println("Медод compare(), compareToString() и compareHashCode() для массива.\nОжидаемый результат: true, true, true");
        int[] arr1 = {0};
        int[] arr2 = {0};
        System.out.print("Фиктический результат: ");
        System.out.print(CompareObjects.compare(arr1, arr2) + ", ");
        System.out.print(CompareObjects.compareToString(arr1, arr2) + ", ");
        System.out.println(CompareObjects.compareHashCode(arr1, arr2));
        System.out.println(" ");

        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(0);
        LinkedList<Integer> y = new LinkedList<Integer>();
        y.add(0);

        System.out.println("Метод compare() и compareHashCod() для ArreyList и LinkedList.\nТак как классы разные, ожидаемый результат: false, false ");
        System.out.print("Фактический результат: ");
        System.out.print(CompareObjects.compare(x, y) + ", ");
        System.out.println(CompareObjects.compareHashCode(x, y));

    }
}

