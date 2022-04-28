package model;

import props.Report;
import utils.DB;

import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ReportImpl implements IReport{
    DB db=new DB();
    List<Report> ls = new ArrayList<>();
    List<Report> lsSearch = new ArrayList<>();

    public ReportImpl() {
        ls = reportList();
        lsSearch = ls;
    }

    @Override
    public List<Report> reportList() {
        List<Report> reportList = new ArrayList<>();
        try
        {
            String sql ="select  cr.name [customerName], p.name[productName],bs.date,bs.count,cy.categoryName,p.buyPrice,p.sellPrice from basket bs\n" +
                    "join product p on p.pid = bs.productID\n" +
                    "join customer cr on cr.customerId = bs.customerID\n" +
                    "join category cy on cy.cid = bs.categoryId\n" +
                    "where bs.status=1;";
            PreparedStatement pre=db.connect().prepareStatement(sql);
            ResultSet rs=pre.executeQuery();
            while(rs.next())
            {
                String customerName = rs.getString("customerName");
                String productName = rs.getString("productName");
                String date = rs.getString("date");
                int count=rs.getInt("count");
                String categoryName = rs.getString("categoryName");
                int buyPrice = rs.getInt("buyPrice");
                int sellPrice = rs.getInt("sellPrice");
                Report report = new Report(customerName, productName, date, count, categoryName, buyPrice, sellPrice);
                reportList.add(report);
            }
        }
        catch (Exception ex)
        {
            System.err.println("reportList Error: "+ex.toString());
            ex.printStackTrace();
        }
        finally {
            db.close();
        }
        return reportList;
    }

    @Override
    public DefaultTableModel reportTableModel(String data, int searchType) {
        ls=lsSearch;
        DefaultTableModel md = new DefaultTableModel();
        md.addColumn("Customer");
        md.addColumn("Product");
        md.addColumn("Date");
        md.addColumn("Count");
        md.addColumn("Category");
        md.addColumn("Buy Price");
        md.addColumn("Sell Price");

        if (data != null && !data.equals("")) {
            List<Report> subLs = new ArrayList<>();
            for (Report item : ls) {
                if(searchType!=-1){
                    if(searchType!=1 && item.getCustomerName().contains(data)){
                        subLs.add(item);
                    }
                    else if(searchType!=2 && item.getProductName().contains(data)){
                        subLs.add(item);
                    }
                    else if(searchType!=3 && item.getCategoryName().contains(data)){
                        subLs.add(item);
                    }
                    else if(searchType!=4 && item.getDate().contains(data) ) {//tarih filterelenecek ??
                        subLs.add(item);
                    }
                }

            }
            ls = subLs;
        }
        for (Report item : ls) {
            Object[] row = {item.getCustomerName(), item.getProductName(), item.getDate(),item.getCount(),
                    item.getCategoryName(), item.getBuyPrice(), item.getSellPrice()};
            md.addRow(row);
        }
        return md;
    }
}
