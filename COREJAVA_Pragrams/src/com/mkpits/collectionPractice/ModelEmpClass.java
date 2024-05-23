package com.mkpits.collectionPractice;

public class ModelEmpClass {
	int empId;
	String empName;
	public ModelEmpClass(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public ModelEmpClass() {
		super();
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "ModelEmpClass [empId=" + empId + ", empName=" + empName + "]";
	}
	

}
