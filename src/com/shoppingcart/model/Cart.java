package com.shoppingcart.model;

public class Cart {

private int OID;
private int TotalPrice;
private String PNama;


public int getOID() {
    return OID;
}

public void setOID(int OID) {
    this.OID = OID;
}


public String getPNama() {
    return PNama;
}

public void setPNama(String PNama) {
    this.PNama = PNama;
}

public int getTotalPrice() {
    return TotalPrice;
}

public void setTotalPrice(int TotalPrice) {
    this.TotalPrice = TotalPrice;
}

}