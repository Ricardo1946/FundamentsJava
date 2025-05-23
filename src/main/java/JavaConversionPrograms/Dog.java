package JavaConversionPrograms;

public class Dog {

    String name;
    String breed;
    int age;
    String color;

    public Dog(String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return  color;
    }
    @Override public String toString() {
        return ("Name is: " + this.getName() + "\nBreed , age, and color are: " + this.getBreed() + " , " + this.getAge() + "," + this.getColor());
    }

    public static void main(String[] args) {
        Dog Pongo = new Dog("Pongo", "papillon",5, "white");
        System.out.println(Pongo.toString());
    }
}
