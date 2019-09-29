import terningespil.Spiller;
import terningespil.Terning;

public class Main{

    public static void main(String[] args) {

        Spiller gamer = new Spiller();
        Spiller gamer2 = new Spiller();
            Terning dice = new Terning();
            dice.Roll();
            Terning dice2 = new Terning();
            dice2.Roll();
        System.out.println(dice.toString());
        System.out.println(dice2.toString());

        System.out.println("sum gamer1: "+gamer.Point(dice.Roll(), dice2.Roll()));






    }





}