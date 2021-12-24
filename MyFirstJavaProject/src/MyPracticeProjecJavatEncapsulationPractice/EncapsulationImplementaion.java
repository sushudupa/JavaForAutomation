package MyPracticeProjecJavatEncapsulationPractice;

public class EncapsulationImplementaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating the object instance
		EncapsulationExample obj = new EncapsulationExample();
		
		obj.setName("Harsh");
		obj.setEmpNum(34534);
		obj.setAge(25);
		obj.setMobNum(876565456);
		
		//After the above step, we have to write code for the output. We have to use get method here. 
		//In the above code, we used set method.
		
		System.out.println(obj.getName());
		System.out.println(obj.getEmpNum());
		System.out.println(obj.getAge());
		System.out.println(obj.getMobNum());
		
		
	}

}
