import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdcbExampleI {

	public static void main(String[] args) {
		
		String jdbc ="jdbc:mysql://localhost:3306/school";
		String username = "root";
		String password = "root";
		
		String sql = "class_details";
		

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

		
		

	}

}
