package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food <SpiceType extends Class<? extends Spice>> {

    private List<Spice> spices = new ArrayList<>();
    private Map<SpiceType, Integer> spiceCount = new HashMap<>();

    public List<Spice> getAllSpices() {
        return spices;
    }

    public Map<SpiceType, Integer> getSpiceCount() {
        return spiceCount;
    }

    public void applySpice(Spice spice) {
        if(!spices.contains(spice))
            spices.add(spice);
        if(spiceCount.containsKey((SpiceType) spice.getClass()))
            spiceCount.replace((SpiceType) spice.getClass(), spiceCount.get((SpiceType) spice.getClass()) + 1);
        else
            spiceCount.put((SpiceType) spice.getClass(), 1);
    }
}
