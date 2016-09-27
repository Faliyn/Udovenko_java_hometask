/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.house_6;

/**
 *
 * @author Мария
 */
public class Task_6 {
    public static void main(String[] args) {
        House h = new House();
         h.print(h.flats);
         
         h.searchRooms(h.flats, 3);
         h.searchRoomsFloors(h.flats, 4,4,14);
         h.searchArea(h.flats,1);
         
    }
    
}
