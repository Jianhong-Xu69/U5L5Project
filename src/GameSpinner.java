public class GameSpinner {

    private int sections;
    private int lastSpin;
    private int spinTracker;

    public GameSpinner(int s) {
        sections = s;
        spinTracker = 0;
        lastSpin = 0;
    }

    public int spin() {
        int temp = (int) ((Math.random()*sections) + 1);
        if (temp == lastSpin) {
            spinTracker++;
        } else {
            lastSpin = temp;
            spinTracker = 1;
        }
        return temp;
    }

    public int currentRun() {
        return spinTracker;
    }
}
