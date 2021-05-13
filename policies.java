package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class policies {
    public static String tablePolicy = "Policies";
     public static String columnPolicyNo = "PolicyNo";
    public static String columnAgentsCode = "AgentCode";
    database databaseInstance = database.getInstance();

    public void addPolicy(int AgentCode, int PolicyNo) throws SQLException {
//        database databaseInstance = database.getInstance();

        databaseInstance.getStatement().executeUpdate("insert into "+ tablePolicy +"("+columnPolicyNo+","+columnAgentsCode+")" +
                " values ("+PolicyNo+","+AgentCode+")");
    }
    public void getPolicies() throws SQLException {
//        database databaseInstance = database.getInstance();

        ResultSet result = databaseInstance.getStatement().executeQuery("select * from " + tablePolicy);
//        List<String> totalPolicies = new ArrayList<>();
//        totalPolicies.add(columnPolicyNo);
//        System.out.println(totalPolicies);
        while (result.next()) {
            System.out.println(result.getInt(columnAgentsCode)+" " +
                    result.getInt(columnPolicyNo));
            //
        }
    }
    public void removePolicy(int policyNo) throws SQLException{
        databaseInstance.getStatement().executeQuery("delete from "+tablePolicy+
                " where "+columnAgentsCode+"="+policyNo);
    }

}
