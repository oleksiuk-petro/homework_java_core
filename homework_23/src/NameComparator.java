import java.util.Comparator;

public class NameComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
