
public class Airport {
    public static void main(String[] args){
        Flight economyFlight = new Flight("1", "Economy");
        Flight businessFlight = new Flight("2", "Business");
        
        Passenger james = new Passenger("James", true);
        Passenger mike = new Passenger("Mike", false);
        
        businessFlight.addPassenger(james);
        businessFlight.removePassenger(james);
        businessFlight.addPassenger(mike);
        economyFlight.addPassenger(mike);
        
        System.out.println("Business flight passenger list:");
        for (Passenger passenger: businessFlight.getPassengerList()){
            System.out.println(passenger.getName());
        }
        
        System.out.println("Economy flight passenger list:");
        for (Passenger passenger: economyFlight.getPassengerList()){
            System.out.println(passenger.getName());
        }
    }
}
