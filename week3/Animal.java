class Animal{

public Animal(String nameIn){
    super(nameIn);
}

    public Livingthing breed(Livingthing partner){
    if (partner instanceof Animal) {
    System.out.println("ok");
    return new Animal("ok2")
    }
    System.out.println("no");
        return null;
        
    }
}