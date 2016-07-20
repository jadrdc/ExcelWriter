package edu.unapec.opensource.models;

/**
 * Created by LENOVO on 18/07/2016.
 */
public class ViewInformation {

    private  double grandTotal;
    private  double taxttotal;
    private  double productQuantity;
    private  double grandTotalTax;


    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public double getTaxttotal() {
        return taxttotal;
    }

    public void setTaxttotal(double taxttotal) {
        this.taxttotal = taxttotal;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(double productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getGrandTotalTax() {
        return grandTotalTax;
    }

    public void setGrandTotalTax(double grandTotalTax) {
        this.grandTotalTax = grandTotalTax;
    }
}
