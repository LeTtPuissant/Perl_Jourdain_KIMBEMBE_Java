package fr.schoolgestion.dst;
// here are all exceptions message for the project
public class AllProjectExceptions extends Exception {
    private Integer age;

    public  AllProjectExceptions( Integer age, String msg){
        super(msg);
        this.age= age;

    }
}
