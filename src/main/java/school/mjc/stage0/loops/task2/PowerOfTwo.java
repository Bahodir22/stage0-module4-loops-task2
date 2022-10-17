package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i=0,p=1;
        while (power>=i){
            System.out.println(p);
            p *= 2;
            i++;
        }
        if(power<0){
            System.out.println("too much power");
        }
    }
}
