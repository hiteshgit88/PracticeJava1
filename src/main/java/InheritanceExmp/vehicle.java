package InheritanceExmp;

public class vehicle {
    // the vehicle class has two fields
    public int gear;
    public int speed;

    // the vehicle class has one constructor
    public vehicle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // the vehicle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    // toString() method to print info of vehicle
    public String toString()
    {
        return("No of gears are "+gear
                +"\n"
                + "speed of vehicle is "+speed);
    }
}

// derived class
class Bicycle extends vehicle
{

    // the Bicycle subclass adds one more field
    public int seatHeight;

    // the Bicycle subclass has one constructor
    public Bicycle(int gear,int speed,
                        int startHeight)
    {
        // invoking base-class(vehicle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the Bicycle subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of vehicle to print more info
    @Override
    public String toString()
    {
        return (super.toString()+
                "\nseat height is "+seatHeight);
    }

}

// driver class
class Test
{
    public static void main(String args[])
    {

        Bicycle mb = new Bicycle(3, 100, 25);
        System.out.println(mb.toString());

    }
}
