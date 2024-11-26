package model;

public class Menu {
	private int menuid;
	private String menuname;
	private String menudescription;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(int menuid, String menuname, String menudescription) {
		super();
		this.menuid = menuid;
		this.menuname = menuname;
		this.menudescription = menudescription;
	}
	
	public Menu(String menuname, String menudescription) {
		super();
		this.menuname = menuname;
		this.menudescription = menudescription;
	}
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getMenudescription() {
		return menudescription;
	}
	public void setMenudescription(String menudescription) {
		this.menudescription = menudescription;
	}
	@Override
	public String toString() {
		return "Menu [menuid=" + menuid + ", menuname=" + menuname + ", menudescription=" + menudescription + "]";
	}
	
}
