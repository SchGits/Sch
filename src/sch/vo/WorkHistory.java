package sch.vo;

public class WorkHistory {

	Integer	hId;
	String	changeDate;
	String	result;
	String	deptName;
	String jobType;
	Integer eno;
	
	public WorkHistory() {
		// TODO Auto-generated constructor stub
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

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	@Override
	public String toString() {
		return "WorkHistory [hId=" + hId + ", changeDate=" + changeDate + ", result=" + result + ", deptName="
				+ deptName + ", jobType=" + jobType + ", eno=" + eno + "]";
	}
	
	
	
	
}
