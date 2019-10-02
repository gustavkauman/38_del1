import terningespil.Raflebæger;
import terningespil.Spiller;
import terningespil.Terning;

public class Main {

    public static void main(String[] args) {

        Spiller gamer = new Spiller();
        Spiller gamer2 = new Spiller();
//        Terning dice = new Terning();
//        dice.roll();
//        Terning dice2 = new Terning();
//        dice2.roll();
//        System.out.println(dice.toString());
//        System.out.println(dice2.toString());
//
//        System.out.println("sum gamer1: "+gamer.SumFace(dice.roll(), dice2.roll()));

        Raflebæger raflebæger = new Raflebæger();
        raflebæger.slåTerninger();

        System.out.println(raflebæger.resaltatUdprint());


        if (raflebæger.tjekOmEns()) {
            System.out.println("Du får en ekstra tur!");
        }

        if (raflebæger.tjekOmToEttere()) {
            System.out.println("Du skal starte forfra");
        }

        


    }
}