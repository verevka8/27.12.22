public class Bank {
    private static int balance = 2000;

    public void set_balance(int a) {
        if (Math.abs(a) > this.balance && a < 0) {
            System.out.println("Вы влезли в долги!");
        }
        this.balance = this.balance + a;
        System.out.println("Ваш баланс: " + balance );
    }


}
