package smart;

public class Curtains implements Observer {
    private boolean isOpen = false;

    private void open() {
        isOpen = true;
        System.out.println("Open's curtains.");
    }

    private void close() {
        isOpen = false;
        System.out.println("Closing curtains.");
    }

    @Override
    public void onNotify(KnockPattern pattern) {
        if (pattern == KnockPattern.MOSTLY_KNOCKS) {
            System.out.println("MOSTLY_KNOCKS pattern");
            if (isOpen) {
                close();
            } else {
                open();
            }
        }
    }
}
