package dataBase;

/**
 * Created by Юля on 23.05.2016.
 */
public class DAOMain {

    public static void main(String[] args) {
        DAO<Product> productDAO = new ProductMemoryDAO();
        productDAO.create(new Product(1,"svf","nfjvn",2354312));
        productDAO.create(new Product(2,"svf","nfjvn",1564));
        productDAO.create(new Product(3,"svf","nfjvn",1245));
        productDAO.create(new Product(4,"svf","nfjvn",976));
        workingWithProducts(productDAO);
    }

    private static void workingWithProducts(DAO<Product> productDAO) {
        Product product = productDAO.findById(3);
        System.out.println("id = 3: " + product);

        product.setName("Crocodile");
        productDAO.update(product);

        System.out.println("After update: " + productDAO.findAll());

        productDAO.delete(product);

        productDAO.create(new Product(5, "Giraffe", "African animal", 10000));

        System.out.println("After delete and create: " + productDAO.findAll());
    }
}
