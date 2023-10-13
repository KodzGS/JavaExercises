public class PersonTask {

    // Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
    private String firstName;
    private String lastName;
    private int age;

    /**
     * Method named getFirstName without any parameters, it needs to return the value of the firstName field.
     * @return method to return first name
     */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Method named getLastName without any parameters, it needs to return the value of the lastName field.
     * @return method to return last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Method named getAge without any parameters, it needs to return the value of the age field.
     * @return method to return age
     */
    public int getAge() {
        return this.age;
    }
    /**
     * Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
     * @param firstName set the firstname string
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
     * @param lastName set the lastname string
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Method named setAge with one parameter of type int, it needs to set the value of the age field.
     * If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
     * @param age set the age string
     */
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else this.age = age;
    }
    /**
     * Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
     * @return age for teenagers
     */
    public boolean isTeen() {
        return age >= 12 && age <= 20;
    }
    /**
     * Method named getFullName without any parameters, it needs to return the full name of the person.
     * @return empty strings if one or other is empty
     */
    public String getFullname() {
        if (firstName.isEmpty() && lastName.isEmpty()){
            return null;
        } else if (firstName.isEmpty()){
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        }
        return firstName + " " + lastName;
    }
}


