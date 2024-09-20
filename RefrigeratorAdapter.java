public class RefrigeratorAdapter implements PowerOutlet{

    private Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator){
   //Constructor for RefrigeratorAdapter
        this.refrigerator = refrigerator;
    }

    //Adapts the plugIn method to call the startCooling method of Refrigerator.
    @Override
    public void plugIn(){
        refrigerator.startCooling();

    }
}