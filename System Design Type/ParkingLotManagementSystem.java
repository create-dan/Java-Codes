import java.util.HashMap;
import java.util.Map;

// vehicle class
class Vehicle{
    private String licenesePlate;
    
    public Vehicle(String licenesePlate){
        this.licenesePlate= licenesePlate;
    }

    public String getLicensePlate(){
        return licenesePlate;
    }

}


//parking ticket class
class Ticket{
    private int ticketId;
    private Vehicle vehicle;
    private long entryTime;

    public Ticket(int ticketId , Vehicle vehicle ){
        this.ticketId = ticketId;
        this.vehicle=vehicle;
        this.entryTime=System.currentTimeMillis();
    }

    public int getTicketId(){
        return ticketId;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public long getEntryTime(){
        return entryTime;
    }

}


//parking lot
class ParkingLot{
    private int capacity;
    private Map<Integer,Boolean> parkingSpaces;// True if occupied, False if vacant
    private Map<Integer,Ticket> ticketMap;
    private int ticketIdCounter;

    public ParkingLot(int capacity){
        this.capacity = capacity;
        this.parkingSpaces = new HashMap<>();
        this.ticketMap = new HashMap<>();
        this.ticketIdCounter = 1;


        //initializing parking spaces
        for(int i=1;i<=capacity;i++){
            parkingSpaces.put(i,false); //initially all spaces are vacant
        }
    }


    //now implement all imp methods
    
    public Ticket parkVehicle(Vehicle vehicle){
        for(int space : parkingSpaces.keySet()){
            if(!parkingSpaces.get(space)){
                parkingSpaces.put(space,true); //occupy the space
                Ticket ticket = new Ticket(ticketIdCounter++,vehicle);
                ticketMap.put(ticket.getTicketId(),ticket);
                return ticket;
            }
        }

        return null;
    }


   public boolean exitParkingLot(int ticketId){
    Ticket ticket = ticketMap.get(ticketId);
    if(ticket!=null){
        long duration = System.currentTimeMillis() - ticket.getEntryTime();

        double parkingFess = duration / 1000.0 * 0.05;
        System.out.println("Parking fees : Ru "+ parkingFess);
        //vacate the parking space
        parkingSpaces.put(findParkingSpace(ticket.getVehicle()),false);

        ticketMap.remove(ticketId);
        return true;
    }

    return false;//invalid ticket id
   }

   private int findParkingSpace(Vehicle vehicle){
    for(int space : parkingSpaces.keySet()){
        if(parkingSpaces.get(space) && ticketMap.get(space).getVehicle().equals(vehicle)){
            return space;
        }
    }

    return -1;  //vehicle not found
   }

   public void printParkingStatus(){
     System.out.println("Parking Lot Status:");
     for(int space : parkingSpaces.keySet()){
        System.out.println("Space : "+space + " : " + (parkingSpaces.get(space) ? "Occupied" : "Vacant" ));
     }
   }

}



                    
                
public class ParkingLotManagementSystem {
    public static void main(String[] args) {
         
        //create a parking lot with capacity 10
        ParkingLot parkingLot = new ParkingLot(10);

        //park vehicle 
        Vehicle vehicle1 = new Vehicle("6845");
        Ticket ticket1 = parkingLot.parkVehicle(vehicle1);
        parkingLot.printParkingStatus();

        Vehicle vehicle2 = new Vehicle("2499");
        Ticket ticket2 = parkingLot.parkVehicle(vehicle2);
        parkingLot.printParkingStatus();

                // Exit the parking lot and print parking status
        parkingLot.exitParkingLot(ticket1.getTicketId());
        parkingLot.printParkingStatus();

        parkingLot.exitParkingLot(ticket2.getTicketId());
        parkingLot.printParkingStatus();



        
    }
}