package homework1OOP;

public class Program() {
    /*
   * 1. Создать класс "Счет в банке" - Account.
   * У этого класса должно быть поле с текущим балансом на счете.
   * У этого класса должно быть 3 метода:
   * - (put) Пополнить счет - принимат положительное число, увеличивает текущий баланс
   * - (take) Вывести средства - принимат положительное число, уменьшает текущий баланс
   * - (getAmount) Показать баланс - ничего не принимает, возвращает текущий баланс (getter)
   *
   * 2. Создать несколько наследников.
   * - Кредитный счет (CreditAccount)
   * Особенность: на каждое снятие нужно наложить комиссию в размере 1% от суммы снятия.
   * То есть, если снимаем 100 у.е., то снять нужно 101.
   * - Депозитный счет (DepositAccount) *
   * Особенность: нельзя снимать средства чаще, чем раз в месяц.
   * То есть, нужно завести поле с датой последнего снятия, и использовать его.
   * (Для дат лучше использовать LocalDate, пример в классе Dates в проекте урока)
   */

    public static void main(String[] args) {
        Account account1 = new Account(100.95);
        Account account2 = new Account();
        System.out.println(account1.getAmount());
        System.out.println(account2.getAmount());

        account2.put(215.43);
        account1.take(57.99);
        System.out.println(account1.getAmount());
        System.out.println(account2.getAmount());

    }

}