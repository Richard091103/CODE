public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        // Weapon Class
        Weapon Rifle = new Weapon();

        Rifle.name = "Sniper Rifle";
        Rifle.damage = 89;
        Rifle.weight = 5.0f;
        Rifle.rarity = "Legendary";
        Rifle.weaponDescription = "Sniper rifle owned by the user";
        Rifle.displayweapondescription();

        // Gear Class

        Gear armor1 = new Gear();

        armor1.name = "Gimbarambaram";
        armor1.type = "helmet";
        armor1.rarity = "Legend 1";
        armor1.weight = 8.0f;
        armor1.Geardescription = "This armor is for the head";
        
        armor1.showAllAttributes();
        armor1.displayGearDescription();

        Gear armor2 = new Gear();

        armor2.name = "haduken";
        armor2.type = "Body Armor";
        armor2.rarity = "Legend 2";
        armor2.weight = 10.0f;
        armor2.Geardescription = "This armor is for the body";
        
        armor2.showAllAttributes();
        armor2.displayGearDescription();


    }
}
