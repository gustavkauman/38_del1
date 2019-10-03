package terningespil;
import java.util.Random;

public class Terning {

    //Intance var.
    final int maxval=6; // max øjne værdi
    int faceValue;      //nuværende æjne værdi



    //kontruktør
    public Terning(){

    }

    // genererer tilfældig værdi mellem 1 og 6, samt retunerer denne værdi.
    public int roll(){

        faceValue = (int)(Math.random()*maxval) + 1;

        return faceValue;

    }



    // henter den nuværende værdi af facevalue
    public int getFaceValue(){

        return faceValue;

    }
    // Sætter værdien af facevalue
    public void setFaceValue(int value){
        faceValue = value;
    }

    // returner en streng, hvor man kan se terningens værdi
    public String toString(){

        String result = "øjne: " + faceValue;
        return result;
    }



}
