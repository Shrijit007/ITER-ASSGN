
class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class IntervalScheduling {
    public static void intervalScheduling(Interval[] intervals) {
        bubbleSort(intervals);
        System.out.println("Selected intervals:");

        int lastEndTime = Integer.MIN_VALUE;

        for (Interval interval : intervals) {
            if (interval.start >= lastEndTime) {
                System.out.println("[" + interval.start + ", " + interval.end + "]");
                lastEndTime = interval.end;
            }
        }
    }
    private static void bubbleSort(Interval[] intervals) {
        int n = intervals.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intervals[j].end > intervals[j + 1].end) {
                    Interval temp = intervals[j];
                    intervals[j] = intervals[j + 1];
                    intervals[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Interval[] intervals = {
                new Interval(1, 3),
                new Interval(2, 5),
                new Interval(4, 7),
                new Interval(6, 8),
                new Interval(5, 9),
                new Interval(8, 10)
        };
        intervalScheduling(intervals);
    }
}