package duasong_learning;
//多态继承关系
class Vehicle{
   int  seats ;

Vehicle(){
    seats=0;
}
    Vehicle(int seats){
        this.seats=seats;
        System.out.println(this.seats);
    }
    void setSeats(){
        seats=0;

    }
void setSeats(int seats){
    this.seats=seats;
    System.out.println(this.seats);
}
}

public class hello {
    public static  void main(String [] args){
        Vehicle Car = new Vehicle();
        Vehicle Bus = new Vehicle(4);
        Car.setSeats();
        Bus.setSeats(4);

    }
}
