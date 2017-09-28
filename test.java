public class test{

	public static void main(String[] args){
		//allocate array memory
		Employee employee=new Employee();
		
		employee.name="Falcao";
		employee.hours=40;
		employee.rate=15.50;
		employee.address=new Address[5];
		
		//initialize first element
		address[0]=new Address("King", 100, "K1NGN5");
		System.out.println(employee.address[0].getStreet());
	}
	
	

}