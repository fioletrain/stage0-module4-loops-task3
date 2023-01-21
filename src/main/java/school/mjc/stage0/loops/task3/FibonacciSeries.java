package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        System.out.println(first);
        if(lastFibonacci > 0){
            for(int i = 1; i < lastFibonacci; i++){
                System.out.println(first + second);
                int a = first;
                first = first + second;
                second = a;
            }
        }
    }
}
