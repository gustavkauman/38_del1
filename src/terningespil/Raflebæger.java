package terningespil;

public class Raflebæger {

    // Variable
    private Terning t1, t2;
    private int udfald1, udfald2, sum;

    // Kontruktør. Laver to terninger.
    public Raflebæger() {
        t1 = new Terning();
        t2 = new Terning();
    }

    // Metoder. Slår de to terninger, med metoden "roll" fra "Terning"-klassen.
    public void slåTerninger() {
        udfald1 = t1.roll();
        udfald2 = t2.roll();
    }

    //lægger de to facevalues sammen og gemmer dem som sum
    public int sumFace(){
         sum=udfald1+udfald2;
         return sum;
    }

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
}
