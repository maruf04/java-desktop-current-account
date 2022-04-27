package model;

import props.Basket;
import props.Customer;
import props.Order;
import props.Product;
import utils.DB;

import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class OrderImpl implements IOrder{
    DB db=new DB();

    private List<Basket> listReport=new ArrayList<>();

    public String dateStart="";
    public String dateEnd="";
    public OrderImpl(String dataStart,String dateEnd){
        this.dateStart=dataStart;
        this.dateEnd=dateEnd;
        listReport=dataReportLst(dateStart,dateEnd);
    }

    public OrderImpl() {

    }
    public DefaultTableModel reportTableModel(String data,String radiobtn){
        DefaultTableModel md=new DefaultTableModel();
        md.addColumn("First Name");
        md.addColumn("Surname");
        md.addColumn("Product Name");
        md.addColumn("SaleQuantity");
        md.addColumn("Sale Price");
        md.addColumn("Sale Date");
        md.addColumn("Total");
        List<Basket> subList=new ArrayList<>();
        List<Integer> subListTotal=new ArrayList<>();
        for(Basket item: listReport){
            if (!data.equals("")&&!data.equals(null)&&radiobtn.equals("customer")){
                if (item.getCustomer().getName().toLowerCase(Locale.ROOT).contains(data.toLowerCase()) ||
                        item.getCustomer().getSurname().toLowerCase(Locale.ROOT).contains(data.toLowerCase())) {
                    subList.add(item);
                }


            }else if (!data.equals("") &&!data.equals(null) && radiobtn.equals("product")) {
                if (item.getProduct().getName().toLowerCase(Locale.ROOT).contains(data.toLowerCase())) {
                    subList.add(item);
                }


            }else{
                subList.add(item);

            }
        }for(Basket item:subList){
            Object[] row={item.getCustomer().getName(),item.getCustomer().getSurname(),
                    item.getProduct(),item.getProduct().getName(),
                    item.getCount(),item.getProduct().getBuyPrice(),item.getDate(),
                    item.getProduct().getBuyPrice()*item.getCount()};
            md.addRow(row);
        }
        return md;
    }


    public List<Basket> getListReport(){
        return listReport;
    }
    public void setListReport(List<Basket> listReport) {
        this.listReport = listReport;
    }
    public List<Basket> dataReportLst(String dateStart,String dateEnd){
        List<Basket> listBasketReport=new ArrayList<>();
        try{
            String sql="select sid,b.customerId,p.pid, c.name,c.surname,p.name;b.count,p.buyPrice,p.sellPrice,date from basket b join product p on b.productId =p.pid join customer c on b.customerId=c.customerId where status=1  "+
                    "and strftime('%y-%m-%d',date) between ? and ? orderby strftime('%y-%m-%d',date) desc";
            PreparedStatement pre=db.connect().prepareStatement(sql);
            pre.setString(1,dateStart);
            pre.setString(2,dateEnd);

            ResultSet rs=pre.executeQuery();
            while (rs.next()){
                int sid=rs.getInt(1);
                int customerId=rs.getInt(2);
                int pid=rs.getInt(3);
                String name=rs.getString(4);
                String surname=rs.getString(5);
                String productName=rs.getString(6);
                int count=rs.getInt(7);
                int buyPrice=rs.getInt(8);
                int sellPrice=rs.getInt(9);
                String date=rs.getString(10);
                int status=rs.getInt(11);
                Customer c=new Customer(customerId,name,surname,null,null,null);
                Product p=new Product(pid,productName,0,buyPrice,sellPrice,null,0);
                Basket b=new Basket(sid,customerId,pid,date,count,status,p,c);

                listBasketReport.add(b);
            }



        }catch (Exception ex){
            System.out.println("Error in ListBasket"+ex);
        }finally {
            db.close();
        }

        return listBasketReport;
    }

    List<Order> ls = new ArrayList<>(); // 1
    @Override
    public int orderInsert(Order order) {
        int status=0;
        try{
            //int oid, int customerID, int total, String date, String uuid
            String sql="INSERT INTO orders values(null,?,?,?,?)";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1,order.getCustomerID());
            pre.setInt(2,order.getTotal());
            pre.setString(3,order.getDate());
            pre.setString(4,order.getUuid());
            status = pre.executeUpdate();
        }catch (Exception e){
            System.out.println("orderInsert Error : "+e);
        }
        finally {
            db.close();
        }
        return status;
    }

    @Override
    public List<Order> orderList() {
        List<Order> orderList = new ArrayList<>();
        try
        {
            String sql = "select * from orders";
            PreparedStatement pre=db.connect().prepareStatement(sql);
            ResultSet rs=pre.executeQuery();
            while(rs.next())
            {
                // int oid, int customerID, int total, String date, String uuid
                int oid=rs.getInt("oid");
                int customerID = rs.getInt("customerID");
                int total = rs.getInt("total");
                String  date = rs.getString("date");
                String uuid = rs.getString("uuid");
                Order order = new Order(oid,customerID,total,date,uuid);
                orderList.add(order);
            }
        }
        catch (Exception ex)
        {
            System.err.println("orderList Error: "+ex.toString());
            ex.printStackTrace();
        }
        finally {
            db.close();
        }
        return orderList;
    }

    @Override
    public DefaultTableModel orderTableModel(String data) {
        DefaultTableModel md = new DefaultTableModel();
        md.addColumn("oid");
        md.addColumn("customerID");
        md.addColumn("total");
        md.addColumn("date");
        md.addColumn("uuid");

        for (Order item : ls) {
            Object[] row = {item.getOid(), item.getCustomerID(), item.getTotal(),
                    item.getDate(), item.getUuid()};
            md.addRow(row);
        }
        return md;
    }
}
