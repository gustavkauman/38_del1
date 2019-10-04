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
        System.out.println("Antal 1'ere: " + a);
        System.out.println("Antal 2'ere: " + b);
        System.out.println("Antal 3'ere: " + c);
        System.out.println("Antal 4'ere: " + d);
        System.out.println("Antal 5'ere: " + e);
        System.out.println("Antal 6'ere: " + f);
        System.out.println("Antal fejlkast: " + error);
    }
}
