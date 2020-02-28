package weeks;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.ryntime.Name;

public class LivingThing {

    private static int nextid;
    private int id,age,energy;
    private stirng name;
    private ArrayList<LivingThing>livingthing;


    LivingThing()
    {
        id =nextid;
        nextid++;
        age=0;
        energy =100;

    }

    public int getId()
        return Id;
}
public void age()
{
    age=age+1;

}

public int getenergy(){
    return energy;
}
public void setEnergy(int energeyIn)

{
    energy = energyIn;
}
public void setName(int nameIn)
{
    name = nameIn;

}
public static object remove(LivingThing thing)
{
    return null;
}