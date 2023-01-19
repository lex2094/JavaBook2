import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        boolean isTodayFriday = random.nextBoolean();
        boolean aLotOfMoney = random.nextBoolean();

        System.out.println(isTodayFriday);
        System.out.println(aLotOfMoney);


        if (isTodayFriday == true && aLotOfMoney == true) {
            System.out.println("Пойдем пить пиво");
        } else if (isTodayFriday == true && aLotOfMoney == false) {
            System.out.println("беру в долг и иду пииить");
        } else {
            System.out.println("иду домой и ем гречку");
        }

        int beerCost = (int) (Math.random() * 100);
        int whiskiCost = (int) (Math.random() * 200);
        int moneyInMyBag = (int) (Math.random() * 300);
        System.out.println(beerCost + " " + whiskiCost + " " + moneyInMyBag);
        whatIWillDrinkToday(beerCost,whiskiCost,moneyInMyBag);

    }

    public static void whatIWillDrinkToday(int beerCost, int whiskiCost, int moneyInMyBag) {
        if (whiskiCost < moneyInMyBag) {
            System.out.println("Я пью сегодня вискарь");
        } else if (beerCost < moneyInMyBag && whiskiCost > moneyInMyBag) {
            System.out.println("беру только пиво");
        } else if (beerCost < moneyInMyBag && whiskiCost < moneyInMyBag) {
            System.out.println("Беру и пиво и виски");
        } else {
            System.out.println("иду домой");
        }
    }
}