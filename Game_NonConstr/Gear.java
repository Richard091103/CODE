public class Gear {

    // Properties/Attributes

    String type;
    String rarity;
    String name;
    Float weight;
    String Geardescription;


    // Method
    
    public void showAllAttributes(){
        System.out.println();
        System.out.println("Gear Name: " + name);
        System.out.println("Gear Type: " + type);
        System.out.println("Gear Rarity: " + rarity);
        System.out.println("Gear Weight: " + weight);
    }

    public void displayGearDescription(){
        System.out.println("Gear Description: " + Geardescription);
    }
}
