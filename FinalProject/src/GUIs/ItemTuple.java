/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

/**
 *
 * @author Tyler
 */
public class ItemTuple {
    private String id;
    private String type;
    private String cost;
    private String room_no;
    
    public ItemTuple(String id, String type, String cost, String room_no) {
        this.id = id;
        this.type = type;
        this.cost = cost;
        this.room_no = room_no;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the cost
     */
    public String getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     * @return the room_no
     */
    public String getRoom_no() {
        return room_no;
    }

    /**
     * @param room_no the room_no to set
     */
    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }
    
}
