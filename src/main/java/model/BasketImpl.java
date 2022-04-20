package model;

import props.Basket;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class BasketImpl implements IBasket{
    @Override
    public int basketInser(Basket basket) {
        return 0;
    }

    @Override
    public int basketUpdate(Basket basket) {
        return 0;
    }

    @Override
    public int basketDelete(int sid) {
        return 0;
    }

    @Override
    public List<Basket> basketList() {
        return null;
    }

    @Override
    public DefaultTableModel basketTableModel() {
        return null;
    }
}
