//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class DataModel {
    private String id_order;
    private String id_customer;
    private String id_item;
    private String DateTime_CartFinalize;
    private String Amount_Gross_Order;
    private String CityNameFa;
    private String Quantity_item;

    public String getId_order() {
        return this.id_order;
    }

    public void setId_order(String id_order) {
        this.id_order = id_order;
    }

    public String getId_customer() {
        return this.id_customer;
    }

    public void setId_customer(String id_customer) {
        this.id_customer = id_customer;
    }

    public String getId_item() {
        return this.id_item;
    }

    public void setId_item(String id_item) {
        this.id_item = id_item;
    }

    public String getDateTime_CartFinalize() {
        return this.DateTime_CartFinalize;
    }

    public void setDateTime_CartFinalize(String dateTime_CartFinalize) {
        this.DateTime_CartFinalize = dateTime_CartFinalize;
    }

    public String getAmount_Gross_Order() {
        return this.Amount_Gross_Order;
    }

    public void setAmount_Gross_Order(String amount_Gross_Order) {
        this.Amount_Gross_Order = amount_Gross_Order;
    }

    public String getCityNameFa() {
        return this.CityNameFa;
    }

    public void setCityNameFa(String cityNameFa) {
        this.CityNameFa = cityNameFa;
    }

    public String getQuantity_item() {
        return this.Quantity_item;
    }

    public void setQuantity_item(String quantity_item) {
        this.Quantity_item = quantity_item;
    }

    public String toString() {
        return "DataModel{id_order='" + this.id_order + "', id_customer='" + this.id_customer + "', id_item='" + this.id_item + "', DateTime_CartFinalize='" + this.DateTime_CartFinalize + "', Amount_Gross_Order='" + this.Amount_Gross_Order + "', CityNameFa='" + this.CityNameFa + "', Quantity_item='" + this.Quantity_item + "'}";
    }

    public DataModel(String id_order, String id_customer, String id_item, String dateTime_CartFinalize, String amount_Gross_Order, String cityNameFa, String quantity_item) {
        this.id_order = id_order;
        this.id_customer = id_customer;
        this.id_item = id_item;
        this.DateTime_CartFinalize = dateTime_CartFinalize;
        this.Amount_Gross_Order = amount_Gross_Order;
        this.CityNameFa = cityNameFa;
        this.Quantity_item = quantity_item;
    }
}
