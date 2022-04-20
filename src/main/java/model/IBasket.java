package model;

import props.Basket;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public interface IBasket {
    int basketInser(Basket basket);
    int basketUpdate(Basket basket);
    int basketDelete(int sid);

    List<Basket> basketList();
    DefaultTableModel basketTableModel();

}
