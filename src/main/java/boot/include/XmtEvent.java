package boot.include;

public class XmtEvent {
    private int Envet_id;
    private String st_date;
    private String ed_date;
    private String ename;
    private String eaddr;
    private double price;
    private String sts;
    private int max_people;
    
    
    
    
	public int getEnvet_id() {
		return Envet_id;
	}
	public void setEnvet_id(int envet_id) {
		Envet_id = envet_id;
	}
	public String getSt_date() {
		return st_date;
	}
	public void setSt_date(String st_date) {
		this.st_date = st_date;
	}
	public String getEd_date() {
		return ed_date;
	}
	public void setEd_date(String ed_date) {
		this.ed_date = ed_date;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSts() {
		return sts;
	}
	public void setSts(String sts) {
		this.sts = sts;
	}
	public int getMax_people() {
		return max_people;
	}
	public void setMax_people(int max_people) {
		this.max_people = max_people;
	}
	

	
	public XmtEvent() {
		super();
	}
	@Override
	public String toString() {
		return "XmtEvent [Envet_id=" + Envet_id + ", st_date=" + st_date + ", ed_date=" + ed_date + ", ename=" + ename
				+ ", eaddr=" + eaddr + ", price=" + price + ", sts=" + sts + ", max_people=" + max_people + "]";
	}
	public XmtEvent(int envet_id, String st_date, String ed_date, String ename, String eaddr, double price, String sts,
			int max_people) {
		super();
		Envet_id = envet_id;
		this.st_date = st_date;
		this.ed_date = ed_date;
		this.ename = ename;
		this.eaddr = eaddr;
		this.price = price;
		this.sts = sts;
		this.max_people = max_people;
	}
	public XmtEvent(int envet_id) {
		super();
		Envet_id = envet_id;
	}
	
    
  
    
    
    
}
