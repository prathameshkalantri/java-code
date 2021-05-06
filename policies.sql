SELECT * FROM lic.Policies;
select Branch.BranchCode, Agents.AgentCode, Policies.PolicyNo from ((Branch
left join Agents on Branch.BranchCode = Agents.BranchCode)
left join Policies on Agents.AgentCode = Policies.AgentCode);