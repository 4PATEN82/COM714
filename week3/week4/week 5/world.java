//import java.util.ArrayList;

//public class World{

    //private ArrayList<LivingThing>livingthings;

    //public World(){

        //livingThings = new ArrayList<Livingthings>();

    //}
    //public void addLivingThing(LivingThing thing){
       // livingThings.add(thing);

    //}
//}


public class World<LivingThing, LivingThings> {

    private ArrayList<LivingThing>LivingThings;
    
    public World(){
        LivingThing = new ArrayList<LivingThings>();
    }

    public LivingThing findLivingThing(int id){
        for(LivingThing thing : livingThings){
            if (thing.getid() == id){
                return thing;
            }

        }
        retung null;
    }
