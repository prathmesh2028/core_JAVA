package Basics;

interface Charger{
    void charge();
}
class OldCharger{
    void oldCharge(){
        System.out.println("Charging using old charger");
    }
}
class ChargerAdapter implements Charger {
    OldCharger oldCharger;

    public ChargerAdapter(OldCharger oldCharger){
        this.oldCharger = oldCharger;
    }

    public void charge(){
        oldCharger.oldCharge();
    }
}
public class AdapterDesignPattern {
    public static void main(String[] args) {
        // Existing old charger
        OldCharger oldCharger = new OldCharger();

        // Adapter converts old charger to new charger
        Charger charger = new ChargerAdapter(oldCharger);

//     Client uses charger normally
        charger.charge();
    }
}
