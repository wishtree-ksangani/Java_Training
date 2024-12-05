public class PaymentGateway implements CreditCard, Wallet{
    @Override
    public boolean payByCreditCard() {
        System.out.println("Pay by credit card is called");
        return false;
    }

    /**
     * How to handle the diamond problem
     * @return All the services
     */
    @Override
    public String getServices() {
        System.out.println("getServices of the Payment Gateway");
        return CreditCard.super.getServices() + "\n" + Wallet.super.getServices();
    }

    @Override
    public boolean payByWallet() {
        System.out.println("Pay by wallet is called");
        return false;
    }
}
