package rocks.zipcode.quiz4.collections.culonary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private List<Spice> spices;
    private Map<Spice, Integer> spiceCount = new HashMap<>();

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        return null;
    }

    public void applySpice(Spice spice) {
        if(!spices.contains(spice))
            spices.add(spice);

    }
}
