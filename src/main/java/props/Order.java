package props;

public class Order {
    private int oid;
    private int customerID;
    private int total;
    private String date1;
    private String date2;

    public Order() {
    }


    public Order(int oid, int customerID, int total, String date1, String date2) {
        this.oid = oid;
        this.customerID = customerID;
        this.total = total;
        this.date1 = date1;
        this.date2 = date2;
    }

    public Order(String date1, String date2) {
        this.date1 = date1;
        this.date2 = date2;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", customerID=" + customerID +
                ", total=" + total +
                ", date1='" + date1 + '\'' +
                ", date2='" + date2 + '\'' +
                '}';
    }
}
