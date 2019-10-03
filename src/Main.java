import sun.security.provider.ConfigFile;
import terningespil.Raflebæger;
import terningespil.Spiller;
import terningespil.Terning;

public class Main {

    public static void main(String[] args) {

        Spiller gamer1 = new Spiller();
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

        // Noget er galt her
        System.out.println(raflebæger.toString());


        while (gamer1.getPoint() < 40 && gamer2.getPoint() < 40) {
            raflebæger.slåTerninger();

            //If statements til at skifte ture
            if (raflebæger.skiftTur()) {
                gamer1.addPoint(raflebæger.getSum());

                System.out.println("Gamer 1: " + gamer1.getPoint());

            } else {
                gamer2.addPoint(raflebæger.getSum());

                System.out.println("Gamer 2: " + gamer2.getPoint());
            }

            // If-Statements til at vurdere dobbelt-facevalues
            if (raflebæger.tjekOmEns()) {
                System.out.println("Du får en ekstra tur!");
            }
            if (raflebæger.tjekOmToEttere()) {
                System.out.println("Du skal starte forfra");
            }
        }

        // Mangler at være i stand til at give ekstra ture og starte turene forfra

        


    }
}