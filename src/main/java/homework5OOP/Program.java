package homework5OOP;

public class Program {
    public static void main(String[] args) {
        CreditAccount account = new CreditAccount();

        account.put(100);
        System.out.println(account.getAmount());
        account.take(50);
        System.out.println(account.getAmount());
    }

}
