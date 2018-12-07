import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {
    List<Step> steps = Arrays.asList(new AddLeg(), new AddLeg(), new AddLeg(), new AddLeg(), new AddShelf(), new AddTop());

    public Wardrobe build(Wardrobe wardrobe) {
        Wardrobe wardrobe1 = new Wardrobe();
        for (Step step : steps) {
            step.perform(wardrobe);
        }return wardrobe;
    }
}
