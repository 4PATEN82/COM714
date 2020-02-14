class Plant{

public Plant(String nameIn){
    super(nameIn);
}

    public Livingthing breed(Livingthing partner){
    if (partner instanceof Plant) {
    System.out.println("hhhaaaa");
    return new Plant("aaahhhh")
    }
    System.out.println("no");
        return null;
        
    }
}