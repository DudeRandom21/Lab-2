public class Test{

	public static void main(String[] args){
		//allocate array memory
		Employee employee=new Employee();
		
		employee.name="Falcao";
		employee.hours=40;
		employee.rate=15.50;
		employee.address=new Address[5];
		
		//initialize first element
		employee.address[0]=new Address("Queen", 48, "K1P1N2");
		employee.address[1]=new Address("King Edward", 800, "K1N6N5");
		
		//print check
		System.out.println(employee.getName());
		System.out.println(employee.getHours());
		System.out.println(employee.getRate());
		
		//address0
		System.out.println(employee.address[0].getStreet());
		System.out.println(employee.address[0].getNumber());
		System.out.println(employee.address[0].getPostal());
		
		//address1
		System.out.println(employee.address[1].getStreet());
		System.out.println(employee.address[1].getNumber());
		System.out.println(employee.address[1].getPostal());
	}
	
	

}