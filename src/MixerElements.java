import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MixerElements {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list = new ArrayList<>();
        first.forEach(list::add);
        second.forEach(list::add);
        Collections.shuffle(list);
        return list.stream();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(1);
        listTwo.add(2);
        listTwo.add(3);
    }

}