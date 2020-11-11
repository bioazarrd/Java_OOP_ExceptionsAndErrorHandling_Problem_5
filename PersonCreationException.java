package D_JavaAdvancedOOP.Lecture9_ExceptionsAndErrorHandling.ExProblem_5;
import java.util.Date;
public class PersonCreationException extends Throwable {
    private Date dateOfAttempt;

    public PersonCreationException(String message) {
        super(message);
        this.dateOfAttempt = new Date();
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " " + this.dateOfAttempt.toString();
    }
}
