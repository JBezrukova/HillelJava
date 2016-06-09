package dataBase;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Юля on 23.05.2016.
 */
public class ProductDBDAO implements DAO<Product> {
    private Connection connection;

    public ProductDBDAO() {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5433/hillelJava",
                    "postgres",
                    "postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean create(Product product) {
        String sql = "insert into product (id, name, category, price) values (?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setString(3, product.getCategory());
            preparedStatement.setInt(4, product.getPrice());
            int rows = preparedStatement.executeUpdate();
            preparedStatement.close();
            return (rows == 1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public java.util.List<Product> findAll() {
        try {
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product findById(int id) {
        try {
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Product product) {
        try {
            String sql = "update product set price = ?, name = ?, category = ? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, product.getPrice());
            preparedStatement.setInt(4, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setString(3, product.getCategory());

            int rowsUpdated = preparedStatement.executeUpdate();
            System.out.println("Updated " + rowsUpdated + " row.");
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Product product) {
        try {
            String sql = "delete from product where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, product.getId());
            int rows = preparedStatement.executeUpdate();
            if (rows != 0) {
                System.out.println("Deleted " + rows + " row");
            }else {
                System.out.println("Row has not been deleted!");
            }
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
