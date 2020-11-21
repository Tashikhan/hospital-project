package hospital;
import javax.swing.JOptionPane;

import hospital.date;
import hospital.time;
public class outdoor extends patient 
{
	private date date;
	private time time;
	private String doctor;
	private int fee;
	outdoor()
	{
		 date date;
		 time time;
		 doctor doctor;
		 int fee;
	}
	public outdoor(String pname,String pcnic,String paddress,int pphoneno,String pgender,int patientage,date date,time time,String doctor,int fee)
	{
		super(pname, pcnic, paddress, pphoneno, pgender, patientage);
        this.date=date;
        this.time=time;
        this.doctor=doctor;
        this.fee=fee;
	}
	
	public date getdate()
	{
		return date;
	}
	public void setdate(date d)
	{
		this.date=d;
	}
	public time gettime()
	{
		return time;
	}
	public void settime(time dt)
	{
		this.time=dt;
	}
	public String getdoctor()
	{
		return doctor;
	}
	public void setdoctor(String dr)
	{
		this.doctor=dr;
	}
	public int getfee()
	{
		return fee;
	}
	public void setfee(int fe)
	{
		this.fee=fe;
	}
	 public void addoutdoorpatient()
	 {
		 super.newpatient();
		 date.inputdate();
		 time.inputtime();
		 doctor.newdoctor();
		 String f=JOptionPane.showInputDialog("Enter fee of indoorpatient");
	     int fee=Integer.parseInt(f);
	 }
	 public void displayoutdoorpatient()
	 {
		 super.patientinfo();
		   date.displaydate();
		   time.displaytime();
		   doctor.doctorinfo();
		   JOptionPane.showMessageDialog(null,"Fee:"+fee,"Fee:",JOptionPane.WARNING_MESSAGE);		   
	 }
}

