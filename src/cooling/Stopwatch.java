package cooling;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch() {
        reset(); // TODO is this best or should we leave these uninitialized to start?
    }

    public long read() {
        // TODO revisit this and consider a more robust implementation
        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public void reset() {
        // TODO revisit this and consider if we need to do anything else
        startTime = endTime = 0;
    }

    public void start() {
        // TODO revisit this and consider if we need to do anything else
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        // TODO revisit this and consider if we need to do anything else
        endTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        // TODO create an instance of cooling.Stopwatch and test its operations
        Stopwatch stoppie = new Stopwatch();

        stoppie.start();
        pauseFor(3000);
        stoppie.stop();

        System.out.println(stoppie.read());
    }

    public static void pauseFor(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exc) {
            System.err.println("This should not happen in a single-threaded program.");
        }
    }
}
