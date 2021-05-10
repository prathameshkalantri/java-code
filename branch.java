package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class branch {
    public static final String tableBranch = "Branch";
    public static final String columnBranchCode = "BranchCode";
    public static final String columnBranchName = "BranchName";

    public void addBranch(Statement statement, HashMap<String,Object> BranchName) throws SQLException {
        statement.execute("insert into " + tableBranch + "(" + columnBranchCode + "," + columnBranchName + ") " +
                "values (" + BranchName.get("branchCode") + ",'" + BranchName.get("branchName") + "')");
    }
    public static void getBranch(Statement statement) throws  SQLException{
        ResultSet result = statement.executeQuery("select * from "+tableBranch);
        while(result.next()){
            System.out.println(result.getInt(columnBranchCode)+" "+
                    result.getString(columnBranchName));
//                    result.getInt(columnAgentsCode)+" "+
//                    result.getString(columnAgentName));
        }
    }


}
