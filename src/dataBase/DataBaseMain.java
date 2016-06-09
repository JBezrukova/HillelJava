package dataBase;

import java.sql.*;
import java.util.*;

/**
 * Created by Юля on 16.05.2016.
 */
public class DataBaseMain {
    private Connection connection;

    public DataBaseMain(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public Map<String, Integer> selectNameAndPrice() throws Exception {
        Statement statement = connection.createStatement();
        String sql = "SELECT name, price FROM product";
        ResultSet resultSet = statement.executeQuery(sql);
        Map<String, Integer> nameAndPrice = new HashMap<>();
        while (resultSet.next()) {
            String name = resultSet.getString(1);
            int price = resultSet.getInt(2);
            nameAndPrice.put(name, price);
        }
        resultSet.close();
        statement.close();
        return nameAndPrice;
    }

    public java.util.List<Product> findAllProducts() throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "SELECT id, name, category, price FROM product";
        ResultSet resultSet = statement.executeQuery(sql);
        java.util.List<Product> products = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");
            Product product = new Product(id, name, category, price);
            products.add(product);
        }
        resultSet.close();
        statement.close();
        return products;
    }

    public Product findProductById(int id) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "SELECT id, name, category, price FROM product WHERE id =" + id;
        ResultSet resultSet = statement.executeQuery(sql);
        Product product = null;
        while (resultSet.next()) {
            int identificator = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");
            product = new Product(identificator, name, category, price);
        }
        resultSet.close();
        statement.close();
        return product;
    }


    public void updatePriceByName(String name, int price) throws SQLException {

        String sql = "update product set price = ? where name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, price);
        preparedStatement.setString(2, name);
        int rowsUpdated = preparedStatement.executeUpdate();
        System.out.println("Updated " + rowsUpdated + " row.");
        preparedStatement.close();
    }

    public void createProduct(Product product) throws SQLException {
        String sql = "insert into product (id, name, category, price) values (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, product.getId());
        preparedStatement.setString(2, product.getName());
        preparedStatement.setString(3, product.getCategory());
        preparedStatement.setInt(4, product.getPrice());
        int rows = preparedStatement.executeUpdate();
        if (rows != 0) {
            System.out.println("Inserted " + rows + " row");
        }else {
            System.out.println("Row has not been inserted!");
        }
        preparedStatement.close();
    }

    public void deleteProductById(int id) throws SQLException {
        String sql = "delete from product where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int rows = preparedStatement.executeUpdate();
        if (rows != 0) {
            System.out.println("Deleted " + rows + " row");
        }else {
            System.out.println("Row has not been deleted!");
        }
        preparedStatement.close();
    }

    public static void main(String[] args) throws Exception {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/hillelJava", "postgres", "postgres");
        DataBaseMain dataBaseMain = new DataBaseMain(connection);

        Map<String, Integer> nameAndPrice = dataBaseMain.selectNameAndPrice();
        System.out.println(nameAndPrice);
        java.util.List<Product> products = dataBaseMain.findAllProducts();
        System.out.println(products);
        System.out.println(dataBaseMain.findProductById(2));

        dataBaseMain.updatePriceByName("Hipo", 270000);

        Product product = new Product(5, "Giraffe", "African animal", 2589632);
        //dataBaseMain.createProduct(product);
        dataBaseMain.deleteProductById(5);
        connection.close();
    }
}
