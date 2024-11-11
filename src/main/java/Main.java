public class Main {

    public static void main(String[] args) {
BonusService bonusService = new BonusService();

long bonus =  bonusService.calculate(5_000, true);
System.out.println(bonus);
    }
}
