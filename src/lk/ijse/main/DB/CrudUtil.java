
package lk.ijse.main.DB;
/*
 * ---------------------------------------------------------------------------------------------
 *   Copyright (c) 2021. Sanduni_Dhananjana Corporation. All rights reserved.
 *   Licensed under the MIT License. See License.txt in the project root for license information
 *  --------------------------------------------------------------------------------------------
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author SanduniDhananjana <sandunidhananjana00@gmail.com>
 * @Time :2:21 PM
 * @Date :2021-10-09/Oct
 * @Project Name :IjseCustomItem_App
 */
public class CrudUtil {

        public static <T>T execute(String sql,Object... param) throws SQLException, ClassNotFoundException {

            PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);

            for (int i = 0; i <param.length ; i++) {
                preparedStatement.setObject((i+1),param[i]);
                System.out.println(param[i]);
            }
            if (sql.startsWith("SELECT")){
                return (T)preparedStatement.executeQuery();

            }

            return ((T)(Boolean)(preparedStatement.executeUpdate()>0));

        }

}
