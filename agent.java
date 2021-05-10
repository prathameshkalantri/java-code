package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class agent {
private static String tableAgent = "Agents";
    //    public static final String  columnBranchCode = "BranchCode";
    private static String columnAgentsCode = "AgentCode";
    private static String columnAgentName = "AgentName";
    private static String columnPolicies = "Policies";
    private static String columnBranchCode = "BranchCode";

    public static void addAgent(Statement statement, int BranchCode, int agentCode, String agentName) throws SQLException {
        statement.execute("insert into "+ tableAgent + "("+ columnBranchCode +","+
                columnAgentsCode +","+columnAgentName+")"+
                "values ("+BranchCode+","+agentCode+",'"+agentName+"')");
    }
    public static void getAgent(Statement statement) throws  SQLException{
        ResultSet result = statement.executeQuery("select * from "+tableAgent);
        while(result.next()){
            System.out.println(result.getInt(columnBranchCode)+" "+
//                    result.getString(columnBranchName));
                    result.getInt(columnAgentsCode)+" "+
                    result.getString(columnAgentName));
        }
    }


}
