package diceGame;

public class Main {

    public static void main(final String[] args) {

        // initialize players
        final Player player1 = new Player();
        final Player player2 = new Player();
        final DiceCup shake = new DiceCup();

        while (player1.getPoint() < 40 && player2.getPoint() < 40) {

            //----------PLAYER 1 ------------------
            System.out.println("---------------------------------------------------------");
            System.out.println("Spiller 1:\n");
            shake.throwDice();
            System.out.println(shake.toStringOutcome());

            if (!shake.checkIfEqual()) {
                shake.sumFace();
                player1.sumPoint(shake.getSum());
                System.out.println(player1.toStringScore());
            } else {
                //checks for two ones
                if (shake.checkIfDoubleOne()) {
                    System.out.println(player1.toStringTooBad());
                    player1.startOver(true);
                    System.out.println(player1.toStringScore());
                } else if (shake.checkIfDoubleSix()) {

                    //The loop checks for two sixes, and grants the player an extra turn
                    //The outcome of an extra turn is evaluated in the loop.
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
                } else {
                    shake.sumFace();
                    player1.sumPoint(shake.getSum());
                    System.out.println(player1.toStringScore());
                }

            }

            //Checks if player 1 has reached 40 points, if so, the loop breaks.
            //if not, player 2 gets a turn
            if (player1.getPoint() >= 40)
                break;
            else{

                //----------PLAYER 2------------------
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
                            player2.startOver(true);
                            System.out.println(player2.toStringScore());
                            continue;
                        } else if(shake.checkIfDoubleSix()){
                           player2.sumPoint(40);
                           break;
                        }else {
                            shake.sumFace();
                            player2.sumPoint(shake.getSum());
                            System.out.println(player2.toStringScore());
                        }
                    } shake.sumFace();

                } else {
                    shake.sumFace();
                    player2.sumPoint(shake.getSum());
                    System.out.println(player2.toStringScore());
                }

              }
            }

        }

        //Checks for the winning player and congratulates
        if(player1.getPoint() >= 40)
            System.out.println(player1.toStringWinner("Spiller 1"));
        else
            System.out.println(player2.toStringWinner("Spiller 2"));
    }
}



