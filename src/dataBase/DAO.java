package dataBase;

/**
 * Created by Юля on 23.05.2016.
 */
public interface DAO<T>{
    boolean create(T product);

    java.util.List<T> findAll();

    T findById(int id);

    void update(T product);

    void delete(T product);
}
