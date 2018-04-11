public class CashRegisterTester {
    public static void main(String[] args) {
        final int NICKLE_VALUE = 5;
        final int DIME_VALUE = 10;
        final int QUARTER_VALUE = 25;
        final int PENNY_VALUE =  1;

        CashRegister myRegister = new CashRegister();
        myRegister.recordPurchase(.60);
        // I want to figure out how to print the amount above
        myRegister.receivePayment(4, new Coin(QUARTER_VALUE, "quarter"));
        System.out.print("Change with quarters: ");
        System.out.println(myRegister.giveChange());

        myRegister.receivePayment(4, new Coin(NICKLE_VALUE, "nickle"));
        System.out.print("Change with nickle: ");
        System.out.println(myRegister.giveChange());

        myRegister.receivePayment(4, new Coin(DIME_VALUE, "dime"));
        System.out.print("Change with dime: ");
        System.out.println(myRegister.giveChange());

        myRegister.receivePayment(4, new Coin(PENNY_VALUE, "penny"));
        System.out.print("Change with penny: ");
        System.out.println(myRegister.giveChange());
    }
}
