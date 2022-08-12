package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if ((1 <= month && month <= 2) || (month == 12)) {
            System.out.println("winter");
        } else if (3 <= month && month <= 5) {
            System.out.println("spring");
        } else if (6 <= month && month <= 8) {
            System.out.println("summer");

        } else if (9 <= month && month <= 11) {
            System.out.println("autumn");
        } else System.out.println("wrong number!");

    }
}
