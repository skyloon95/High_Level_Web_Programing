package M201432014.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import M201432014.DB;

public class ProductDAO1 {

	public static List<Product> findAll() throws Exception {
		String sql = "SELECT p.*, c.name " +
				"FROM product p LEFT JOIN category c ON p.categoryId = c.id ";
		try (Connection connection = DB.getConnection("product");
				PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()) {
			ArrayList<Product> list = new ArrayList<Product>();
			while (resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setTitle(resultSet.getString("title"));
				product.setCategoryId(resultSet.getInt("categoryId"));
				product.setCategoryName(resultSet.getString("name"));
				product.setUnitCost(resultSet.getInt("unitCost"));
				product.setQuantity(resultSet.getInt("quantity"));
				list.add(product);
			}
			return list;
		}
	}

	public static List<Product> findByTitle(String title) throws Exception {
		String sql = "SELECT p.*, c.name " +
				"FROM product p LEFT JOIN category c ON p.categoryId = c.id " +
				"WHERE p.title LIKE ?";
		try (Connection connection = DB.getConnection("product");
				PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setString(1, title + "%");
			try (ResultSet resultSet = statement.executeQuery()) {
				ArrayList<Product> list = new ArrayList<Product>();
				while (resultSet.next()) {
					Product product = new Product();
					product.setId(resultSet.getInt("id"));
					product.setTitle(resultSet.getString("title"));
					product.setCategoryId(resultSet.getInt("categoryId"));
					product.setCategoryName(resultSet.getString("name"));
					product.setUnitCost(resultSet.getInt("unitCost"));
					product.setQuantity(resultSet.getInt("quantity"));
					list.add(product);
				}
				return list;
			}
		}
	}
}

