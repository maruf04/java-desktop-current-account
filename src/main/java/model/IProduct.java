package model;

import props.Product;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public interface IProduct {
    int productInsert(Product product);
    int productUpdate(Product product);
    int productDelete(int pid);
    int getProductSellPrice(int pid);
    List<Product> productList();
    DefaultTableModel productTable(String data);
}
