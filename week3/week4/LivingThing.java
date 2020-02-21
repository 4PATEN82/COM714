class Livingthing{

    //attribute
    private String name;
    private int energy;

    //constuctor
    public Livingthing(String nameIn){
        name = nameIn;
        energy = 100;
    }
    
    //methods
    public void eat(int amount){
        energy = energy + amount;
    }

    public Livingthing breed(Livingthing partner){
        System.out.println("not sure");
        return null;
    }

    public String getname()
        return name;

        public int getenergy()
            return energy;
}

public void setName(String nameIn){
    name = nameIn;

}

public void setenergy(String energyIn){
    energy = energyIn;
}

