
package hospital;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class hospitaldemo {
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	System.out.print("entre number of doctors: ");
	int y=input.nextInt();
	doctor d[]=new doctor[y];
	for(int j=0;j<y;j++)
	{
		d[j]=new doctor();
		d[j].input();
	}
	System.out.print("entre the number of patients:");
	int x=input.nextInt();
	patient p[]=new patient[x];
	int flag;
	int doc;
	for(int i=0;i<x;i++)
	{
		System.out.println("1# entre indoor patient:  ");
		System.out.println("2#: entre outdoor patient ");
		System.out.println("3#: entre ur choice ");
		int choice=input.nextInt();
		if(choice==1) {
			p[i]=new indoorpatient();
			flag=0;
			doc=0;
			p[i].input();
			while(flag==0)
			{
				String docname=JOptionPane.showInputDialog("entre doctor name for this patient");
				for(int n=0;n<y;n++)
				{
					if(d[n].getdname().equalsIgnoreCase(docname))
					{
						flag=1;
						doc=1;
						break;
						
					}
					
				}
				if(flag==0)
				{
					System.out.println("this doctor is not found in the hospital choose another doctor");
					
				}
			}
			if(flag==1)
			{
				p[i].input2(d[doc]);
			}
		}
		else if(choice==2)
		{
			p[i]=new outdoor();
			flag=0;
			doc=0;
			p[i].input();
			while(flag==0)
			{
				String docname=JOptionPane.showInputDialog("entre doctor name for this patient");
				for(int n=0;n<y;n++)
				{
					if(docname.equalsIgnoreCase(d[n].getdname()))
					{
						flag=1;
						doc=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("this doctor is not fount in the hospital");
					
				}
			}
			if(flag==1)
			{
				p[i].input2(d[doc]);
				
			}
			
		}
		else
		{
			System.out.println("entre valid choice");
			
		}
	}
	char choice='y';
	int ch;
	do
	{
		System.out.println("1: see the list of all docters: ");
		System.out.println("2: search the doctor by name or department: ");
		System.out.println("3: see the list of all indoor patients: ");
		System.out.println("4: see the list of all appointments on certain day: ");
		System.out.println("5: see the list of appointment of certain doctor: ");
		System.out.println("6: change the date or time of appointment of certain patient: ");
		System.out.println("7: entre ur choice: ");
		ch=input.nextInt();
		if(ch==1)
		{
			for(int i=0;i<y;i++)
			{
				JOptionPane.showMessageDialog(null,"doctor:"+d[i].toString(),"doctor details",JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(choice==2)
		{
			System.out.println("1:search by docter name: ");
			System.out.println("2: search by docter department: ");
			System.out.println("3: entre ur choice: ");
			int ich=input.nextInt();
			if(ich==1)
			{
				flag=0;
				String docname=JOptionPane.showInputDialog("entre doctor name for this patient");
			for(int i=0;i<y;i++) {
				
				if(docname.equalsIgnoreCase(d[i].getdname()))
				{
					JOptionPane.showMessageDialog(null,"doctor:"+d[i].toString(),"doctor details",JOptionPane.WARNING_MESSAGE);
				flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println("docter name not fount");
			}
			}
			else if(ich==2)
			{
				flag=0;
				String ddepart=JOptionPane.showInputDialog("entre department name for the doctor to search");
				for(int n=0;n<y;n++)
				{
					if(ddepart.equalsIgnoreCase(d[n].ddepartment()))
					{
						JOptionPane.showMessageDialog(null,"department name found"+d[n].toString(),"searching",JOptionPane.WARNING_MESSAGE);
						flag=1;
					}
						
				}
				if(flag==0)
				{
					System.out.println("department name not found");
				}
		}
			else
			{
				System.out.println("enter valid choice");
			}
	}
		else if (ch==3)	
		{
			flag=0;
			
			for(int n=0;n<x;n++)
			{
				if(p[n] instanceof indoorpatient)
				{
					JOptionPane.showMessageDialog(null,"indoor patient"+p[n].toString(),"indoor patient",JOptionPane.WARNING_MESSAGE);
					flag=1;
				}
					
			}
			if(flag==0)
			{
				System.out.println("no indoor patient in hospital");
			}
	}
		else if (ch==4)	
		{
           flag=0;
		String appday=JOptionPane.showInputDialog("enter day to list appointment");
		int appd=Integer.parseInt(appday);
			for(int n=0;n<x;n++)
			{
				if(p[n] instanceof outdoor)
				{
					if(appd==p[n].getday())
					{
					JOptionPane.showMessageDialog(null,"appointment"+p[n].toString(),"appointment",JOptionPane.WARNING_MESSAGE);
					flag=1;
				}
					
			}
			if(flag==0)
			{
				System.out.println("no appointment on this day");
			}
			
		}
		}
			else if (ch==5)	
			{
               flag=0;
			String docn=JOptionPane.showInputDialog("enter doctor name to list all appointments");
			
				for(int n=0;n<x;n++)
				{
					if(p[n] instanceof outdoor)
					{
						if(docn.equalsIgnoreCase(p[n].getdoctor()))
						{
						JOptionPane.showMessageDialog(null,"appointment"+p[n].toString(),"appointment",JOptionPane.WARNING_MESSAGE);
						flag=1;
					}
						
				}
				}
				if(flag==0)
				{
					System.out.println("no  doctor appointment on this day");
				}
				
			}
			else if(ch==6)
			{
				System.out.println("1: to search appointment by date");
				System.out.println("2: to search appointment by time");
				System.out.println("enter choice");
				int appch=input.nextInt();
				if(appch==1)
				
					{
			               flag=0;
						String patn=JOptionPane.showInputDialog("enter patient name to change date of  appointment");
						
							for(int n=0;n<x;n++)
							{
								if(p[n] instanceof outdoor)
								{
									if(patn.equalsIgnoreCase(p[n].getpname()))
									{
										p[n].newpatient();
									
									flag=1;
									JOptionPane.showMessageDialog(null,"patient"+p[n].toString(),"with update date",JOptionPane.WARNING_MESSAGE);
								}
									
							}
							}
							if(flag==0)
							{
								System.out.println("no outdoor patient with this name");
							}
							
						}
				if(appch==2)
					
				{
		               flag=0;
					String patn=JOptionPane.showInputDialog("enter patient name to change time of  appointment");
					
						for(int n=0;n<x;n++)
						{
							if(p[n] instanceof outdoor)
							{
								if(patn.equalsIgnoreCase(p[n].getpname()))
								{
									p[n].newpatient();
								
								flag=1;
								JOptionPane.showMessageDialog(null,"patient"+p[n].toString(),"with update time",JOptionPane.WARNING_MESSAGE);
							}
								
						}
						}
						if(flag==0)
						{
							System.out.println("no outdoor patient with this name");
						}
				}
				else
				{
					System.out.println("enter valid choice");
				}
			}
			else
			{
				System.out.println("enter valid choice");	
				}
			
		
	System.out.println("enter whether to continue or not(y/n");	
	choice=input.next().charAt(0);
}while(choice=='y');
}
}



		
	


