import java.time.LocalDate;

public class Member {
    // Properties (fields) of the Member class
    private String firstName;
    private String lastName;
    private LocalDate dob; // Date of Birth using LocalDate
    private int id; // ID as an integer
    private String address;
    private int ssn; // Social Security Number as an integer

    // Default constructor
    public Member() {
        this.firstName = "DefaultFirstName";
        this.lastName = "DefaultLastName";
        this.dob = LocalDate.of(2000, 1, 1); // Default date: January 1, 2000
        this.id = 0; // Default ID
        this.address = "DefaultAddress";
        this.ssn = 0; // Default SSN
    }

    // Parameterized constructor
    public Member(String firstName, String lastName, LocalDate dob, int id, String address, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.id = id;
        this.address = address;
        this.ssn = ssn;
    }

    // Method to return a string representation of the object
    @Override
    public String toString() {
        return "Member Details: \n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Date of Birth: " + dob + "\n" + // LocalDate's toString() formats as YYYY-MM-DD
                "ID: " + id + "\n" +
                "Address: " + address + "\n" +
                "SSN: " + ssn + "\n";
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Using default constructor
        Member member1 = new Member();
        System.out.println(member1);

        // Using parameterized constructor
        Member member2 = new Member("John", "Doe", LocalDate.of(1995, 5, 20), 12345, "123 Main Street", 123456789);
        System.out.println(member2);
    }
}
