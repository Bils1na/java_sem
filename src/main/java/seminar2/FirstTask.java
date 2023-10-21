package seminar2;

//Дано четное число N (>0) и символы с1 и с2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов с1 и с2,
//начиная с с1.

import java.util.Scanner;

public class FirstTask {
    int n;
    char a;
    char b;
    int cnt = 0;

    public FirstTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter even number");
        n = in.nextInt();
        System.out.println("Enter two symbols");
        a = in.next().charAt(0);
        b = in.next().charAt(0);
        in.close();
    }

    public FirstTask(int n, char a, char b) {
        this.n = n;
        this.a = a;
        this.b = b;
    }

    public boolean isOdd(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            System.out.println(String.format("Entered number n = %s - odd", n));
            return false;
        }
    }

    public void getResult() {
        StringBuilder stringBuilder = new StringBuilder();
        if (isOdd(n)) {
            while ( n != cnt) {
                stringBuilder.append(a).append(b);
                cnt = cnt + 2;
            }
        }
        System.out.println(stringBuilder);
    }
}
