public class SmartphoneAdapter implements PowerOutlet {

    private SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smartphoneCharger){

        //Constructor for smartphoneCharger
        this.smartphoneCharger = smartphoneCharger;
    }

    //Adapts the plugIn method to call the chargePhone method of SmartphoneCharger
    @Override
    public void plugIn(){
        smartphoneCharger.chargePhone();
    }
}