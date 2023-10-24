package AdapterPattern;
public class SmartphoneAdapter implements PowerOutlet {
    private Smartphonecharger charge;
    public SmartphoneAdapter(Smartphonecharger charger) {
        this.charge = charger;
    }
    @Override
    public void plugIn() {
        charge.smartPhonecharger();
    }
}