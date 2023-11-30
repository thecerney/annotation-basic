package cerney.annotation.basic;

import java.util.List;
import java.util.ArrayList;

public class SafeVarargsTest {
    @SafeVarargs
    public static <T> List<T> mergeLists(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(4.5, 5.6);
        List<Number> numberList = List.of(10, 20.5);

        // Integer와 Double은 둘 다 Number의 하위 타입
        List<Number> mergedNumberList = mergeLists(intList, doubleList, numberList);
        System.out.println("Merged Number List: " + mergedNumberList);

        List<String> list1 = List.of("Hello");
        List<String> list2 = List.of("World");

        List<String> mergedStringList = mergeLists(list1, list2);
        System.out.println("Merged String List: " + mergedStringList);
    }
}