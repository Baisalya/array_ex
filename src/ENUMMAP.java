import java.util.EnumMap;
import java.util.Map;

enum Months {January,February,March,April,May,June,July,August,September,October,November,December}
public class ENUMMAP {
    public static void main(String[] args) {
        EnumMap<Months,Integer>yr=new EnumMap<Months, Integer>(Months.class);
        yr.put(Months.January,1);
        yr.put(Months.February,2);
        yr.put(Months.March,3);
        yr.put(Months.April,4);
        yr.put(Months.May,5);
        yr.put(Months.June,6);
        yr.put(Months.July,7);
        yr.put(Months.August,8);
        yr.put(Months.September,9);
        yr.put(Months.October,10);
        yr.put(Months.November,11);
        yr.put(Months.December,12);
        yr.put(Months.January,1);
        System.out.println(yr);
        for (Map.Entry ns:yr.entrySet()) {
            System.out.println(ns.getValue()+" "+ns.getKey());

        }

    }
}
