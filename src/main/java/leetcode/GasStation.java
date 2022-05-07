package leetcode;

public class GasStation {

    private static int canCompleteCircuit(int[] gas, int[] cost) {

        int len = gas.length;
        int total = 0, curFuel = 0, startIndex = 0;

        for(int i = 0 ; i < len ; i++) {
            total += (gas[i] - cost[i]);
            curFuel += gas[i] - cost[i];
            if(curFuel < 0) {
               startIndex = i + 1;
               curFuel = 0;
            }
        }

        return total < 0 ? -1 : startIndex;

    }
}
