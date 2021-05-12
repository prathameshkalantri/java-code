package com.company;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class operation1 {
    public static void main(String[] args) throws SQLException {
//        lic1 lic1Object = new lic1();
//        LinkedHashMap<String,Object> saral = new LinkedHashMap<>();
//        saral.put("PolicyName", "jeevan Saral");
//        saral.put("PolicyNumber", 101);
//        saral.put("PolicyHolder", "bharat");
//        saral.put("Premium", 1500);
//
//        HashMap<String,Object> saralPlus = new HashMap<>();
//        saralPlus.put("PolicyName", "Saral Plus");
//        saralPlus.put("PolicyNumber", 114);
//        saralPlus.put("PolicyHolder", "Ramnarayan");
//        saralPlus.put("Premium", 950);
//
//        HashMap<String,Object> anand = new HashMap<>();
//        anand.put("PolicyName", "jeevan Anand");
//        anand.put("PolicyNumber", 102);
//        anand.put("PolicyHolder", "yogita");
//        anand.put("Premium", 1200);
//
//        HashMap<String,Object> anandPlus = new HashMap<>();
//        anandPlus.put("PolicyName", "Anand Plus");
//        anandPlus.put("PolicyNumber", 113);
//        anandPlus.put("PolicyHolder", "vidhit");
//        anandPlus.put("Premium", 900);
//
//        HashMap<String,Object> shanti = new HashMap<>();
//        shanti.put("PolicyName", "jeevan Shanti");
//        shanti.put("PolicyNumber", 103);
//        shanti.put("PolicyHolder", "pratham");
//        shanti.put("Premium", 2000);
//
//        HashMap<String,Object> shantiPlus = new HashMap<>();
//        shantiPlus.put("PolicyName", "Shanti Plus");
//        shantiPlus.put("PolicyNumber", 112);
//        shantiPlus.put("PolicyHolder", "aarav");
//        shantiPlus.put("Premium", 850);
//
//        HashMap<String,Object> wealth = new HashMap<>();
//        wealth.put("PolicyName", "welth plus");
//        wealth.put("PolicyNumber", 104);
//        wealth.put("PolicyHolder", "purva");
//        wealth.put("Premium", 2500);
//
//        HashMap<String,Object> wealthPlus = new HashMap<>();
//        wealthPlus.put("PolicyName", "welth plus");
//        wealthPlus.put("PolicyNumber", 105);
//        wealthPlus.put("PolicyHolder", "Jaynarayan");
//        wealthPlus.put("Premium", 500);
//
//        HashMap<String,Object> umang = new HashMap<>();
//        umang.put("PolicyName", "Umang");
//        umang.put("PolicyNumber", 106);
//        umang.put("PolicyHolder", "durga");
//        umang.put("Premium", 550);
//
//        HashMap<String,Object> umangPlus = new HashMap<>();
//        umangPlus.put("PolicyName", "Umang plus");
//        umangPlus.put("PolicyNumber", 107);
//        umangPlus.put("PolicyHolder", "varsha");
//        umangPlus.put("Premium", 600);
//
//        HashMap<String,Object> child = new  HashMap<>();
//        child.put("PolicyName", "child");
//        child.put("PolicyNumber", 108);
//        child.put("PolicyHolder", "gopal");
//        child.put("Premium", 650);
//
//        HashMap<String,Object> childPlus = new HashMap<>();
//        childPlus.put("PolicyName", "child Plus");
//        childPlus.put("PolicyNumber", 109);
//        childPlus.put("PolicyHolder", "nikhil");
//        childPlus.put("Premium", 700);
//
//        HashMap<String,Object> tarang = new HashMap<>();
//        tarang.put("PolicyName", "tarang");
//        tarang.put("PolicyNumber", 110);
//        tarang.put("PolicyHolder", "Amruta k");
//        tarang.put("Premium", 750);
//
//        HashMap<String,Object> tarangPlus = new HashMap<>();
//        tarangPlus.put("PolicyName", "tarang");
//        tarangPlus.put("PolicyNumber", 111);
//        tarangPlus.put("PolicyHolder", "surbhi k");
//        tarangPlus.put("Premium", 800);
//
//        ArrayList<HashMap<String,Object>> pkPolicy = new ArrayList<>();
//        HashMap<String,Object> pk = new HashMap<>();
//        pk.put("AgentName", "prathamesh");
//        pk.put("AgentCode", 1);
//        pk.put("policies", pkPolicy);
//
//        ArrayList<HashMap<String,Object>> vkPolicy = new ArrayList<>();
//        HashMap<String,Object> vk = new HashMap<>();
//        vk.put("AgentName", "vyanky");
//        vk.put("AgentCode", 2);
//        vk.put("policies", vkPolicy);
//
//        ArrayList<HashMap<String,Object>> skPolicy = new ArrayList<>();
//        HashMap<String,Object> sk = new HashMap<>();
//        sk.put("AgentName", "saurabh");
//        sk.put("AgentCode", 3);
//        sk.put("policies", skPolicy);
//
//        ArrayList<HashMap<String,Object>> NashikAgents = new ArrayList<>();
//        // Agents.add(pk);
//
//        HashMap<String,Object> Nashik = new HashMap<>();
//        Nashik.put("BranchName", "Nashik");
//        Nashik.put("BranchCode", 123);
//        Nashik.put("Agents", NashikAgents);
//
//        lic1Object.AddBranch(Nashik);
//        // HashMap<String,Object> bharatAgent = new HashMap<>();
//
//        lic1Object.AddAgent(123, pk);
//
//
//        // HashMap<String,Object> branch = lic1Object.AddAgent(123);
//        ArrayList<HashMap<String,Object>> PuneAgents = new ArrayList<>();
//        HashMap<String,Object> Pune = new HashMap<>();
//        Pune.put("BranchName", "Pune");
//        Pune.put("BranchCode", 124);
//        Pune.put("Agents",PuneAgents);
//        lic1Object.AddBranch(Pune);
//        lic1Object.AddAgent(124, sk);
//        lic1Object.AddAgent(123, vk);
//        // Object branch = lic1Object.AddAgent(pk);
//        // System.out.println(branch);
//        //lic1Object.AddAgent(Nashik);
//        //System.out.println(branch);
//        //lic1Object.RemoveAgent(123, 1);
//        lic1Object.AddAgent(123, sk);
//        lic1Object.AddPolicy(123, 1, saral);
//
//        saral = new LinkedHashMap<>();
//        saral.put("saiodjsadlas", "hsadklsdjlajdlkjd");
//        lic1Object.AddPolicy(123, 1, saral);
//        lic1Object.AddPolicy(123, 1, anand);
//        lic1Object.AddPolicy(123, 1, wealthPlus);
//        lic1Object.AddPolicy(123, 1, umang);
//
//        lic1Object.AddPolicy(123, 1, umangPlus);
//        lic1Object.AddPolicy(123, 1, child);
//        lic1Object.AddPolicy(123, 1, childPlus);
//        lic1Object.AddPolicy(123, 1, tarang);
//        lic1Object.AddPolicy(123, 1, tarangPlus);
//        lic1Object.AddPolicy(123, 1, shantiPlus);
//        lic1Object.AddPolicy(123, 1, anandPlus);
//        lic1Object.AddPolicy(123, 1, saralPlus);
//        lic1Object.AddPolicy(123, 2, shanti);
//        lic1Object.AddPolicy(124, 3, wealth);
//        System.out.println(lic1Object.fullList());
//        // lic1Object.RemoveBranch(2);
//        lic1Object.RemoveAgent(123, 1);
//        lic1Object.AddAgent(123, sk);
//        lic1Object.showInfo(123, 1);
//        lic1Object.policyInfo(102);
//        // System.out.println(pkPolicy.size());
//        // lic1Object.AddPolicy(124, "saurabh", saral);
//        System.out.println(lic1Object.fullList());
//
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