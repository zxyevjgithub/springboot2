package boot.include;

import java.io.Serializable;


public class User implements Serializable{
       long auto_seq;
       
       long id;
       String name;
       String password;
       String addr;
 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public User(long auto_seq, long id, String name, String password, String addr) {
		super();
		this.auto_seq = auto_seq;
		this.id = id;
		this.name = name;
		this.password = password;
		this.addr = addr;
	}
	
	public User(  long id, String name, String password, String addr) {
		super();
		 
		this.id = id;
		this.name = name;
		this.password = password;
		this.addr = addr;
	}
	
    
	public User(long id) {
		super();
		this.id = id;
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [seq=" + auto_seq + ", id=" + id + ", name=" + name + ", password=" + password + ", addr=" + addr + "]";
	}
	public long getAuto_seq() {
		return auto_seq;
	}
	public void setAuto_seq(long auto_seq) {
		this.auto_seq = auto_seq;
	}
	 
   
}
