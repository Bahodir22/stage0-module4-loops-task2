package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i=1, k=0;
        while (i<=printToInclusive){
            if (printToInclusive % i==0 && k<3){
                System.out.println(i);
            }
            i++;
            k++;
        }
    }
}
