
package lk.ijse.main.DB;
/*
 * ---------------------------------------------------------------------------------------------
 *   Copyright (c) 2021. Sanduni_Dhananjana Corporation. All rights reserved.
 *   Licensed under the MIT License. See License.txt in the project root for license information
 *  --------------------------------------------------------------------------------------------
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author SanduniDhananjana <sandunidhananjana00@gmail.com>
 * @Time :2:21 PM
 * @Date :2021-10-09/Oct
 * @Project Name :IjseCustomItem_App
 */
public class DBConnection {

    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ijseApp","root","ijse");
    }
    public Connection getConnection(){
        return  connection;

    }
    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        if(null==dbConnection){
            dbConnection=new DBConnection();

        }
        return dbConnection;

    }
}
