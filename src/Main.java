public class Main {
    public static void main(String[] args) {
        boolean client = true;
        int bonusRuble = 100;
        long balance = 50;
        long refill = 2200;
        long limit = 1000;
        if (refill < limit) {
            refill = 0;
        }
       long bonus = refill / bonusRuble;

        System.out.println(bonus);
    }
}