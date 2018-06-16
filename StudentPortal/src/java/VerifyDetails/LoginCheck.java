package VerifyDetails;

import PojoClass.PojoStd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class LoginCheck {

    public static boolean Validate(PojoStd std) {

        boolean status = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DAC", "root", "");
            PreparedStatement ps = con.prepareStatement("select * from StudentRegister where StudentName=? and Email=?");

            ps.setString(1, std.getName());
            ps.setString(2, std.getEmail());

            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;

    }
}
