public class CashRegister {
        private double purchase;
        private double payment;
        public static final int QUARTER_VALUE=25;
        public static final int DIME_VALUE=10;
        public static final int NICKLE_VALUE=5;
        public static final int PENNY_VALUE=1;

        public CashRegister(){
            this.purchase=0;
            this.payment=0;
        }
        public CashRegister(double purchase, double payment){
            this.purchase = purchase;
            this.payment = payment;
        }
        public void recordPurchase(double amount){
            purchase = purchase + amount;
        }
        public void receivePayment(int coinCount, Coin coinType){
            payment = payment + coinCount * coinType.getValue();
        }
        public double giveChange(){
            double change = payment - purchase;
            purchase = 0;
            payment = 0;
            return change;
        }
    }
