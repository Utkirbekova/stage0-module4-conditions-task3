package school.mjc.stage0.conditions.task3;
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
