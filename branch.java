package lic;

import com.company.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class branch {
    protected static final String tableBranch = "Branch";
    protected static String columnBranchCode = "BranchCode";
    protected static String columnBranchName = "BranchName";
    protected static database databaseInstance = database.getInstance();

    public static void addBranch(ArrayList<HashMap<String, Object>> Branches) {
//        System.out.println(agent.columnAgentsCode);
//            database databaseInstance = database.getInstance();
        try {
            for (int i = 0; i < Branches.size(); i++) {
                databaseInstance.getStatement().execute("insert into " + tableBranch + "(" + columnBranchCode + "," + columnBranchName + ") " +
                        "values (" + Branches.get(i).get("branchCode") + ",'" + Branches.get(i).get("branchName") + "')");

            }
        }catch (SQLException e){
//            System.out.println(e);
        }
    }

    public void getBranch() throws SQLException {
//        database databaseInstance = database.getInstance();
        ResultSet result = databaseInstance.getStatement().executeQuery("select * from " + tableBranch);
        while (result.next()) {
            System.out.println(result.getInt(columnBranchCode) + " " +
                    result.getString(columnBranchName));
//                    result.getInt(columnAgentsCode)+" "+
//                    result.getString(columnAgentName));
        }
    }

    public void removeBranch(int branchCode) throws SQLException {

        databaseInstance.getStatement().executeQuery("select " + columnBranchCode + " from " +
                tableBranch + " where " + columnBranchCode + "=" + branchCode);
//        System.out.println(BranchCode);
//            while (BranchCode.next()) {
        if (columnBranchCode.isEmpty()) {
            System.out.println("Branch not found");
        }else{
            ResultSet result = databaseInstance.getStatement().executeQuery("select " + columnBranchName + " from " + tableBranch +
                    " where " + columnBranchCode + "=" + branchCode);
            while (result.next()) {
                System.out.println(result.getString(columnBranchName) + " branch removed");
            }
            databaseInstance.getStatement().executeUpdate("delete from " + tableBranch +
                    " where " + columnBranchCode + "=" + branchCode);
        }

    }
}
