package InnerClass;

public class Main {
    
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        // to instantiate a Gear class object which is an inner class of Gearbox,
        // have to use OuterClass.InnerClass like below
        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println("Wheelspeed: " + mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println("Wheelspeed: " + mcLaren.wheelSpeed(3000));

    }
}
