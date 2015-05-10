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
public class CleansTuple {
    private String essn;
    private String room_no;
    private String date;
    private String start_time;
    private String occupied;
    
    public CleansTuple(String essn, String room_no, String date, String start_time, String occupied) {
        this.essn = essn;
        this.room_no = room_no;
        this.date = date;
        this.start_time = start_time;
        this.occupied = occupied;
    }

    /**
     * @return the essn
     */
    public String getEssn() {
        return essn;
    }

    /**
     * @param essn the essn to set
     */
    public void setEssn(String essn) {
        this.essn = essn;
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

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the start_time
     */
    public String getStart_time() {
        return start_time;
    }

    /**
     * @param start_time the start_time to set
     */
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    /**
     * @return the occupied
     */
    public String getOccupied() {
        return occupied;
    }

    /**
     * @param occupied the occupied to set
     */
    public void setOccupied(String occupied) {
        this.occupied = occupied;
    }
}
