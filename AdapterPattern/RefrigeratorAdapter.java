package AdapterPattern;

public class RefrigeratorAdapter implements PowerOutlet {
    private Refrigerator ref;
    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.ref = refrigerator;
    }
    @Override
    public void plugIn() {
        ref.startCooling();
    }
}