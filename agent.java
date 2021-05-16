package lic;

import com.company.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class agent extends branch {
    private static String tableAgent = "Agents";
    //    public static final String  columnBranchCode = "BranchCode";
    public static String columnAgentsCode = "AgentCode";
    public static String columnAgentName = "AgentName";
    public static String columnPolicies = "Policies";
    public static String columnBranchCode = "BranchCode";

    public void addAgent( int BranchCode, int agentCode, String agentName) throws SQLException {
        database databaseInstance1 = database.getInstance();
        databaseInstance1.getStatement().execute("insert into "+ tableAgent + "("+ columnBranchCode +","+
                columnAgentsCode +","+columnAgentName+")"+
                "values ("+BranchCode+","+agentCode+",'"+agentName+"')");
    }
    public void getAgent() throws  SQLException{
        database databaseInstance1 = database.getInstance();
        ResultSet result = databaseInstance1.getStatement().executeQuery("select * from "+tableAgent);
        while(result.next()){
            System.out.println(result.getInt(columnBranchCode)+" "+
//                    result.getString(columnBranchName));
                    result.getInt(columnAgentsCode)+" "+
                    result.getString(columnAgentName));
        }
    }
    public void agentsPolicies(int AgentCode) throws SQLException{
        database databaseInstance = database.getInstance();
        ResultSet result = databaseInstance.getStatement().executeQuery("select "+ tableBranch+"."+columnBranchCode+","+
                tableBranch+"."+columnBranchName+"," +
                tableAgent+"."+columnAgentsCode+","+tableAgent+"."+columnAgentName+"," +
                "count("+ policies.columnPolicyNo+") as totalPolicies " +
                "from (("+tableAgent+
                " left join "+tableBranch+" on "+tableBranch+"."+columnBranchCode+"="+tableAgent+"."+ columnBranchCode+")"+
                " left join "+policies.tablePolicy+" on "+tableAgent+"."+columnAgentsCode+"="+ policies.tablePolicy+"."+columnAgentsCode+")"+
                " where "+tableAgent+"."+columnAgentsCode+"="+AgentCode+" group by AgentCode");
        while (result.next()){
            System.out.println(result.getInt(columnBranchCode)+" "+
                    result.getString(branch.columnBranchName)+" "+
                    result.getInt(columnAgentsCode)+" "+
                    result.getString(columnAgentName)+" "+
                    result.getInt("totalPolicies"));
        }

    }
    public void removeAgent(int agentCode) throws SQLException{
        database databaseInstance = database.getInstance();
        databaseInstance.getStatement().executeQuery("delete from "+tableAgent+
                " where "+columnAgentsCode+"="+agentCode);
    }

}