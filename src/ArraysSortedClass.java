import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysSortedClass {

    private String[] array;

    public ArraysSortedClass(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public static String arraysSortedMethod(String[] array) {
        List<String> list = new ArrayList<>();
        for (String st : array) {
            String temp = st.replaceAll(",", "");
            String[] tempArray = temp.split(" ");
            Collections.addAll(list, tempArray);
        }
        List<Integer> newList = list.stream()
                .map(Integer::parseInt).sorted().toList();
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer num : newList) {
            stringBuilder.append(num).append(", ");
        }
        stringBuilder.setLength(stringBuilder.length() - 2);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ArraysSortedClass arraysSortedClass = new ArraysSortedClass(new String[]{"1, 2, 0", "4, 5"});
        System.out.println(arraysSortedMethod(arraysSortedClass.array));
    }
}
