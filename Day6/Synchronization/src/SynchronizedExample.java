import Deadlock.Resource;

import java.util.TreeMap;

/**
 * Example of the static method, instance method, and block.
 */
public class SynchronizedExample {
    Resource resource;
    public static boolean isUpdateble = true;

    /**
     * Set the resource
     * @param resource
     */
    SynchronizedExample(Resource resource){
        this.resource = resource;
    }

    /**
     * set the value of the isUpdatable variable.
     * <p>
     *     It is synchronized because it can noy be updated bt more than one thread at a time
     * </p>
     * @param isUpdateble
     */
    synchronized public static void setIsUpdateble(Boolean isUpdateble){
        SynchronizedExample.isUpdateble = isUpdateble;
    }

    /**
     * It will call the print message function of the resource
     */
    public void consumeResource(){
        synchronized (resource){
            resource.printMessage();
        }
    }

    /**
     * Chnge the reference of the resources
     * @param resource
     */
    synchronized public void changeResource(Resource resource){
        if(resource != null){
            this.resource = resource;
        }
    }

}
