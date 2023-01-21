package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int greate = 1;
        if (first == 0) {
            greate = second;
        } else {
            for (int i = 1; i <= first; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    greate = i;
                }
            }
        }
        System.out.println(greate);
    }
}
