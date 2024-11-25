package ie.atu.productv4;

public class music extends product {
    private String Artists;
    private String label;
    public music() {
        super();
        Artists = "";
        label = "";
        count++;
    }


    public void setArtist(String Artist) {
        this.Artists = Artist;
    }
    public void setlabel(String label) {
        this.label = label;
    }

    public String getArtists() {
        return Artists;
    }
    public String getlabel() {
        return label;
    }

    @Override
    public String toString() {
        return "music{" +
                "Artists='" + Artists + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
