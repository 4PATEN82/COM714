import java.util.ArrayList;

public class World{

    //attributes
    private ArrayList<Livingthing>livingthings;

    //constructor
    public World(){

        livingthings = new ArrayList<>();
    }
    //methods
    public void addlivingthings(Livingthing livingthingIn){
        livingthings.add(livingthingIn);
    }
     
    
}