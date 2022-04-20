package props;

public class Basket {
    private int sid;
    private int customerID;
    private int productID;
    private String date;
    private int count;
    private int status;

    public Basket() {
    }

    public Basket(int sid, int customerID, int productID, String date, int count, int status) {
        this.sid = sid;
        this.customerID = customerID;
        this.productID = productID;
        this.date = date;
        this.count = count;
        this.status = status;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "sid=" + sid +
                ", customerID=" + customerID +
                ", productID=" + productID +
                ", date='" + date + '\'' +
                ", count=" + count +
                ", status=" + status +
                '}';
    }
}
