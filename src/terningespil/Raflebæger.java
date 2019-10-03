package terningespil;

public class Raflebæger {

    // Variable
    private Terning t1, t2;
    private int udfald1, udfald2, sum, tur;

    // Kontruktør. Laver to terninger.
    public Raflebæger() {
        t1 = new Terning();
        t2 = new Terning();
    }

    // Metoder. Slår de to terninger, med metoden "roll" fra "Terning"-klassen.
    public void slåTerninger() {
        udfald1 = t1.roll();
        udfald2 = t2.roll();
        this.sum = udfald1 + udfald2;
        this.tur++;
    }

    // Getter til summen
    public int getSum() {
        return sum;
    }

    // Returnere en tekst med værdien af terningernes rul.
    public String toString() {
        return "Terning 1: " + udfald1 + "\n" + "Terning 2: " + udfald2 + "\n";
    }

    // Tjekker om der er slået to ens værdier. Returnere boolean.
    public boolean tjekOmEns() {
        return (udfald1 == udfald2);
    }

    //Tjekker om terningerne har slået to ettere. Returnere boolean.
    public boolean tjekOmToEttere() {
        return (udfald1 == 1 && udfald2 == 1);
    }

    //Metode der tæller ture
    public boolean skiftTur() {
        if (tur%2 == 0) {
            return true;
        }

        return false;
    }
}
