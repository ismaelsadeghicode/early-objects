public class Student {
    private static int count;
    private String firstName;
    private String lastName;

    public Student() {
        count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
