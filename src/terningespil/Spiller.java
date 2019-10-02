package terningespil;

public class Spiller{

    //instance var. (arrtributter)
    private int point;

    //Kontruktør
    public Spiller(){

    }

    //Retunerer summen af argumenterne
    public int SumFace(int val1, int val2){

        point = val1 + val2;

        return point;
    }


}

