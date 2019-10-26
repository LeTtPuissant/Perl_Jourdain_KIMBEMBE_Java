package fr.schoolgestion.dst;

import java.util.ArrayList;
import java.util.List;
public class Teacher extends Nobody {
    private String Teacher;
    private ArrayList<String> courses;
    public Teacher(String name, Integer age, ArrayList<String> courses) {
        super.name= name;
        super.age=age;
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    public String getTeacher() {
        return Teacher;
    }

    public void ShowTeacher(){
        System.out.print("My name is"+getName()+"I am "+ getStatus()+" "+"I have " + getAge() + " "+"years old ");
    }
}
