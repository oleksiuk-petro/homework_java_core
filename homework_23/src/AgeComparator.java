import java.util.Comparator;

public class AgeComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
