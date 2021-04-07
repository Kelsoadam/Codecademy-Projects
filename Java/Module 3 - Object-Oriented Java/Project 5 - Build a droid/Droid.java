public class Droid{

int batteryLevel;
String name;

  public static void main(String[] args){
    Droid codey = new Droid("Codey");

    System.out.println(codey);

    codey.performTask("move");
    System.out.println("Current battery level: " + codey.batteryLevel);

    codey.performTask("spin");
    System.out.println("Current battery level: " + codey.batteryLevel);
  }

  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  public String toString(){
    return "\nHello, I am the droid called: " + name + '!';
  }

  public void performTask(String task){
    System.out.println("\n"+name + " is performing task: " + task);
    batteryLevel -= 10;
  }


}