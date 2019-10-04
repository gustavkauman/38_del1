package diceGame;

public class Player {

    //instance var. (attributes)

    private int point;

    //Constructor
    public Player() {
    }


    //adds sum of facevalues to players points
    public void sumPoint(final int sum) {
        point += sum;
    }

    public int getPoint() {
        return point;
    }

    //resets a players points if player rolls two ones
    public void startOver(final boolean input) {
        if (input)
            point = 0;
    }

    //returns a string that tells the players score
    public String toStringScore() {

        return "Score: " + point;
    }

    //returns a string that congratulates player
    public String toStringWinner(final String player) {

        return "Tillykke " + player + ". Du har vundet!";
    }

    //returns a string that informs a player when his points are lost
    public String toStringTooBad() {

        return "Desværre!. Du slog to ettere og mister alle dine point";
    }

    //returns a string for a player who gets an extra roll
    public String toStringExtra() {

        return "Du slog to seksere!. Du får et ekstra slag\n";
    }

}

