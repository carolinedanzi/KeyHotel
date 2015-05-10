/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

/**
 *
 * @author micro
 */
public class MaintTuple {
   private String request_id;
   private String essn;
   private String rm_no;
   private String uniq_item_id;
   private String descr;
   private String submittalDate;
   private String resolutionDate;

public MaintTuple(String request_id, String essn, String rm_no, String uniq_item_id, String descr, String submittalDate, String resolutionDate){
    this.request_id = request_id;
    this.essn = essn;
    this.rm_no = rm_no;
    this.uniq_item_id = uniq_item_id;
    this.descr = descr;
    this.submittalDate = submittalDate;
    this.resolutionDate = resolutionDate;
}
   /**
    * @return the essn
    */
    public String getEssn(){
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
    public String getRm_no() {
        return rm_no;
    }

    /**
     * @param room_no the room_no to set
     */
    public void setRm_no(String room_no) {
        this.rm_no = room_no;
    }
    
    public String getRequest_id(){
        return request_id;
    }
    
    public void setRequest_id(String request_id){
        this.request_id = request_id;
    }
    
    public String getUniq_item_id(){
        return uniq_item_id;
    }
    
    public void setUniq_item_id(String uniq_item_id){
        this.uniq_item_id = uniq_item_id;
    }
    
    public String getDescr(){
        return descr;
    }
    
    public void setDescr(String descr){
        this.descr = descr;
    }
    
    public String getSubmittalDate(){
        return submittalDate;
    }
    
    public void setSubmittalDate(String submittalDate){
        this.submittalDate = submittalDate;
    }
    
    public String getResolutionDate(){
        return resolutionDate;
    }
    
    public void setResolutionDate(String resolutionDate){
        this.resolutionDate = resolutionDate;
    }
}
    


