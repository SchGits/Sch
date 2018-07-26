package sch.vo;

public class EmpLoyee {

	Integer eno;
	String	empNum;
	String	IDCARD;
	String	empName;
	String	graduate;
	String	lastEducation;

	public EmpLoyee() {
		// TODO Auto-generated constructor stub
	}

	Integer	hId;
	String	changeDate;
	String	result;
	String	deptName;
	String jobType;

	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}

	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getIDCARD() {
		return IDCARD;
	}
	public void setIDCARD(String iDCARD) {
		IDCARD = iDCARD;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGraduate() {
		return graduate;
	}
	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}
	public String getLastEducation() {
		return lastEducation;
	}
	public void setLastEducation(String lastEducation) {
		this.lastEducation = lastEducation;
	}
	public Integer gethId() {
		return hId;
	}
	public void sethId(Integer hId) {
		this.hId = hId;
	}
	public String getChangeDate() {
		return changeDate;
	}
	public void setChangeDate(String changeDate) {
		this.changeDate = changeDate;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	@Override
	public String toString() {
		return "EmpLoyee [eno=" + eno + ", empNum=" + empNum + ", IDCARD=" + IDCARD + ", empName=" + empName
				+ ", graduate=" + graduate + ", lastEducation=" + lastEducation + ", hId=" + hId + ", changeDate="
				+ changeDate + ", result=" + result + ", deptName=" + deptName + ", jobType=" + jobType + "]";
	}

	
	
	






}
