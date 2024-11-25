package ie.atu.productv4;

public class tv extends product{
    private String screenSize;
    private String manafacture;
    int count;
    public tv() {
        super();
        screenSize = "";
        manafacture = "";
        count ++;
    }


    public void setscreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    public void setManafacture(String manafacture) {
        this.manafacture = manafacture;
    }
    public String getmanafacture() {
        return manafacture;
    }
    public String getscreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "tv{" +
                "screenSize='" + screenSize + '\'' +
                ", manafacture='" + manafacture + '\'' +
                '}';
    }
}
