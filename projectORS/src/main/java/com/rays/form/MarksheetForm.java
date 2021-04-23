package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MarksheetDTO;

public class MarksheetForm extends BaseForm{
		
		@NotEmpty
	   private String rollNo;
		
		
	   private long studentId;
	   
	   @NotEmpty
	   private String name;
	   
	   @NotNull
	   private Integer physics;
	   
	   @NotNull
	   private Integer chemistry;
	   
	   @NotNull
	   private Integer maths;
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPhysics() {
		return physics;
	}
	public void setPhysics(Integer physics) {
		this.physics = physics;
	}
	public Integer getChemistry() {
		return chemistry;
	}
	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}
	public Integer getMaths() {
		return maths;
	}
	public void setMaths(Integer maths) {
		this.maths = maths;
	}
	   
	@Override
	public BaseDTO getDto() {

	MarksheetDTO dto = initDTO(new MarksheetDTO());
	dto.setChemistry(chemistry);
	dto.setMaths(maths);
	dto.setPhysics(physics);
	dto.setName(name);
	dto.setRollNo(rollNo);
	dto.setStudentId(studentId);
	
	return dto;
	
}
}
