public class Student {
    // Information Attributes
    String SurName;
    String FirstName;
    char midInitial;
    String DateOfBirth;
    int StudentNumber;
    String studentEmailAddress;
    boolean iamAwesome;

    // Information Method
    public void sayMysurname() {
        System.out.println("My Surname is: " + SurName);
    } 

    public void sayMyfirstname() {
        System.out.println("My First Name is: " + FirstName);
    } 

    public void sayMymidInitial() {
        System.out.println("My Middle Initial is: " + midInitial);
    } 

    public void sayMyDateOfBirth() {
        System.out.println("My Birthday is: " + DateOfBirth);
    } 

    public void sayMyStudentNumber() {
        System.out.println("My Student Number is: " + StudentNumber);
    } 

    public void sayMystudentEmailAddress() {
        System.out.println("My Student Email is: " + studentEmailAddress);
    } 

    public void sayMystudentiamAwesome() {
        System.out.println("I am Awesome " + iamAwesome);
    } 
}
