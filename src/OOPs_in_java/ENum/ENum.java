package OOPs_in_java.ENum;

public class ENum {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        Day monday = Day.MONDAY;
        System.out.println(monday.ordinal());
        System.out.println(monday.name());

        Day[] day = Day.values();
        for(Day d:day){
            d.display();
        }
    }
}
