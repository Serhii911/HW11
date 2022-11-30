import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedClass {

    List<String> list;

    public SortedClass(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public static List<String> listSort(List<String> list) {
        List<String> resultList = new ArrayList<>();
        for (String s : list) {
            resultList.add(s.toUpperCase());
        }
        Collections.sort(resultList);
        Collections.reverse(resultList);
        return resultList;
    }

    public static void main(String[] args) {
    SortedClass sortedClass = new SortedClass(new ArrayList<>());
        sortedClass.list.add("Serj");
        sortedClass.list.add("Kolya");
        sortedClass.list.add("Sanya");
        sortedClass.list.add("Philip");
        sortedClass.list.add("Zinaida");
        sortedClass.list.add("Den");
        sortedClass.list.add("Fedor");
        sortedClass.list.add("Michel");
        sortedClass.list.add("Bret");
        sortedClass.list.add("Alf");
        System.out.println(listSort(sortedClass.list));
    }
}
