public class FrontDoor {
    public static void main(String[] args) {
        AdditionPattern test = new AdditionPattern(2,3);
        System.out.println(test.currentNumber());
        test.next();
        test.next();
        System.out.println(test.currentNumber());
        for (int i = 0; i < 5; i++) {
            test.prev();
        }
        System.out.println(test.currentNumber());
    }
}
