/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Account;

/**
 *
 * @author Nhatthang
 */
public class AccountDao extends DBContext implements GenericDao<Account> {

    public AccountDao() {
    }
    @Override
    public int add(Account obj) {
        int res = 0;
        String sql = "INSERT INTO [dbo].[Account]\n"
                + "           ([accountID]\n"
                + "           ,[password]\n"
                + "           ,[fullName]\n"
                + "           ,[dob]\n"
                + "           ,[gender]\n"
                + "           ,[phone]\n"
                + "           ,[address]\n"
                + "           ,[note])\n"
                + "     VALUES\n"
                + "           (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = this.connection.prepareStatement(sql);
            st.setString(1, obj.getAccountID());
            st.setString(2, obj.getPassword());
            st.setString(3, obj.getFullname());
            st.setDate(4, obj.getDob());
            st.setBoolean(5, obj.isGender());
            st.setString(6, obj.getPhone());
            st.setString(7, obj.getAddress());
            st.setString(8, obj.getNote());
            res = st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return res;
    }

    @Override
    public int update(Account obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Account obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Account> getAll(Account obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {
        AccountDao accDao = new AccountDao();
        System.out.println(accDao.add(new Account("user11", "qwerty", "William Taylor", new Date(1990, 1, 1), false, "666555444", "707 Ash St, City", "cc")));
    }

}
