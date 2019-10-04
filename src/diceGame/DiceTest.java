package diceGame;

public class DiceTest {
    Dice dice = new Dice();

    public static void main(final String[] args) {
        final DiceTest diceTest = new DiceTest();
        diceTest.testOutput();
    }

    private void testOutput() {
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, error = 0;

        for (int i = 0; i <= 1000; i++) {
            dice.roll();
            switch (dice.faceValue) {
                case 1:
                    a++;
                    break;
                case 2:
                    b++;
                    break;
                case 3:
                    c++;
                    break;
                case 4:
                    d++;
                    break;
                case 5:
                    e++;
                    break;
                case 6:
                    f++;
                    break;
                default:
                    error++;
                    break;
            }
        }
        System.out.println("Number of 1's: " + a + " (" + (((double) a / 1000 ) * 100) + "%)");
        System.out.println("Number of 2's: " + b + " (" + (((double) b / 1000 ) * 100) + "%)");
        System.out.println("Number of 3's: " + c + " (" + (((double) c / 1000 ) * 100) + "%)");
        System.out.println("Number of 4's: " + d + " (" + (((double) d / 1000 ) * 100) + "%)");
        System.out.println("Number of 5's: " + e + " (" + (((double) e / 1000 ) * 100) + "%)");
        System.out.println("Number of 6's: " + f + " (" + (((double) f / 1000 ) * 100) + "%)");
        System.out.println("Number of errors: " + error + " (" + (((double) error / 1000 ) * 100) + "%)");
    }
}
