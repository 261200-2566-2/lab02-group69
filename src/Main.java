public class Main {
    public static void main(String[] args)
    {
        AirPurifier myair = new AirPurifier("xiaomi",1500,"white");
        myair.manual();
        System.out.println(myair);
        myair.setTurnOn(true);
        System.out.println(myair);
        myair.setFanspeed(5);
        System.out.println(myair);
        myair.setTemperature(40);
        System.out.println(myair);
    }
}