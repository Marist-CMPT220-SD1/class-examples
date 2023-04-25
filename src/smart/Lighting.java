package smart;

public class Lighting implements Observer{
    private boolean isLightOn;
    public Lighting() {
        isLightOn = false;
    }

    public void onNotify(KnockPattern pattern) {
        if (pattern == KnockPattern.PALINDROME) {  //put the knock pattern/code instead of *** (E.G. PALIDROME)
            isLightOn = !isLightOn;
            if (isLightOn) {
                System.out.println("Light on");
            } else {
                System.out.println("Light off");
            }
        }
    }
}
