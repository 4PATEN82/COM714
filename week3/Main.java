public class main{

    public static void main(String[] args) {
        Human firstHuman = new Human("First Human");
        Human secondHuman = new Human("Second Human");

        theworld.addlivingthing(firsthuman);
        theworld.addlivingthing(secondHuman);

        Human babyHuman = (Human) firstHuman.breed(secondHuman);
        
        theworld.addlivingthing(babyHuman);

        Animal firstAnimal = new Animal("first Animal");

        theworld.addlivingthing(firstAnimal);

        Plant firstplant = new plant("First Plant");
        theworld.addlivingthing(firstPlant);

    }
}