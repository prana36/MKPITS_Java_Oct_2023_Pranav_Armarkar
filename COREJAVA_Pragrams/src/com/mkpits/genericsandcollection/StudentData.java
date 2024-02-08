package com.mkpits.genericsandcollection;

import java.util.Objects;

public class StudentData 
{
	
	private String name ;
	private Long mobileNo;
	
	public StudentData(String name, Long mobileNo) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		return "StudentData [name=" + name + ", mobileNo=" + mobileNo + "]";
	}

	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(mobileNo, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentData other = (StudentData) obj;
		return Objects.equals(mobileNo, other.mobileNo) && Objects.equals(name, other.name);
	} 
		
	

}
