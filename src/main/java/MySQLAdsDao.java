import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;


import com.mysql.cj.jdbc.Driver;

import javax.swing.plaf.nimbus.State;


public class MySQLAdsDao implements Ads {
    private static Connection connection = null;

    public MySQLAdsDao (Config config) {
        try {
            DriverManager.registerDriver(new Driver());

            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<Ad> all() throws SQLException{
        List<Ad> ads = new ArrayList<>();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from ads");


        while (rs.next()) {
            Ad ad = new Ad(rs.getLong("id"),rs.getLong("user_id"),  rs.getString("title"), rs.getString("description"));

            ads.add(ad);

        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        Long id = (long)0;

        String query = "INSERT INTO ads(title, description, user_id) VALUES ('" + ad.getTitle() + "', '" + ad.getDescription() + "'," + ad.getUserId() + ")";

        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                rs.getLong("user_id");
            }
        }
        catch (SQLException e){
            throw new RuntimeException("Error connecting to the database!", e);
        }

        return id;
    }
}


