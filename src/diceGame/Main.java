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
                } else {

                    // Loopet tjekker om der er slået to seksere. I givet fal, skal spilleren have en ekstra tur.
                    // Udfaldet af den ekstra tur, evalueres også i loopet.
                    while (shake.checkIfEqual()) {
                        shake.sumFace();
                        player1.sumPoint(shake.getSum());
                        System.out.println(player1.toStringScore());
                        System.out.println(player1.toStringExtra());
                        shake.throwDice();
                        System.out.println(shake.toStringOutcome());

                        if (shake.checkIfEqualNotOneSix()) {
                            continue;

                        } else if (shake.checkIfDoubleOne()) {
                            System.out.println(player1.toStringTooBad());
                            player1.startOver(true);
                            System.out.println(player1.toStringScore());
                            break;
                        } else if (shake.checkIfDoubleSix()){
                           player1.sumPoint(40);
                           break;

                        }else{
                            shake.sumFace();
                            player1.sumPoint(shake.getSum());
                            System.out.println(player1.toStringScore());
                        }
                        shake.sumFace();
                    }
                }

            }
            // Tjekker om spiller 1 har opnået 40 point. hvis dette er tilfældet breaker man ud af loopet,
            // ellers forsætter turen med spiller 2.
            if (player1.getPoint() >= 40)
                break;
            else{

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
                } else {
                    while (shake.checkIfEqual()) {
                        shake.sumFace();
                        player2.sumPoint(shake.getSum());
                        System.out.println(player2.toStringScore());
                        System.out.println(player2.toStringExtra());
                        shake.throwDice();
                        System.out.println(shake.toStringOutcome());

                        if (shake.checkIfEqualNotOneSix()) {
                            continue;

                        }else if (shake.checkIfDoubleOne()) {
                            System.out.println(player2.toStringTooBad());
                            player2.startOver(true);
                            System.out.println(player2.toStringScore());
                            break;
                        } else if(shake.checkIfDoubleSix()){
                           player2.sumPoint(40);
                           break;
                        }else {
                            shake.sumFace();
                            player2.sumPoint(shake.getSum());
                            System.out.println(player2.toStringScore());
                        }
                    } shake.sumFace();
                }
              }
            }
        }

        // Tjekker hvilken spiller der har vundet og skriver en løkkeønskning
        if(player1.getPoint() >= 40)
            System.out.println(player1.toStringWinner("Spiller 1"));
        else
            System.out.println(player2.toStringWinner("Spiller 2"));
    }
}



