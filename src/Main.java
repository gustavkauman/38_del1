import terningespil.Raflebæger;
import terningespil.Spiller;
import terningespil.Terning;

public class Main {

    public static void main(String[] args) {

        Spiller spiller1 = new Spiller();
        Spiller spiller2 = new Spiller();
        Raflebæger rafle = new Raflebæger();

        while (spiller1.getPoint() < 40 && spiller2.getPoint() < 40) {

            //----------SPILLER 1 ------------------
            System.out.println("---------------------------------------------------------");
            System.out.println("Spiller 1:\n");
            rafle.slåTerninger();
            System.out.println(rafle.toString());

            if(!rafle.tjekOmEns()) {
                rafle.sumFace();
                spiller1.sumPoint(rafle.getSum());
                System.out.println(spiller1.toString());
            }else{
                    //tjekker om der er slået to ettere
                    if (rafle.tjekOmToEttere()) {
                        System.out.println(spiller1.toStringTooBad());
                        spiller1.startForfra(true);
                        System.out.println(spiller1.toString());
                    } else if (rafle.tjekOmToSeks()) {

                        // Loopet tjekker om der er slået to seksere. I givet fal, skal spilleren have en ekstra tur.
                        // Udfaldet af den ekstra tur, evalueres også i loopet.
                        while (rafle.tjekOmToSeks()) {
                            rafle.sumFace();
                            spiller1.sumPoint(rafle.getSum());
                            System.out.println(spiller1.toString());
                            System.out.println(spiller1.toStringExtra());
                            rafle.slåTerninger();
                            System.out.println(rafle.toString());
                            if (rafle.tjekOmToEttere()) {
                                System.out.println(spiller1.toStringTooBad());
                                spiller1.startForfra(true);
                                System.out.println(spiller1.toString());
                                continue;
                            }else{
                                rafle.sumFace();
                                spiller1.sumPoint(rafle.getSum());
                                System.out.println(spiller1.toString());
                            }
                            rafle.sumFace();
                        }
                    }else{
                        rafle.sumFace();
                        spiller1.sumPoint(rafle.getSum());
                        System.out.println(spiller1.toString());
                    }

            }

            //----------SPILLER 2 ------------------
            System.out.println("---------------------------------------------------------");
            System.out.println("Spiller 2:\n");
            rafle.slåTerninger();
            System.out.println(rafle.toString());

            if(!rafle.tjekOmEns()) {
                rafle.sumFace();
                spiller2.sumPoint(rafle.getSum());
                System.out.println(spiller2.toString());
            }else{
                if (rafle.tjekOmToEttere()) {
                    System.out.println(spiller2.toStringTooBad());
                    spiller2.startForfra(true);
                    System.out.println(spiller2.toString());
                } else if (rafle.tjekOmToSeks()) {
                        while (rafle.tjekOmToSeks()){
                             rafle.sumFace();
                             spiller2.sumPoint(rafle.getSum());
                             System.out.println(spiller2.toString());
                             System.out.println(spiller2.toStringExtra());
                             rafle.slåTerninger();
                             System.out.println(rafle.toString());
                             if (rafle.tjekOmToEttere()) {
                             System.out.println(spiller2.toStringTooBad());
                             spiller1.startForfra(true);
                             System.out.println(spiller2.toString());
                             continue;
                        }else{
                            rafle.sumFace();
                            spiller2.sumPoint(rafle.getSum());
                            System.out.println(spiller2.toString());
                        }
                        rafle.sumFace();
                      }

                }else{
                    rafle.sumFace();
                    spiller2.sumPoint(rafle.getSum());
                    System.out.println(spiller2.toString());
                }

            }

        }
    }
}



