package hw;

/**
 * Created by Serezha on 27.09.2016.
 */
public class HW06_HappyTickets {
    public static void main(String[] args) {

       /* 1. Счастливые билетики. Есть билеты с номерами от 000001 до 999999.
       «Счастливым» считается билетик у которого сумма первыхтрёх цифр номера равна сумме последних трёх цифр,
        как, например, в билетах с номерами 003102 или 567576.
        С помощью программы, подсчитайте сколько счастливых билетов.*/

        int leftSide = 0, rightSide = 0, happyTickets = 0;

        for (int x = 1; x <= 999999; x++) {
            if (x < 1000) continue;
            int ticket = x;
            for (int i = 1; i <= 3 && 1_000 < x && x < 10_000 || i <= 5 && 10_000 <= x && x < 100_000 || i <= 6 && 100_000 <= x; ++i) {
                if (i <= 3) {
                    rightSide += (ticket - (ticket /= 10) * 10);
                } else {
                    leftSide += (ticket - (ticket /= 10) * 10);
                }
            }
            if (x < 10_000) leftSide = ticket;
            if (leftSide == rightSide) {
                ++happyTickets;
            }
            //Debug
            //System.out.println(x);
            //System.out.print("   Left " + leftSide + "");
            //System.out.print("   Right " + rightSide + "\n");
            rightSide = 0;
            leftSide = 0;
        }
        System.out.println("Count happy tickets... Result = " + happyTickets);
    }
}
