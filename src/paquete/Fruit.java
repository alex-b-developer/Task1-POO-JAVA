package paquete;
import java.util.ArrayList;

public class Fruit {

    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    public Fruit() {
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setColors(ArrayList<String> colors){
        this.colors = colors;
    }

    public ArrayList<String> getColors(){
        return this.colors;
    }

    public void setAverageWeight(float averageWeight){
        this.averageWeight = averageWeight;
    }

    public float getAverageWeight(){
        return this.averageWeight;
    }

}
