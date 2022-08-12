package school.mjc.stage0.conditions.task3;
//1   2   3   4 5   6   7   8   9 10 11 12
//y1 f28 mr1 a0 m1 jn0 jl1 av1 s0 o1 n0 d1
public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(month>=1&&month<=12){
            if(((month<8&&month%2!=0))||(month>=8&&month%2==0))
                System.out.println(31);
            if(((month<8&&month%2==0&&month!=2))||(month>8&&month%2!=0))
                System.out.println(30);
            if(month==2)
                System.out.println(28);}
        else
            System.out.println("wrong number!");
    }
}
