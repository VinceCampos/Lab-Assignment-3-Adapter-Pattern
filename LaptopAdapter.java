public class LaptopAdapter implements PowerOutlet {

    private Laptop laptop;

    //Constructor for LaptopAdapter
    public LaptopAdapter (Laptop laptop){
        this.laptop = laptop;
    }

    //Adapts the plugIn method to call the charge method of Laptop
    @Override
    public void plugIn(){

        laptop.charge();
    }
}