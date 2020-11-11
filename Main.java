package D_JavaAdvancedOOP.Lecture9_ExceptionsAndErrorHandling.ExProblem_5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Person p = new Person("     ", "4avdarov", 23);
        } catch (PersonCreationException pce) {
            System.out.println(pce.getMessage());
        }









    }
}
