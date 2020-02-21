class Human{

    //attribute
    
    private int energy;

    //constuctor
    public Human(String nameIn) {
        energy = 100;
    }
    
    //methods
    public void eat(int amount){
        energy = energy + amount;
    }


        public int getenergy()
            return energy;
}

}

public void setenergy(String energyIn){
    energy = energyIn;
}

