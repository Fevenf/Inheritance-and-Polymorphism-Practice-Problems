import java.util.ArrayList;

public class PersonAndSubclassMain {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Feven Fenta", "1234 coldcreek pl. Huntersville 28211", 2600));
        persons.add(new Student("Mahlet Tsegaye ", "1234 Norkett Dr. Charlotte  28215"));

        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}