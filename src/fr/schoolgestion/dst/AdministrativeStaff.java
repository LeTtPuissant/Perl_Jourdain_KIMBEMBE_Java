package fr.schoolgestion.dst;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;

public class AdministrativeStaff extends Nobody {
    private  String AdministrativeStaff;

    public AdministrativeStaff(String name, Integer age, String status){
        super.age= age;
        super.name= name;
        super.status= status;

    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    public String getAdministrativeStaff() {
        return AdministrativeStaff;
    }

    public void ShowAdministrativeStaff(){
        System.out.print("My name is "+getName()+" I am "+ getStatus()+" "+"I have " + getAge() + " "+"years old ");
    }
}
