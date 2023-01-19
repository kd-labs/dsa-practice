package leetcode;

import java.util.*;

public class ExclusiveTimeOfFunctions {

    public static void main(String[] args) {

        int n = 2;
//        List<String> logs = Arrays.asList("0:start:0","1:start:2","1:end:5","0:end:6");
        List<String> logs = Arrays.asList("0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7");
//        List<String> logs = Arrays.asList("0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7");

        int[] executionTime = exclusiveTime(2, logs);

        for (int i : executionTime) {
            System.out.println(i);
        }

    }

    /**
     *  Similar : Check if paranthesis is balanced or not
     *  Approach : Using stack
     */

    public static int[] exclusiveTime(int n, List<String> logs) {

        int[] res = new int[n];
        Deque<Log> stack = new ArrayDeque();

        // Loop over each log
        for(String log : logs) {

            // convert string log to 'Log' class object
            Log fnLog = new Log(log);

            // if log is function start, then push in stack
            if(fnLog.isStart) {
                stack.push(fnLog);
            } else {

//        List<String> logs = Arrays.asList("0:start:0","1:start:2","1:end:5","0:end:6");
//                List<String> logs = Arrays.asList("0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7");
//        List<String> logs = Arrays.asList("0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7");
//        List<String> logs = Arrays.asList("0:start:0","0:end:0","1:start:1","1:end:1","2:start:2","2:end:2","2:start:3","2:end:3");

                // log is function end, so pop the TOS which will be func start of same function
                Log pop = stack.pop();

                // calculate duration of func
                int duration = fnLog.time - pop.time + 1 + pop.subduration;
//                res[pop.id] = fnLog.time - pop.time + 1 + pop.subduration;
                if(!stack.isEmpty()) { // meaning there is wrapper function, calling this function
                    if(stack.peek().id != pop.id) {
                        // if calling wrapper function is different than called function, then
                        // set the subduration of wrapper function to -duraton
                        stack.peek().subduration = -duration;
                    }
                    res[pop.id] = duration;
                } else { // this function is not called by wrapper function, so no need to set subduration
                    res[pop.id] += duration;
                }
            }
        }

        return res;
    }

    static class Log {
        int id;
        boolean isStart;
        int time;
        int subduration;

        public Log(String log){
            String[] content = log.split(":");
            this.id = Integer.parseInt(content[0]);
            this.isStart = content[1].equals("start") ? true : false;
            this.time = Integer.parseInt(content[2]);
            this.subduration = 0;
        }
    }
}
