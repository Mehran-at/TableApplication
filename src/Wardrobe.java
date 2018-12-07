import java.util.ArrayList;
import java.util.List;

public class Wardrobe implements TvTable {
    List<String> parts = new ArrayList<>();

    @Override
    public void add(String part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "parts=" + parts +
                '}';
    }
}
