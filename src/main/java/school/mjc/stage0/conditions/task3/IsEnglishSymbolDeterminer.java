package school.mjc.stage0.conditions.task3;
public class IsEnglishSymbolDeterminer {
    public static void main(String[] args) {
        isEnglishSymbol('m');
    }
    public static void isEnglishSymbol(char symbol) {
        if ('A'<=symbol&& symbol <= 'z')
            System.out.println("English");
        else
            System.out.println("Non English");


    }


}
