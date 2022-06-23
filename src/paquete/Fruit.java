package paquete;
import java.util.ArrayList;

/**
 * This is the Fruit Class
 * @author Alex Betancur
 */
public class Fruit {

    /**
     * attributes:
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;


    /**
     * this is the constructor
     */
    public Fruit() {
    }

    /**
     * methods:
     */
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
