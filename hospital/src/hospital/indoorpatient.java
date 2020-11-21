package hospital;
import javax.swing.JOptionPane;

import hospital.date;
public class indoorpatient extends patient
{
    private int wardno;
    private int roomno;
    private int bedno;
    private String doctor;
    private date date;
    private int fee;
    indoorpatient()
    {
    	  int wardno=0;
    	    int roomno=0;
    	  int bedno=0;
    	    doctor doctor;
    	     date date;
    	   int fee=0;
    }
    public indoorpatient(String pname,String pcnic,String paddress,int pphoneno,String pgender,int patientage,int wardno,int roomno,int bedno,int fee)
    {
    	super(pname, pcnic, paddress, pphoneno, pgender, patientage);
    	this.wardno=wardno;
    	this.roomno=roomno;
    	this.bedno=bedno;
      	this.doctor=doctor;
    	this.date=date;
    	this.fee=fee;
     }
   
   public int getwardno()
   {
	   return wardno;
   }
   public void setwardno(int wno)
   {
	   this.wardno=wno;
   }
   public int getroomno()
   {
	   return roomno;
   }
   public void setroomno(int rno)
   {
	   this.roomno=rno;
   }
   public int getbedno()
   {
	   return bedno;
   }
   public void setbedno(int bno)
   {
	   this.bedno=bno;
   }
   public String getdoctor()
   {
	   return doctor;
   }
   public void setdoctor(String dr)
   {
	   this.doctor=dr;
   }
   public date getdate()
   {
	   return date;
   }
   public void setdate(date dt)
   {
	   this.date=dt;
   }
   public int getfee()
   {
	   return fee;
   }
   public void getfee(int fe)
   {
       this.fee=fe;
   }
   public void addindoorpatient()
   {
	   super.newpatient();
	   String wno=JOptionPane.showInputDialog("Enter wardno of patient");
	   int wardno=Integer.parseInt(wno);
	   String rno=JOptionPane.showInputDialog("Enter roomno of patient");
	   int roomno=Integer.parseInt(rno);
	   String bno=JOptionPane.showInputDialog("Enter bedno of patient");
	   int bedno=Integer.parseInt(bno);
	  // this.doctor=new Doctor();
	   doctor.newdoctor();
	//   this.date=new Date();
	   date.inputdate();
	   String feee=JOptionPane.showInputDialog("Enter fee of indoorpatient");
	   int fee=Integer.parseInt(feee);
   }
   public void displayindoorpatient()
   {
	   super.patientinfo();
	   JOptionPane.showMessageDialog(null,"INDORPATIENTINFO:"+wardno+"\t"+roomno+"\t"+bedno+"\t","INDOORPATIENTINFO",JOptionPane.WARNING_MESSAGE);
	   doctor.doctorinfo();
	   date.displaydate();
	   JOptionPane.showMessageDialog(null,"Fee:"+fee,"Fee:",JOptionPane.WARNING_MESSAGE);
   }
}
