package diceGame;

public class Dice {

    //Intance var.
    final int maxval = 6; // max value
    int faceValue;      //current value


    //constructor
    public Dice() {

    }


    //generates random value between 1 and 6 and returns that value
    public int roll() {

        faceValue = (int) (Math.random() * maxval) + 1;

        return faceValue;

    }

}
