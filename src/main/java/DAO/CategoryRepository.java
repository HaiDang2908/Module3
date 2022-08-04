package DAO;

import connection.MyConnection;
import modle.Category;
import java.util.ArrayList;
import java.sql.*;

public class CategoryRepository {
    private final MyConnection myConnection = new MyConnection();
    private final String SELECT_CATEGORY_BY_ID = "select * from category where id = ?";
    private final String SELECT_ALL_CATEGORY = "select * from category";


    public ArrayList<Category> findAll() {
        ArrayList<Category> categories = new ArrayList<>();
        try {
            Connection connection = myConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CATEGORY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Category category = new Category(name , id);
                categories.add(category);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return categories;
    }


    public Category findById(int id) {
        try {
            Connection connection = myConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CATEGORY_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                return  new Category(name , id);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}