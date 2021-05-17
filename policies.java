package lic;

import com.company.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class policies extends agent{
    protected static String tablePolicy = "Policies";
     protected static String columnPolicyNo = "PolicyNo";
//    public static String columnAgentsCode = "AgentCode";
    database databaseInstance = database.getInstance();

    public void addPolicy(int AgentCode, int PolicyNo) throws SQLException {     // polymorphism
//        database databaseInstance = database.getInstance();

        databaseInstance.getStatement().executeUpdate("insert into "+ tablePolicy +"("+columnPolicyNo+","+columnAgentsCode+")" +
                " values ("+PolicyNo+","+AgentCode+")");
    }
    public void addPolicy(int PolicyNo) throws SQLException{
        databaseInstance.getStatement().executeUpdate("insert into "+ tablePolicy +"("+columnPolicyNo+")" +
                " values ("+PolicyNo+")");

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
