package leetcode;

import java.util.*;

public class MergeIntervals {

    public static void main(String[] args) {

        List<List<Integer>> input = Arrays.asList(Arrays.asList(6,7), Arrays.asList(2,4), Arrays.asList(5,9));

        List<List<Integer>> lists = mergedIntervals(input);
        lists.stream().forEach(x -> {
            for (Integer integer : x) {
                System.out.print(integer + "\t");
            }
            System.out.println();
        });
    }

    public static List<List<Integer>> mergedIntervals(List<List<Integer>> intervals) {

        if(intervals.size() < 2) return intervals;

        List<List<Integer>> res = new ArrayList<>();

//        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
        Collections.sort(intervals, Comparator.comparingInt(x -> x.get(0)));

        int start = intervals.get(0).get(0);
        int end = intervals.get(0).get(1);

        for(int i = 1 ; i < intervals.size() ; i++) {
            List<Integer> interval = intervals.get(i);

            // check if the intervals overlap by comparing the previous end and next start
            if(interval.get(0) <= end) { // meaning the intervals overlap
                end = Math.max(end, interval.get(1));
            } else { // interval don't overlap, so create the merged interval and reset start and end to next interval
                res.add(Arrays.asList(start, end));
                start = interval.get(0);
                end = interval.get(1);
            }
        }

        res.add(Arrays.asList(start, end));

        return res;

    }

    public static int[][] mergedIntervals(int[][] intervals) {

        if(intervals.length < 2) return intervals;

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
//        Collections.sort(intervals, Comparator.comparingInt(x -> x.[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1 ; i < intervals.length ; i++) {
            int[] interval = intervals[i];

            // check if the intervals overlap by comparing the previous end and next start
            if(interval[0] <= end) { // meaning the intervals overlap
                end = Math.max(end, interval[1]);
            } else { // interval don't overlap, so create the merged interval and reset start and end to next interval
                res.add(Arrays.asList(start, end));
                start = interval[0];
                end = interval[1];
            }
        }

        res.add(Arrays.asList(start, end));

        int[][] answer = new int[res.size()][2];
        Iterator<List<Integer>> iterator = res.iterator();
        int i = 0;
        while(iterator.hasNext()) {
            List<Integer> mergedInterval = iterator.next();
            answer[i++] = new int[]{mergedInterval.get(0), mergedInterval.get(1)};
        }

        return answer;
    }
}
