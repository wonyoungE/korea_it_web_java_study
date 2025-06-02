package _31_Generic.Wildcard.LowerBoundedWildcard;

public class Main {
    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Maltese> malteseBox = new Box<>();


        SuperWildcard.putDog(animalBox);    // OK
        SuperWildcard.putDog(dogBox);    // OK
//        SuperWildcard.putDog(malteseBox);   // Dog 이상을 넣기로 했으니 불가능
    }
}
