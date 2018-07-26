package sch.dao;

import java.util.List;

import sch.vo.EmpLoyee;
import sch.vo.WorkHistory;

public interface EDao {
	
	
	List<EmpLoyee> Eall();
	
//	List<WorkHistory> Wall();

	EmpLoyee DD(Integer eno);
	void QQ(WorkHistory workHistory);

}
