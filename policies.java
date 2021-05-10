package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class policies {
    private static String tablePolicy = "Policies";
    private static String columnPolicyNo = "PolicyNo";
    private static String columnAgentsCode = "AgentCode";

    public static void addPolicy(Statement statement, int AgentCode, int PolicyNo) throws SQLException {
        statement.execute("insert into "+ tablePolicy +"("+columnPolicyNo+","+columnAgentsCode+")" +
                " values ("+PolicyNo+","+AgentCode+")");
    }
    public static void getPolicies(Statement statement) throws SQLException {
        ResultSet result = statement.executeQuery("select * from " + tablePolicy);
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
