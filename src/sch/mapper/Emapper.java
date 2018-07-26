package sch.mapper;

import java.util.List;

import sch.vo.EmpLoyee;
import sch.vo.WorkHistory;

public interface Emapper {
	
	
	List<EmpLoyee> Eall();
	
//	List<WorkHistory> Wall();
	
	EmpLoyee DD(Integer eno);
	
	
	void QQ(WorkHistory workHistory);

}
