/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantReservation;
import RestaurantReservation.restaurantResUI;
import RestaurantReservation.restaurantRes;
import RestaurantReservation.restaurantResList;
/**
 *
 * @author noellefajt
 */
public class app {

    /**
     * @param args the command line arguments
     */
    //static private restaurantResUI resInterface;
    static private restaurantRes restaurantRes;
    static private restaurantResList restaurantResList;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("restaurant tests are running");
        

        //resInterface = new restaurantResUI();
        restaurantRes = new restaurantRes("Joe", "Smith", "1234567890", "diner", 3, "3:45");
        //restaurantResList = new restaurantResList();
        
        String reservationInfo = restaurantRes.getInfo();
        System.out.println(reservationInfo);
        boolean isAvailable = restaurantResList.isAvailable("CFA", 10, "5:45");
        System.out.println(isAvailable);

    }
    
}
