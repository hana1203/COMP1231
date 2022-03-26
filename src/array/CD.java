package array;
import java.text.NumberFormat;
import java.util.Locale;

public class CD {

    private String title, artist;
    private double cost;
    private int tracks;

    public CD(String title, String artist, double cost, int tracks) {
        this.title = title;
        this.artist = artist;
        this.cost = cost;
        this.tracks = tracks;
    }

    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);
        return fmt.format(cost) + "\t" + tracks + "\t" + title + "\t" +artist;
    }
}
