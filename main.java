//Droid project

public class Droid {
 
  int batteryLevel;
  
  public Droid(){
    batteryLevel = 100 ; 
  }
  
  public void activate(){
    System.out.println("Activated. How can I help you?");
     batteryLevel = batteryLevel - 5;
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }
 
  public void chargeBattery (int hours){
    System.out.println("Droid charging...");
      batteryLevel = batteryLevel + hours;
    if (batteryLevel > 100){
      batteryLevel = 100;
      System.out.println(batteryLevel);
    }else {
      System.out.println(batteryLevel);
    }
  }
  
  public int checkBatteryLevel(){
    System.out.println(batteryLevel);
    return batteryLevel;
  }
  
  public void hover(int feet){
    if (feet > 2){
      System.out.println("Error! too high");
    } else{
      System.out.println("Hovering..");
        batteryLevel = batteryLevel - 20;
        System.out.print(batteryLevel);
      }
  }


public static void main(String[] args) {

  Droid d = new Droid();

  d.activate();
  d.chargeBattery(5);
  d.hover(1);
}
  }
