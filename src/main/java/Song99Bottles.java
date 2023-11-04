import java.util.ArrayList;

public class Song99Bottles {
    public ArrayList<String> sing(final int bottlesNumber) {
        String text = String.format("%d bottles of beer on the wall, %d bottles of beer. Take one down and pass it around, %d bottles of beer on the wall.\n", bottlesNumber, bottlesNumber, bottlesNumber-1);
        
        ArrayList<String> lyrics = new ArrayList<>();
        lyrics.add(text);
        return lyrics;
    }
}
