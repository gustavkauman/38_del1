package terningespil;

public class Player {

    //instance var. (attributter)

    private int point;

    //Konstruktør
    public Player() {
    }


    //tager sum fra raflebæger og ligger til samlede point
    public void sumPoint(final int sum) {
        point += sum;
    }

    public int getPoint() {
        return point;
    }

    //metode til at starte spiller fra 0 hvis spiller slår to ettere
    public void startOver(final boolean input) {
        if (input)
            point = 0;
    }

    // retunerer en string, der angiver spillerens nuværende score (point)
    public String toStringScore() {

        return "Score: " + point;
    }

    // retunerer en string, der ønsker tillykke med sejren. spilleren der har vundet skal angives som argument i metoden
    public String toStringWinner(final String player) {

        return "Tillykke " + player + ". Du har vundet!";
    }

    // retunerer en string, der informerer spilleren der har slået to ettere om, at alle point er mistet.
    public String toStringTooBad() {

        return "Desværre!. Du slog to ettere og mister alle dine point";
    }

    // retunrer en string, der informerer spilleren om at han/hun/hen, har slået to ens og dermed får et ekstra slag
    public String toStringExtra() {

        return "Du slog to seksere!. Du får et ekstra slag\n";
    }

}

