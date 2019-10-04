package diceGame;

public class DiceCup {

    // Variables
    private final Dice t1;
    private final Dice t2;
    private int outcome1, outcome2, sum;

    // Constructor. Creates two dice
    public DiceCup() {
        t1 = new Dice();
        t2 = new Dice();
    }


    //Methods. Rolls the two dice with the method "roll" from "dice"-class
    public void throwDice() {
        outcome1 = t1.roll();
        outcome2 = t2.roll();
    }


    //Sum the two facevalues
    public int sumFace() {
        sum = outcome1 + outcome2;
        return sum;
    }

    public int getSum() {
        return sum;
    }

    // Returns string with value of the roll
    public String toStringOutcome() {
        return "Dice 1: " + outcome1 + "\n" + "Dice 2: " + outcome2 + "\n";
    }
  
    //Checks for two equal rolls, returns boolean
    public boolean checkIfEqualNotOneSix() {
        return (outcome1 == outcome2 && outcome1 != 1 && outcome1 != 6);
    }

    //Checks for two ones
    public boolean checkIfDoubleOne() {
        return (outcome1 == 1 && outcome2 == 1);
    }

    //Checks for two sixes
    public boolean checkIfDoubleSix() {
        return (outcome1 == 6 && outcome2 == 6);
    }

    public boolean checkIfEqual() {
        return (outcome1 == outcome2);
    }

    //

    // Sætter værdien af udfaldende til den ønskede værdi -------------HUSK AT SLETTE

    public void setUdfald(final int dice1, final int dice2) {

        outcome1 = dice1;
        outcome2 = dice2;

    }

}


