package terningespil;

public class Dice {

    //Intance var.
    final int maxval = 6; // max øjne værdi
    int faceValue;      //nuværende æjne værdi


    //kontruktør
    public Dice() {

    }

    // genererer tilfældig værdi mellem 1 og 6, samt retunerer denne værdi.
    public int roll() {

        faceValue = (int) (Math.random() * maxval) + 1;

        return faceValue;

    }

}
