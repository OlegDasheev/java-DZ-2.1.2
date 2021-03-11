public class Main {
    public static void main(String[] args) {
        boolean client = true;
        int bonus_ruble = 100;
        long balance = 50;
        long refill = 2500;
        long bonus = refill / bonus_ruble;
        long limit = 1000;
        if (refill < limit) {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}