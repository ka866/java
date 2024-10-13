public class Fan
    {
    String brand;
    double price;
    String model;
    String speed;
    String type;

   
    public void display() {
        System.out.println("Brand: " + brand + 
                           "\nPrice: " + price + 
                           "\nModel: " + model + 
                           "\nSpeed: " + speed + 
                           "\nType: " + type);
    }

    
    public void isOn() {
        boolean isOn = true;
        System.out.println("Fan is on");
    }

    
    public void isOff() {
        boolean isOff = true;
        System.out.println("Fan is off");
    }


    public void speedLevel() {
        int rpm = 1200;
        System.out.println("Speed Level is: " + rpm + " RPM");
    }
}