package week11_1;

public class AVP extends Employee{

	@Override
	public void salary_calculation(double pay) {	
		System.out.println("Employee salary is " + pay);
	}
	
	@Override
	public void admin_salary(int hours, double pay) {
		System.out.println("Working hours "+ hours + " salary per hour " +pay);
	}
	
	public static void main(String[] args) {
		AVP avp = new AVP();
		avp.salary_calculation(55000);
		avp.admin_salary(15, 19.99);
	}



	

}
