package diceGame;

public class Main {

    public static void main(final String[] args) {

        // initialze players
        final Player player1 = new Player();
        final Player player2 = new Player();
        final DiceCup shake = new DiceCup();

        while (player1.getPoint() < 40 && player2.getPoint() < 40) {

            //----------SPILLER 1 ------------------
            System.out.println("---------------------------------------------------------");
            System.out.println("Spiller 1:\n");
            shake.throwDice();
            System.out.println(shake.toStringOutcome());

            if (!shake.checkIfEqual()) {
                shake.sumFace();
                player1.sumPoint(shake.getSum());
                System.out.println(player1.toStringScore());
            } else {
                //tjekker om der er slået to ettere
                if (shake.checkIfDoubleOne()) {
                    System.out.println(player1.toStringTooBad());
                    player1.startOver(true);
                    System.out.println(player1.toStringScore());
                } else if (shake.checkIfDoubleSix()) {

                    // Loopet tjekker om der er slået to seksere. I givet fal, skal spilleren have en ekstra tur.
                    // Udfaldet af den ekstra tur, evalueres også i loopet.
                    while (shake.checkIfDoubleSix()) {
                        shake.sumFace();
                        player1.sumPoint(shake.getSum());
                        System.out.println(player1.toStringScore());
                        System.out.println(player1.toStringExtra());
                        shake.throwDice();
                        System.out.println(shake.toStringOutcome());
                        if (shake.checkIfDoubleOne()) {
                            System.out.println(player1.toStringTooBad());
                            player1.startOver(true);
                            System.out.println(player1.toStringScore());
                            continue;
                        } else {
                            shake.sumFace();
                            player1.sumPoint(shake.getSum());
                            System.out.println(player1.toStringScore());
                        }
                        shake.sumFace();
                    }
                } else {
                    shake.sumFace();
                    player1.sumPoint(shake.getSum());
                    System.out.println(player1.toStringScore());
                }

            }

            //----------SPILLER 2 ------------------
            System.out.println("---------------------------------------------------------");
            System.out.println("Spiller 2:\n");
            shake.throwDice();
            System.out.println(shake.toStringOutcome());

            if (!shake.checkIfEqual()) {
                shake.sumFace();
                player2.sumPoint(shake.getSum());
                System.out.println(player2.toStringScore());
            } else {
                if (shake.checkIfDoubleOne()) {
                    System.out.println(player2.toStringTooBad());
                    player2.startOver(true);
                    System.out.println(player2.toStringScore());
                } else if (shake.checkIfDoubleSix()) {
                    while (shake.checkIfDoubleSix()) {
                        shake.sumFace();
                        player2.sumPoint(shake.getSum());
                        System.out.println(player2.toStringScore());
                        System.out.println(player2.toStringExtra());
                        shake.throwDice();
                        System.out.println(shake.toStringOutcome());
                        if (shake.checkIfDoubleOne()) {
                            System.out.println(player2.toStringTooBad());
                            player1.startOver(true);
                            System.out.println(player2.toStringScore());
                            continue;
                        } else {
                            shake.sumFace();
                            player2.sumPoint(shake.getSum());
                            System.out.println(player2.toStringScore());
                        }
                        shake.sumFace();
                    }

                } else {
                    shake.sumFace();
                    player2.sumPoint(shake.getSum());
                    System.out.println(player2.toStringScore());
                }

            }

        }
    }
}



