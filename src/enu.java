import java.util.EnumSet;

enum days{
    Sunday,Monday,Tuesday,Wednesday,Thurseday,Friday,Saturday
}
public class enu {
    public static void main(String[] args) {
        EnumSet<days> dy= EnumSet.allOf(days.class);
        System.out.println(dy);
    }
}
