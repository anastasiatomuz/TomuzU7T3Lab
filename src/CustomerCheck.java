
import java.util.ArrayList;

public class CustomerCheck {
    /**
     * The check for a customer or group of customers
     * Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /**
     * Returns the total of all MenuItem prices on the check,
     * as described in part (a)
     */
    public double totalPrices(){
        double sum = 0;
        for (MenuItem item : check){
            sum += item.getPrice();
        }
        return sum;
    }


    /**
     * Returns true if the restaurant’s coupon offer can be applied to this check and
     * returns false otherwise, as described in part (b)
     */
    public boolean couponApplies(){
        for (MenuItem item : check){
            if (item.isDailySpecial()){
                return false;
            }
        }


        if (totalPrices() < 40){
            return false;
        }


        return true;
    }


    /**
     * Calculates the final cost of this check, as described in part (c)
     */
    public double calculateCheck(){
        double originalCheck = totalPrices();
        int numCustomers = 0;
        double discount = 0;
        double tip = 0;
        for (MenuItem item : check){
            if (item.isEntree()){
                numCustomers ++;
            }
        }

        if (couponApplies()){
            discount = originalCheck * 0.25;
        }


        if (numCustomers >= 6){
            tip = originalCheck * 0.2;
        }


        return originalCheck - discount + tip;
    }

}