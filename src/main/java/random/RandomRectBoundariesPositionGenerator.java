package random;

import boundaries.Boundaries;
import boundaries.RectangleBoundaries;
import coordinates.Coordinates2D;

/**
 * Created by PrifizGamer on 12.02.2018.
 */
public class RandomRectBoundariesPositionGenerator implements PositionGenerator {

    private RectangleBoundaries boundaries;

    public RandomRectBoundariesPositionGenerator(RectangleBoundaries boundaries) {
        this.boundaries = boundaries;
    }

    public Coordinates2D generatePoint() {

        double x = new RandomUniformIntervalGenerator(
                boundaries.getLeft(), boundaries.getLeft() + boundaries.getWidth())
                .generateDoubleValue();
        double y = new RandomUniformIntervalGenerator(
                boundaries.getBottom(), boundaries.getBottom() + boundaries.getHeight())
                .generateDoubleValue();

        return new Coordinates2D(x, y);
    }
}