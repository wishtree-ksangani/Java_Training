package sealed;

/**
 * Represent the blueprint for creating any chape
 * <p>
 * This class provide draw method which will draw the perticular shape.
 */
public abstract sealed class Shape permits Circle, Rectangle {

    /**
     * Draw a shape
     *
     * @param description Shows the description of the shape
     * @return Message for creation of the shape.
     */
    public abstract String draw(String description);
}
