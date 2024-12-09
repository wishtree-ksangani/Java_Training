public class SameNumberException extends RuntimeException{
    /**
     * Override the constructor
     * @param message Exception message
     */
    public SameNumberException(String message){
        super(message);
    }

    /**
     * Return name and description of the exception
     * @return String formet
     */
    @Override
    public String toString() {
        return "Same number exception is generated. \n " + super.toString() ;
    }
}
