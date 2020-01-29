class Person {

    private String name;

    private int age;

    private double weight;

    private double height;

    public Person() {
        name = "nis";
        age = 21;
        weight = 64;
        height = 170.2;
    }

    public Person(String nameIn, int ageIn, double heightIn, double weightIn){
        name = nameIn;
        age = ageIn;
        height = heightIn;
        weight = weightIn;


    }

    public void eat(double amout) {
        weight = weight + amount;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void grow(double amount) {
        height = height + amount;
    }

    public static void main(String[] args){
        Person firstperson = new Person();

        System.out.println("HELLO");
        System.out.print(firstperson.getName());

        Person secondPerson = new Person("muk",23,33.0,33.0);
        System.out.println(secondPerson.getName());        
    }

}