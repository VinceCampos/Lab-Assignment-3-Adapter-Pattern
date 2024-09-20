public class ApplianceApp {
    
    public static void main(String[] args) {

        //Create instances of devices 
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        //Create adapter for each device
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneChargerOutlet = new SmartphoneAdapter(smartphoneCharger);

        //Plug in the devices and use the adapters
        laptopOutlet.plugIn();
        refrigeratorOutlet.plugIn();
        smartphoneChargerOutlet.plugIn();

    }
}