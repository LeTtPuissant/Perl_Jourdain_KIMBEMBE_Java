package fr.schoolgestion.dst;
import java.util.ArrayList;
import java.util.List;
// class Student from Nobody
public class Student extends Nobody {
    private String Student;
    private ArrayList<Double> note;
    public Student(String name, Integer age, String status, ArrayList<Double> note){
        super.age= age;
        super.name= name;
        super.status=status;
        this.note=note;

    }
// creation of getters
    public ArrayList getNote() {

        return note;
    }
// method override
    @Override
    public String getStatus() {
        return super.getStatus();
    }

    public String getStudent() {
        return Student;
    }
// method ShowStudent
    public void ShowStudent(){
        System.out.print("My name is "+getName()+" I am "+ getStatus()+" "+"I have " + getAge() + " "+"years old " + "My note" +getNote());

    }
}
