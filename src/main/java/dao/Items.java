package dao;

import models.Item;

import java.sql.SQLException;
import java.util.List;

public interface Items {
    List<Item> all() throws SQLException;
    Long insert(Item item) throws SQLException;
}
