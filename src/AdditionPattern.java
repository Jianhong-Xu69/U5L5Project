public class AdditionPattern {

    private int originalNumber;
    private int currentPatternNumber;
    private int patternScreamer;

    public AdditionPattern(int cpn, int ps) {
        originalNumber = cpn;
        patternScreamer = ps;
        currentPatternNumber = originalNumber;
    }

    public void next() {
        currentPatternNumber += patternScreamer;
    }

    public void prev() {
        if (currentPatternNumber > originalNumber) {
            currentPatternNumber -= patternScreamer;
        }
    }

    public int currentNumber() {
        return currentPatternNumber;
    }
}
