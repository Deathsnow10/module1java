interface vehicle{
    void horn();
    void no_of_tires();
    void no_of_seats();
}
class bicycle implements vehicle{
    bicycle(){
        System.out.println("Bicycle has:");
    }
    @Override
    public void horn() {
        System.out.println("Horn sounds like : trink trink");
    }

    @Override
    public void no_of_tires() {
        System.out.println("Two tires");
    }

    @Override
    public void no_of_seats(){
        System.out.println("One seat");
    }
}
class bike implements vehicle{
    bike(){
        System.out.println("Bike has:");
    }
    @Override
    public void horn() {
        System.out.println("Horn sounds like : pee pee");
    }

    @Override
    public void no_of_tires() {
        System.out.println("Two tires");
    }

    @Override
    public void no_of_seats(){
        System.out.println("two seats");
    }
}
class car implements vehicle{
    car(){
        System.out.println("car has:");
    }
    @Override
    public void horn() {
        System.out.println("Horn sounds like : pee poo");
    }

    @Override
    public void no_of_tires() {
        System.out.println("Four tires");
    }

    @Override
    public void no_of_seats(){
        System.out.println("Four seats");
    }
}
class rickshaw implements vehicle{
    rickshaw(){
        System.out.println("Rickshaw has:");
    }
    @Override
    public void horn() {
        System.out.println("Horn sounds like : peep peeep");
    }

    @Override
    public void no_of_tires() {
        System.out.println("Three tires");
    }

    @Override
    public void no_of_seats(){
        System.out.println("Three seats");
    }
}
public class program0 {
    public static void main(String[] args) {
        rickshaw sher = new rickshaw();
        sher.no_of_seats();
        sher.no_of_tires();
        sher.horn();
        System.out.println();

        bike rajdani = new bike();
        rajdani.no_of_seats();
        rajdani.no_of_tires();
        rajdani.horn();
        System.out.println();

        car perry = new car();
        perry.no_of_seats();
        perry.no_of_tires();
        perry.horn();
        System.out.println();

        bicycle lamborgini= new bicycle();
        lamborgini.no_of_seats();
        lamborgini.no_of_tires();
        lamborgini.horn();
        System.out.println();
    }
}
