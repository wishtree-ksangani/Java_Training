public interface CreditCard {

    /**
     * Provide Functionality to pay by the creditcard
     *
     * @return Status of the payment
     */
    boolean payByCreditCard();

    /**
     * Gives the servises offerd by the creditcard
     *
     * @return String of services
     */
    default String getServices(){
        return "ICICI, HDFC, KOTAK, etc...";
    }
}
