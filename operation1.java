//package com.company;
//import lic.agent;
//imp
import lic.*;
//packages
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class operation1 {
    public static void main(String[] args) throws SQLException {

//        database obj = database.getInstance();
        branch branch = new branch();
//        StringBuilder branchCode = new StringBuilder(branch.columnBranchCode);    // String class
//        branchCode.ensureCapacity(34);
        policies policy = new policies();
//        policy.addPolicy(789456);
        agent agent = new agent();
        agent.getAgent();
        policy.getPolicies();
        agent.agentsPolicies(1);

        HashMap<String, Object> jalgaon = new HashMap<String, Object>();

        HashMap<String, Object> jalgaon1 = new HashMap<String, Object>();
        jalgaon1.put("branchName", "Jalgaon1");
        jalgaon1.put("branchCode", 12345);
        HashMap<String, Object> jalgaon3 = new HashMap<String, Object>();
        jalgaon3.put("branchName", "Jalgaon3");
        jalgaon3.put("branchCode", 123456);
       HashMap<String,Object> jalgaon2 = new HashMap<>();
        jalgaon2.put("branchName", "Jalgaon2");
        jalgaon2.put("branchCode", 1235);
//
        ArrayList<HashMap<String,Object>> branches = new ArrayList<>();    // java collection
        branches.add(jalgaon3);
//        branches.add(jalgaon1);
        branch.addBranch(branches);
branches.remove(jalgaon);
branches.remove(jalgaon1);
branches.remove(jalgaon3);
        branches.add(jalgaon2);
//        branch.getBranch();
        System.out.println(branches);
        branch.addBranch(branches);
//        branch.removeBranch(123456);
//        branch.removeBranch(1235);
//        branch.removeBranch(12345);
//        branch.removeBranch(1256);
//        branch.removeBranch(1235);
        branch.getBranch();
        branch.isOpen(lic.branch.Day.SUNDAY);

//        branch.addBranch(jalgaon);
//        branch.addBranch(jalgaon2);


//        branch.getBranch(statement);

//        branch.getBranch(statement);
//        database database1 = new database();
//        database database2 = new database();
//        database database3 = new database();
//        database database4 = new database();
//        database1.open();

//        database2.open();
//        database3.open();
//        database4.open();
//        database.addBranch(Nashik);
//        if(!obj.open()){
//            System.out.println("can't open datasource");
//            return;
//        }


    }
}