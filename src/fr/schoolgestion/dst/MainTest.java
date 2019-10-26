package fr.schoolgestion.dst;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static java.lang.Float.*;

public class MainTest {

    public static void main(String[] args) throws IOException {
        //File file = new File("C:\\Users\\jourd\\IdeaProjects\\Perl_Jourdain_KIMBEMBE_Java\\src\\fr\\schoolgestion\\dst\\nobody.txt");


        Map<String, List<String>> nobody = new HashMap<String, List<String>>();


        String path = "C:\\Users\\jourd\\IdeaProjects\\Perl_Jourdain_KIMBEMBE_Java\\src\\fr\\schoolgestion\\dst\\nobody.txt";

        for (String line : Files.readAllLines(Path.of(path))) {
            String status = line.split(":")[0];
            String name = line.split(":")[1];
            String age = line.split(":")[2];
            String courses = line.split(":")[3];
            String note=line.split(":")[4]; //line.substring(((line.indexOf(":")+3)),( line.lastIndexOf("")));
            String function = line.split(":")[3];

            if ("ENSEIGNANT".equals(status)) {
                List<String> course = new ArrayList<>();
                course.add(courses);
                course.add(status);
                course.add(age);
                nobody.put(name, course);

            }
            if ("ADMINISTRATIF".equals(status)) {
                List<String> functions = new ArrayList<>();
                functions.add(function);
                functions.add(status);
                functions.add(age);
                nobody.put(name, functions);
                // System.out.println(status+" "+ name +" "+ age+" "+;
            }
            if ("ETUDIANT".equals(status)) {
                System.out.print(note);
              /*  List<String> notes = new ArrayList<>();
                notes.add(status);
                notes.add(age);
                notes.add(note);
                nobody.put(name, notes);
                System.out.println(status);

               */
            }


        }


        nobody.keySet().forEach(key -> Collections.sort(nobody.get(key)));

        System.out.println(nobody);
    }




}
