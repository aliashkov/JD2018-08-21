package by.it.basumatarau.project.java.genericDAO;

import java.sql.SQLException;
import java.util.List;

public interface InterfaceDAO<T> {
    T read(long id) throws SQLException;
    boolean create(T bean) throws SQLException;
    boolean update(T bean) throws SQLException;
    boolean delete(T bean) throws SQLException;
    List<T> getAll(String sqlWHERE) throws SQLException;
}
