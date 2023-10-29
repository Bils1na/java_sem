package homework2OOP;

import homework2OOP.Account.CreditAccount;
import homework2OOP.Account.DepositAccount;
import homework2OOP.Account.FixedAmountAccount;

public class Program {

    /**
     * Модифицируем пример, описанный в предыдущем домашнем задании (со счетами).
     * {@link ru.gb.lesson1.Homework}
     *
     * 1. Класс Account превратить в интерфейс с методами:
     * # double getAmount() - получение текущего баланса
     * # void put(double amount) - пополнить счет
     * # void take(double amount) - снять средства со счета
     *
     * 2. Создать базовый абстрактный класс AbstractAccount, в котором будет общая часть:
     * # поле с балансом
     * # конструктор, который принимает начальное значение баланса
     * # реализация всех методов
     *
     * 3. Добавить еще один класс FixedAmountAccount с особенностью: методы put, take НЕ изменяют баланс.
     *
     * 4.* Класс AbstractAccount можно реализовать хитрее. Пример ниже.
     */

    /**
     * Пример реализации класса AbstractAccount
     */
//    public abstract class AbstractAccount /* implements Account */ {
//
//        // поля класса
//
//        // @Override
//        public final void take(double amount) {
//            if (amount >= 0) {
//                doTake(amount);
//            } else {
//                throw new IllegalArgumentException("Сумма снятия должна быть положительной");
//            }
//        }
//
//        protected void doTake(double amount) {
////      this.amount -= amount;
//        }
//    }
    public static void main(String[] args) {
        System.out.println("------CreditAccount-----");
        CreditAccount creditAccount = new CreditAccount(100);
        System.out.println(creditAccount.getAmount());
        creditAccount.put(100);
        System.out.println(creditAccount.getAmount());
        creditAccount.take(50);
        System.out.println((creditAccount.getAmount()));

        System.out.println("------DepositAccount-----");
        DepositAccount depositAccount = new DepositAccount(100);
        System.out.println(depositAccount.getAmount());
        depositAccount.take(10);
        System.out.println(depositAccount.getAmount());
        depositAccount.take(10);

        System.out.println("-----FixedAmountAccount-----");
        FixedAmountAccount fixedAmountAccount = new FixedAmountAccount(100);
        System.out.println(fixedAmountAccount.getAmount());
        fixedAmountAccount.put(100);
        System.out.println(fixedAmountAccount.getAmount());
        fixedAmountAccount.take(100);
        System.out.println(fixedAmountAccount.getAmount());

    }

}