package dao;
import com.mysql.cj.jdbc.Driver;
import models.Item;
import java.sql.*;



import java.sql.PreparedStatement;
import java.util.List;

public class MySQLItemsDao implements Items {
    private Connection connection = null;

    public MySQLItemsDao (Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public List<Item> all() {
        return null;
    }

    @Override
    public Long insert(Item item) throws SQLException {
        String sqlQuery = "INSERT INTO items (name, priceInCents) VALUES (?, ?)";
        PreparedStatement stmt = this.connection.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, item.getName());
        stmt.setInt(2, item.getPriceInCents());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        rs.next();
        System.out.println(rs.getLong(1));
        return rs.getLong(1);
    }

    public static void main(String[] args) throws SQLException {
        Items mySqlDao = DaoFactory.getItemsDao();
        Item bat = new Item("bat", 1800);
        Item bike = new Item("bike", 8000);
        mySqlDao.insert(bat);
        mySqlDao.insert(bike);
    }
}
