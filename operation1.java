package com.company;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class operation1 {
    public static void main(String[] args) throws SQLException {
        database obj = database.getInstance();
        branch branch = new branch();
        policies policy = new policies();
        agent agent = new agent();
        agent.getAgent();
        policy.getPolicies();
        agent.agentsPolicies(1);

        HashMap<String, Object> jalgaon = new HashMap<String, Object>();

        HashMap<String, Object> jalgaon1 = new HashMap<String, Object>();
        jalgaon.put("branchName", "Jalgaon1");
        jalgaon.put("branchCode", 12345);
        HashMap<String, Object> jalgaon2 = new HashMap<String, Object>();
        jalgaon.put("branchName", "Jalgaon2");
        jalgaon.put("branchCode", 1256);
        jalgaon2.put("branchName", "Jalgaon");
        jalgaon2.put("branchCode", 1235);
//        branch.getBranch();
//        branch.addBranch(jalgaon);
        branch.removeBranch(1256);
        branch.getBranch();

//        branch.addBranch(jalgaon1);
//        branch.addBranch(jalgaon2);




    }
}
