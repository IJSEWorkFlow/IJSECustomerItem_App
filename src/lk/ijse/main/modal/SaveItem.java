

package lk.ijse.main.modal;
/*
 * ---------------------------------------------------------------------------------------------
 *   Copyright (c) 2021. Sanduni_Dhananjana Corporation. All rights reserved.
 *   Licensed under the MIT License. See License.txt in the project root for license information
 *  --------------------------------------------------------------------------------------------
 */


import lk.ijse.main.DB.CrudUtil;

import java.sql.SQLException;

/**
 * @author SanduniDhananjana <sandunidhananjana00@gmail.com>
 * @Time :2:21 PM
 * @Date :2021-10-09/Oct
 * @Project Name :IjseCustomItem_App
 */
public class SaveItem {
    public static void   saveItem(String id ,String name,String desc ,String price){
        try {
            boolean execute = CrudUtil.execute("INSERT INTO Item VALUES(?,?)",id,name,desc,price);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
