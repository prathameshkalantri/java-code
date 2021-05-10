package com.company;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class database {
    public static final String dbName = "lic";
    public static final String connectionString = "jdbc:mysql://localhost/" + dbName;
    public static final String hostName = "root";
    public static final String password = "password";
    public static final String columnAgents = "Agents";


    Connection con = null;
    public boolean open() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionString, hostName, password);

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
//            addPolicy(statement,1,12345);
//            addPolicy(statement,2,206);
//            addPolicy(statement,3,207);
//            statement.execute("select * from "+tableBranch+
//                    " left join "+tableAgent+
//                    "on Branch.BranchCode = Agents.BranchCode");//+tableBranch+"."+columnBranchCode+"="+tableAgent+"."+columnBranchCode);
//            statement.execute("insert into "+ tablePolicy +"("+columnPolicyNo+","+columnAgentsCode+")" +
//                    " values (12345,1)");
//            for(int i=0; i<10; i++) {
                branch.getBranch(statement);
                agent.getAgent(statement);
                policies.getPolicies(statement);
//                agentsPolicies(statement, 1);
//            }
//            ResultSet result = statement.executeQuery("select * from "+tableBranch+
//                    " left join "+tableAgent+
//                    " on Branch.BranchCode = Agents.BranchCode");
//            ResultSet result  = statement.executeQuery("select * from "+tableBranch);
//            while(result.next()){
//                System.out.println(result.getInt(columnBranchCode)+" "+
//                        result.getString(columnBranchName)+" "+
//                        result.getInt(columnAgentsCode)+" "+
//                        result.getString(columnAgentName));
//            }
            con.close();

            if (con.isClosed()){
               System.out.println("con closed");
            }
            return true;
//            statement.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            return false;
        }
//        finally {
////            try { rs.close(); } catch (Exception e) { /* Ignored */ }
////            try { ps.close(); } catch (Exception e) { /* Ignored */ }
//            try { con.close(); } catch (Exception e) { /* Ignored */ }
//        }
    }




    /*public void agentsPolicies(Statement statement, int AgentCode) throws SQLException{

        ResultSet result = statement.executeQuery("select "+ tableBranch+"."+columnBranchCode+","+
                tableBranch+"."+columnBranchName+"," +
                tableAgent+"."+columnAgentsCode+","+tableAgent+"."+columnAgentName+"," +
                "count("+columnPolicyNo+") as totalPolicies " +
                "from (("+tableAgent+
                " left join "+tableBranch+" on "+tableBranch+"."+columnBranchCode+"="+tableAgent+"."+ columnBranchCode+")"+
                " left join "+tablePolicy+" on "+tableAgent+"."+columnAgentsCode+"="+ tablePolicy+"."+columnAgentsCode+")"+
                " where "+tableAgent+"."+columnAgentsCode+"="+AgentCode+" group by AgentCode");
        while (result.next()){
            System.out.println(result.getInt(columnBranchCode)+" "+
                    result.getString(columnBranchName)+" "+
                    result.getInt(columnAgentsCode)+" "+
                    result.getString(columnAgentName)+" "+
                    result.getInt("totalPolicies"));
        }

    }*/
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