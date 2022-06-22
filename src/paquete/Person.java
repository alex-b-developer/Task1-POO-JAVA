package paquete;
import java.util.Date;

public class Person {
    String name;
    String lastName1;
    String lastName2;
    Date dateBirth;
    float height;

    public Person(String name, String lastName1, String lastName2, Date date){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = date;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setLastName1(String lastName1){
        this.lastName1 = lastName1;
    }

    public String getLastName1(){
        return this.lastName1;
    }

    public void setLastName2(String lastName2){
        this.lastName2 = lastName2;
    }

    public String getLastName2(){
        return this.lastName2;
    }

    public void setDateBirth(Date date){
        this.dateBirth = date;
    }

    public Date getDateBirth(){
        return this.dateBirth;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float getHeight(){
        return this.height;
    }
}
