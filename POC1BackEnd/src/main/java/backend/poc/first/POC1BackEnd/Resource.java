package backend.poc.first.POC1BackEnd;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Value;
@Entity
@Table(name="profiles")
public class Resource {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pro_id")
	private int resId;
	@Column(name="canditate")
	private String resName;
	@Column(name="Location")
	private String resArea;
	@Column(name="commercials")
	private int resPay;
	@Column(name="profficiency")
	private String[] resSkills;
	@Override
	public String toString() {
		return "Resource [resId=" + resId + ", resName=" + resName + ", resArea=" + resArea + ", resPay=" + resPay
				+ ", resSkills=" + Arrays.toString(resSkills) + "]";
	}
	

	public Resource(String resName, String resArea, int resPay, String[] resSkills) {
		super();
		this.resName = resName;
		this.resArea = resArea;
		this.resPay = resPay;
		this.resSkills = resSkills;
	}
	
	


	public Resource() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String[] getResSkills() {
		return resSkills;
	}


	public void setResSkills(String[] resSkills) {
		this.resSkills = resSkills;
	}
	


	public int getResId() {
		return resId;
	}
	
	
	public void setResId(int resId) {
		this.resId = resId;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResArea() {
		return resArea;
	}
	public void setResArea(String resArea) {
		this.resArea = resArea;
	}
	public int getResPay() {
		return resPay;
	}
	public void setResPay(int resPay) {
		this.resPay = resPay;
	}
	

	

}
