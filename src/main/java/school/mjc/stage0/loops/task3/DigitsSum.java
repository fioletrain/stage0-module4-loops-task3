package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String s = t + "";
        int sum = 0;
        if (t >= 0) {
            for (int i = 0; i < s.length(); i++) {
                int num = s.charAt(i) - '0';
                sum = sum + num;
            }
        } else {
            for (int i = 1; i < s.length(); i++) {
                int num = s.charAt(i) - '0';
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }
}