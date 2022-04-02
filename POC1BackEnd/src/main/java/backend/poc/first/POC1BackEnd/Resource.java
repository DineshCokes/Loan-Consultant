package backend.poc.first.POC1BackEnd;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
@Entity
public class Resource {
	private int resId;
	private String resName;
	private String resArea;
	private int resPay;
	private List<String> resSkills=new ArrayList<String>();
	public int getResId() {
		return resId;
	}
	@Override
	public String toString() {
		return "Resource [resId=" + resId + ", resName=" + resName + ", resArea=" + resArea + ", resPay=" + resPay
				+ ", resSkills=" + resSkills + "]";
	}
	public Resource(String resName, String resArea, int resPay, List<String> resSkills) {
		super();
		this.resName = resName;
		this.resArea = resArea;
		this.resPay = resPay;
		this.resSkills = resSkills;
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
	public List<String> getResSkills() {
		return resSkills;
	}
	public void setResSkills(List<String> resSkills) {
		this.resSkills = resSkills;
	}
	

}
