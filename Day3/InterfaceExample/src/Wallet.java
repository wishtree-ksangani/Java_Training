public interface Wallet {
    /**
     * Provide Functionality to pay by the Wallet
     *
     * @return Status of the payment
     */
    boolean payByWallet();

    /**
     * Gives the servises offerd by the Wallet
     *
     * @return String of services
     */
    default String getServices(){
        return "Samsumg Wallet, Paytm Wallet, etc...";
    }
}
