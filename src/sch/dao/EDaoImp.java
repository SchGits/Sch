package sch.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sch.mapper.Emapper;
import sch.vo.EmpLoyee;
import sch.vo.WorkHistory;
@Repository("dao")
public class EDaoImp implements EDao {

	@Autowired
	Emapper ma;

	@Override
	public List<EmpLoyee> Eall() {
		List<EmpLoyee> eall = ma.Eall();
		return eall;
	}

	@Override
	public EmpLoyee DD(Integer eno) {
		EmpLoyee dd = ma.DD(eno);
		System.out.println(dd);
		return dd;
	}

	@Override
	public void QQ(WorkHistory workHistory) {
		ma.QQ(workHistory);
	}

//	@Override
//	public List<WorkHistory> Wall() {
//		List<WorkHistory> wall = ma.Wall();
//		return null;
//	}

}
