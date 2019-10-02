package terningespil;

public class Spiller{

    //instance var. (attributter)

    private int point, sumpoint;

    //Konstruktør
    public Spiller(){


    }

    public int Point(int a, int b){

        point = a + b;

        return point;
    }

    public int getSumpoint() {
        return sumpoint;
    }

}

