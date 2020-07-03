
import java.util.HashMap;

public class TestMap {
    public static void testMap() {
        System.out.println("Тест 1 (Карасев Дмитрий), Ожидаемый результат: 1");
        System.out.print("Фактичский результат: ");
        System.out.println(Map.countElementsInMap("Карасев", "Дмитрий"));
        System.out.println("");
        System.out.println("Тест 2 (Андреев Андрей), Ожидаемый результат: 2");
        System.out.print("Фактичский результат: ");
        System.out.println(Map.countElementsInMap("Андреев", "Андрей"));
        System.out.println("");
        System.out.println("Тест 3 (Ерохин Сергей), Ожидаемый результат: 3");
        System.out.print("Фактичский результат: ");
        System.out.println(Map.countElementsInMap("Ерохин", "Сергей"));
        System.out.println("");

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Дмитров", "Алексей");
        map.put("Ерохин", "Сергей ");
        map.put("Ярмолов", "Алексей");
        map.put("Карасев ", "Дмитрий");
        map.put(" Ерохин", "Сергей");
        map.put("Андреев ", "Андрей ");
        map.put("Смирнов", "Владимир");
        map.put("Ерохин ", "Сергей");
        map.put("Андреев", "Андрей");

        System.out.println("Тест на удаление элемента. \nОжидаемый результат: Удаление значения с именем Дмитрий");
        System.out.print("Фактический результат: ");
        Map.deleteValueFromMap(map, "Дмитрий");

    }
}
