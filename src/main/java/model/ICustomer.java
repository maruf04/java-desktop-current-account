package model;


import props.Customer;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public interface ICustomer {
    int customerInsert(Customer customer);
    int customerDelete(int customerId);
    int customerUpdate(Customer customer);
    List<Customer> customerList();
    List<Customer> customerSearch(String data);
    DefaultTableModel customerTableModel();


}
