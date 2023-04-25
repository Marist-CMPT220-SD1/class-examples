package smart;

public class Oven implements Observer {

    private boolean ovenStatus;

    public Oven() {

        ovenStatus = false;

    }

    public void onNotify(KnockPattern pattern) {

        if (pattern == KnockPattern.MOSTLY_PAUSES) {

            setOven();

        }

    }

    public void setOven() {

        ovenStatus = !ovenStatus;
        if (ovenStatus) {

            System.out.println("The oven is preheating.");

        } else {

            System.out.println("The oven preheating is cancelled");

        }
    }
}