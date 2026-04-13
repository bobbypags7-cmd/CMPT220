public class Main {
    public static void main(String[] args) {

        //create a generic enemy and call its functions
        Enemy e1 = new Enemy(100, 15);
        e1.attack();
        System.out.println(" "); //empty lines just to make it look nicer when printed

        //create a fire and an ice wizard and call all functions
        Wizard fw1 = new Wizard(200, 25, "fire");
        Wizard iw1 = new Wizard(250, 15, "ice");

        fw1.attack();
        fw1.damageType();
        System.out.println(" ");

        iw1.attack();
        iw1.damageType();
        System.out.println(" ");

        //create a goblin and call its functions
        Goblin g1 = new Goblin(75, 10);
        g1.attack();
    }
}