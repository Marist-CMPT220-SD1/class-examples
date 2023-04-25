package smart;
import java.util.Scanner;

public class Home {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Oven Oven = new Oven();
        Countertop Countertop = new Countertop();
        Lighting Lighting = new Lighting();
        Curtains Curtains = new Curtains();
        KnockQueue knocking = new KnockQueue();
        int knock = -1;

        Countertop.subscribe(Lighting);
        Countertop.subscribe(Curtains);
        Countertop.subscribe(Oven);
        for (int i = 0; i < 5; i++) {
            System.out.println("INPUT A KNOCK:\n0 : No Knock\n1 : Light Knock\n2 : Hard Knock");
            knock = input.nextInt();
            if (knock == 0){
                knocking.addKnock(Knock.NONE);
            }
            else if (knock == 1){
                knocking.addKnock(Knock.WEAK);
            }
            else if (knock == 2){
                knocking.addKnock(Knock.MEDIUM);
            }
            else if (knock == 3){
                knocking.addKnock(Knock.STRONG);
            }
        }
        Countertop.notifySubscribers();
    }
}
