package prototype;

import java.util.Date;


//测试深复制
public class Sheep2 implements Cloneable {
	private String sname;
	private Date birthday;

	public Sheep2() {
	}
	
	public Sheep2(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
	/**
	 * deep Clone
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		Sheep2 s = (Sheep2) obj;
		s.birthday = (Date) this.birthday.clone();
		return obj;
	}

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
