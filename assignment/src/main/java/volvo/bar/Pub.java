package volvo.bar;

public class Pub {

    public static final String ONE_BEER = "hansa";
    public static final String ONE_CIDER = "grans";
    public static final String A_PROPER_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";

    //one unit of rum
    private int ingredient1() {
        return 65;
    }

    //one unit of grenadine
    private int ingredient2() {
        return 10;
    }

    public int computeCost(String drink, boolean student, int amount) {

        if (amount > 2 && (drink == GT || drink == BACARDI_SPECIAL)) {
            System.out.println("Too many drinks, max 2.");
            throw new RuntimeException("Too many drinks, max 2.");
        }
        int price;
        if (drink.equals(ONE_BEER)) { //Drink is beer
            price = 74;
        }
        else if (drink.equals(ONE_CIDER)) { //Drink is cider
            price = 103;
        }
        else if (drink.equals(A_PROPER_CIDER)) price = 110; //Drink is better cider
        else if (drink.equals(GT)) { //Drink is gin tonic
            price = ingredient6() + ingredient5() + ingredient4();
        }
        else if (drink.equals(BACARDI_SPECIAL)) { //Drink is mojito
            price = ingredient6()/2 + ingredient1() + ingredient2() + ingredient3();
        }
        else {
            System.err.println("No such drink exists");
            throw new RuntimeException("No such drink exists");
        }
        if (student && (drink == ONE_CIDER || drink == ONE_BEER || drink == A_PROPER_CIDER)) {
            price = price - price/10;
        }
        return price*amount;
    }

    //one unit of lime juice
    private int ingredient3() {
        return 10;
    }
    
    //one unit of green stuff
    private int ingredient4() {
        return 10;
    }

    //one unit of tonic water
    public int ingredient5() {
        return 20;
    }

    //one unit of gin
    private int ingredient6() {
        return 85;
    }

    //one unit of orange juice
    private int ingredient7() {
        return 45;
    }
}
