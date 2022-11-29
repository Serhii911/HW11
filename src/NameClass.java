import java.util.ArrayList;
import java.util.List;

public class NameClass {
    private List<String> names;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public NameClass(List<String> names) {
        this.names = names;
    }

    public String oddIndexNames(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < list.size(); i++) {
            if(i % 2 != 0) {
                String stringFormat = String.format("%d. %s, ", i, list.get(i));
                result.append(stringFormat);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        NameClass nameClass = new NameClass(new ArrayList<>());
        nameClass.names.add("Serj");
        nameClass.names.add("Kolya");
        nameClass.names.add("Sanya");
        nameClass.names.add("Philip");
        nameClass.names.add("Den");
        nameClass.names.add("Fedor");
        nameClass.names.add("Michel");
        nameClass.names.add("Bret");
        System.out.println(nameClass.oddIndexNames(nameClass.names));
    }
}
