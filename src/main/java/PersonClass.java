public class PersonClass {

    public static void main(String[] args) {
        PersonTask person = new PersonTask();
        person.setFirstName("Kodi");
        person.setLastName("Johnson");
        person.setAge(21);
        person.getFullname();
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.isTeen());
        System.out.println(person.getFullname());

    }
}
