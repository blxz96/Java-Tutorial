/**
 * EnumsMain
 */
public class EnumsMain {

    public static void main(String[] args) {
        EnumsLevel lvl = EnumsLevel.LOW;

        System.out.println("===Testing for getting values===");
        System.out.println(EnumsLevel.values());
        
        System.out.println("===Testing for getting values===");
        EnumsLevel[] arr = EnumsLevel.values();
        for (EnumsLevel i : arr) {
            System.out.println(i);
        }

        System.out.println("===Testing for the level===");
        if (lvl == EnumsLevel.LOW){
            System.out.println(lvl);
        }
        else if (lvl == EnumsLevel.MEDIUM){
            System.out.println(lvl);
        }
        else{
            System.out.println(lvl);
        }

        System.out.println("===Testing for the respective level int===");
        System.out.println(lvl.getLvl());

        System.out.println("===Testing for value of respective level===");
        System.out.println(EnumsLevel.valueOf("HIGH"));
    }
}