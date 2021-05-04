package com.company;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

public class database {
    public static final String dbName = "lic";
    public static final String connectionString = "jdbc:mysql://localhost/" + dbName;
    public static final String hostName = "root";
    public static final String password = "password";
    public static final String tableBranch = "Branch";
    public static final String columnBranchCode = "BranchCode";
    public static final String columnBranchName = "BranchName";
    public static final String columnAgents = "Agents";

    public static final String tableAgent = "Agents";
    //    public static final String  columnBranchCode = "BranchCode";
    public static final String columnAgentsCode = "AgentCode";
    public static final String columnAgentName = "AgentName";
    public static final String columnPolicies = "Policies";

    public static final String tablePolicy = "Policies";
    public static final String columnPolicyNo = "PolicyNo";

    public boolean open() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(connectionString, hostName, password);
            Statement statement = con.createStatement();
//            statement.execute("create table if not exists "+tableBranch+
//                    "("+columnBranchCode+" int,"+
//                    columnBranchName +" text,primary key("+columnBranchCode+"))");
//            statement.execute("create table if not exists "+tableAgent+
//                    "("+columnBranchCode+" int,"+columnAgentsCode+" int,"+columnAgentName+" text," +
//                    "primary key("+columnAgentsCode+")," +
//                    "foreign key ("+columnBranchCode+") REFERENCES "+tableBranch+"("+columnBranchCode+"))");
//            statement.execute("insert into "+tableBranch + "("+columnBranchCode+","+columnBranchName+")" +
//                    "values (123,'nashik')");
//
//            HashMap<String,Object> nashikBranch = new HashMap<>();
//            nashikBranch.put("branchCode",123);
//            nashikBranch.put("branchName","Nashik");
//            addBranch(statement,nashikBranch);
//            HashMap<String,Object> puneBranch = new HashMap<>();
//            puneBranch.put("branchCode",124);
//            puneBranch.put("branchName","Pune");
//            addBranch(statement,puneBranch);
//
//            addAgent(statement,123,1,"pk");
//            addAgent(statement,124,3,"sk");
            addPolicy(statement,1,12345);
//            statement.execute("select * from "+tableBranch+
//                    " left join "+tableAgent+
//                    "on Branch.BranchCode = Agents.BranchCode");//+tableBranch+"."+columnBranchCode+"="+tableAgent+"."+columnBranchCode);
//            statement.execute("insert into "+ tablePolicy +"("+columnPolicyNo+","+columnAgentsCode+")" +
//                    " values (12345,1)");

            ResultSet result = statement.executeQuery("select * from "+tableBranch+
                    " left join "+tableAgent+
                    " on Branch.BranchCode = Agents.BranchCode");
//            ResultSet result  = statement.executeQuery("select * from "+tableBranch);
            while(result.next()){
                System.out.println(result.getInt(columnBranchCode)+" "+
                        result.getString(columnBranchName)+" "+
                        result.getInt(columnAgentsCode)+" "+
                        result.getString(columnAgentName));
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            return false;
        }
    }
    public void addBranch(Statement statement, HashMap<String,Object> BranchName) throws SQLException {
        statement.execute("insert into " + tableBranch + "(" + columnBranchCode + "," + columnBranchName + ") " +
                "values (" + BranchName.get("branchCode") + ",'" + BranchName.get("branchName") + "')");
    }

    public void addAgent(Statement statement,int BranchCode, int agentCode, String agentName) throws SQLException{
        statement.execute("insert into "+ tableAgent + "("+ columnBranchCode +","+
                columnAgentsCode +","+columnAgentName+")"+
                "values ("+BranchCode+","+agentCode+",'"+agentName+"')");
    }

    public void addPolicy(Statement statement, int AgentCode, int PolicyNo) throws SQLException{
        statement.execute("insert into "+ tablePolicy +"("+columnPolicyNo+","+columnAgentsCode+")" +
                " values ("+PolicyNo+","+AgentCode+")");
    }
}


//    {
//          customerName: "saurabh",
//          customerEmail "skalantri@updatusinc.com"
//    }
//}
//                addCustomer (Dcitionary newCustomer) {
//            sql.execute(insert into customer (name, email) (newCustomer.get("customerName"), newCustomer.customerEMail))
//        }
//
//0