public class BonusService {

    public long calculate(long amount, boolean registered) {
        long limit = 500;

        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100 / 100;
        bonus = bonus > limit ? limit : bonus;

        return bonus;
    }

}
