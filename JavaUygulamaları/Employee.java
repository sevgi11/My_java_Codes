
public class Employee {
    private String name;
   public double salary; 
    private int workHours , hireYear;
   
    Employee(int hireYear,int workHours, double salary, String name){
    	this.name=name;
    	this.salary=salary;
    	this.workHours=workHours;
    	this.salary=salary;
    	
    }
    public double tax() {
    	if(this.salary>=1000){
    		return salary * 0.03;
    	}
    	return 0.0;
    		
    }
    public double bonus() {
    	int ekstraHours=this.workHours-40;
    	if(ekstraHours>0) {
    		return 30 * ekstraHours;
    	}
    	return 0.0;
    }
	public double incrase() {
		int year= 2020 - this.hireYear;
		if(year<10) {
			return salary * 0.5;
		}
		else if(year>=10 && year<=20) {
			return salary * 0.10;
		}
		else {
			return salary * 0.15;
		}
		
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee emp1 = new Employee(1985,45,2000,"Kemal");
       System.out.println("Tax :" + emp1.tax());
       System.out.println("Bonus :"+ emp1.bonus());
       System.out.println("Incrase Salary :"+ emp1.incrase());
       double totalSalary= emp1.salary - emp1.tax()+emp1.bonus();
       System.out.println("Total salary with tax and bonus :"+ totalSalary);
       System.out.println("Total salary with the raise of salary :"+ (emp1.salary+emp1.incrase()));
	}

}


