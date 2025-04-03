package GenericsTutorial;
import java.util.*;

class Interval {
    int start, end;
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class IntervalScheduling {
    public static void main(String[] args) {
        Interval[] intervals = {
            new Interval(2,4),
            new Interval(3,5),
            new Interval(8,1),
            new Interval(2,7),
            new Interval(3,9)
        };

        Arrays.sort(intervals, Comparator.comparingInt(i -> i.end));

        List<Interval> selectedIntervals = new ArrayList<>();
        int lastEnd = -1;

        for (Interval interval : intervals) {
            if (interval.start >= lastEnd) {
                selectedIntervals.add(interval);
                lastEnd = interval.end;
            }
        }

        for (Interval interval : selectedIntervals) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
