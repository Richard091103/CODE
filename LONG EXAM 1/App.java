public class App {
    public static void main(String[] args) throws Exception {
        
        //Information Class

        Student richard = new Student();

        richard.SurName = "Meneses";
        richard.FirstName = "Richard Jefferson";
        richard.midInitial = 'V';
        richard.DateOfBirth = "09/11/2003";
        richard.StudentNumber = 2021300165;
        richard.studentEmailAddress = "menesesrv@students.national-u.edu.ph";
        richard.iamAwesome = true;
        richard.sayMysurname();
        richard.sayMystudentEmailAddress();
        richard.sayMystudentiamAwesome();

    }
}
