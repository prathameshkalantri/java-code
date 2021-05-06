SELECT * FROM lic.Agents;
select BranchName,AgentName from Branch
left join Agents on Branch.BranchCode = Agents.BranchCode;
create table Policies (PolicyNo int, AgentCode int,
primary key (PolicyNo),
foreign key (AgentCode) references Agents(AgentCode));