package fr.schoolgestion.dst;

public class Nobody {
    protected String name;
    protected Integer age;
    protected String status;

    public Nobody (){

    }
// surcharge constructor
    public Nobody(String name, Integer age, String status){
        this.name= name;
        this.age=age;
        this.status= status;
    }
/* // setter in commentaire
    public void setAge(Integer age) {
        this.age = age;
    }
*/
    public String getName() {
        return name;
    }
/*
    public void setName(String name) {
        this.name = name;
    }
*/
    public Integer getAge() {
        return age;
    }
 // to take the statut of nobody student, admin or teacher
    public String getStatus() {
        return status;
    }
}


