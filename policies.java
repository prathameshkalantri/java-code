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

    public static void addPolicy(Statement statement, int AgentCode, int PolicyNo) throws SQLException {
        database databaseInstance = database.getInstance();

        databaseInstance.getStatement().execute("insert into "+ tablePolicy +"("+columnPolicyNo+","+columnAgentsCode+")" +
                " values ("+PolicyNo+","+AgentCode+")");
    }
    public static void getPolicies() throws SQLException {
        database databaseInstance = database.getInstance();

        ResultSet result = databaseInstance.getStatement().executeQuery("select * from " + tablePolicy);
        List<String> totalPolicies = new ArrayList<>();
        totalPolicies.add(columnPolicyNo);
//        System.out.println(totalPolicies);
        while (result.next()) {
            System.out.println(result.getInt(columnAgentsCode)+" " +
                    result.getInt(columnPolicyNo));
            //
        }
    }
}
