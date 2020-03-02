package dao;

public class DaoFactory {
    private static Items itemsDao;
    private static Config config = new Config();
    public static Items getItemsDao() {
        if (itemsDao == null) {
            itemsDao = new MySQLItemsDao(config);
        }
        return itemsDao;
    }

}
