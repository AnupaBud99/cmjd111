/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author ASUS
 */
public class ItemDto {
    private String id;
    private String desc;
    private String pack;
    private double UnitPrice;
    private int QoH;
    
    
    public ItemDto()  {
    }
     public ItemDto(String id, String desc, String pack, double UnitPrice, int QoH) 
        this.id = id;
        this.desc = desc;
        this.pack = pack;
        this.UnitPrice = unitPrice;
        this.QoH = QoH;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public int getQoH() {
        return QoH;
    }

    public void setQoH(int QoH) {
        this.QoH = QoH;
    }
    @Override
    public String toString() {
        return "ItemDto{" + "id=" + id + ", desc=" + desc + ", pack=" + pack + ", unitPrice=" + unitPrice + ", qoh=" + qoh + '}';
    }
    
    
}
