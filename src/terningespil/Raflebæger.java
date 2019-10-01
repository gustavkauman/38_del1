package terningespil;

public class Raflebæger {

    // Variable
    private Terning t1, t2;
    private int udfald1, udfald2;

    // Kontruktør
    public Raflebæger() {
        t1 = new Terning();
        t2 = new Terning();
    }

    // Metoder
    public void slåTerninger() {
        udfald1 = this.t1.roll();
        udfald2 = this.t2.roll();
    }

    public String resaltatUdprint() {
        return "Terning 1: " + udfald1 + " øjne\n" + "Terning 2: " + udfald2 + " øjne\n";
    }

    public boolean tjekOmEns() {
        if (udfald1 == udfald2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tjekOmToEttere() {
        if (udfald1 == 1 && udfald2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
