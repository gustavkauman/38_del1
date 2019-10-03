package terningespil;

public class Spiller{

    //instance var. (attributter)

    private int point;

    //Konstruktør
    public Spiller(){
    }


    //tager sum fra raflebæger og ligger til samlede point
    public void addPoint(int sum){
        point += sum;
    }

    public int getPoint() {
        return point;
    }

    //metode til at starte spiller fra 0 hvis spiller slår to ettere
    public void startForfra(boolean input){
        if(input == true)
            point = 0;
    }
}

