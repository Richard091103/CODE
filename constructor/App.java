public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyName method
        knight.sayMyName();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyName method
        mage.sayMyName();

        // Creates a new object named "thief" from Character class
        Character thief = new Character(5, 10, 0, "Gondar");
        // Calls the sayMyName method
        thief.sayMyName();

        // Creates a new object named "healer" from Character class
        Character healer = new Character(50, 100, 60, "Hippopotomonstrosesquippedaliophobia");
        // Calls the sayMyName method
        healer.sayMyName();

        // Creates a new object named "archer" from Character class
        Character archer = new Character(70, 80, 100, "Pseudopseudohypoparathyroidism");
        // Calls the sayMyName method
        archer.sayMyName();
    }
}
