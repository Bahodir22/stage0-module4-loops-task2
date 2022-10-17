package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i=0,p=1;
        while (power>i){
            p *= 2;
            System.out.println("2^"+power+"="+p);
            i++;
        }

    }
}
