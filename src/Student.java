import java.text.MessageFormat;

public class Student extends Person {

    private int numOfCredits;

    public Student(String name, String address) {
        super(name, address);
    }

    public int numOfCredits() {
        return numOfCredits;
    }

    public void study() {
        this.numOfCredits++;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}\n  Study numOfCredits {1}", super.toString(), numOfCredits);
    }
}