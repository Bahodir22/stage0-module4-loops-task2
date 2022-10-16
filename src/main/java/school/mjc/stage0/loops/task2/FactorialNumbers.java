package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int p=1, i=0;
        while (printToInclusive>i){
            i++;
            p *= i;
            System.out.println(p);
        }
    }
}
