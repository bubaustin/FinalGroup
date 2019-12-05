package edu.cgcc.student;

public class OrderClass {
    private boolean Paid;
    private boolean Packaged;
    private boolean Shipped;
    private boolean Complete;
    private String orderDate;
    private String orderNumber;
    private String CustomerName;
    private String CustomerNumber;
    private String BillingAddress;
    private String ShippingAddress;
    private String[] productName;
    private String[] productAmount;
    private String[] productPrice;

    public OrderClass(String oDate,String oNumber,String cName,String cNumber,String bAddress,String sAddress,String[] pName, String[] pAmount, String[] pPrice){
        orderDate = oDate;
        orderNumber= oNumber;
        CustomerName= cName;
        CustomerNumber= cNumber;
        BillingAddress= bAddress;
        ShippingAddress= sAddress;
        productName=pName;
        productAmount=pAmount;
        productPrice=pPrice;






    }

}
