/* Author: Iftikhar Tapadar
   Date: 12/11/2019
   Section: 1115
   Project Fall 2019
   TestOrphan_Tapadar
*/
//hello
public class TestOrphan_Tapadar {

	public static void main(String[] args) {
		
		//Displays orphanage status before I instantiate the 6 orphans
		Orphan_Tapadar.orphanageStatus();
		//Adds space
		System.out.println();
		
		//I instantiated the 6 orphan objects
		Orphan_Tapadar o1 = new Orphan_Tapadar(2222);
		Orphan_Tapadar o2 = new Orphan_Tapadar(3333);
		Orphan_Tapadar o3 = new Orphan_Tapadar(4444, "John", 3, 'M', "Asian");
		Orphan_Tapadar o4 = new Orphan_Tapadar(5555, "David", 5, 'F', "White");
		Orphan_Tapadar o5 = new Orphan_Tapadar();
		Orphan_Tapadar o6 = new Orphan_Tapadar();
		
		//Prints number of orphan objects / newly created orphans
		System.out.println("The number of orphans are " + Orphan_Tapadar.numOfOrphansObjects + ".");
		//Adds space
		System.out.println();
		
		//Calls orphanInfo() method with all 6 orphans and displays information using all instance variables
		o1.orphanInfo();
		System.out.println();
		o2.orphanInfo();
		System.out.println();
		o3.orphanInfo();
		System.out.println();
		o4.orphanInfo();
		System.out.println();
		o5.orphanInfo();
		System.out.println();
		o6.orphanInfo();
		System.out.println();
		
		
		//Using setters to set name, gender foro1
		o1.setName("Patrick");
		o1.setGender('M');
		//Assigning new value to age and race for o1
		o1.age = 7;
		o1.race = "White";
		
		//Using setters to set name and gender for o2
		o2.setName("Brian");
		o2.setGender('M');
		//Assigning new value to age and race for o2
		o2.age = 9;
		o1.race = "Asian";
		
		//Using setters to set id and name for o6
		o6.setId(6666);
		o6.setName("Sarah");
		
		//Displays updated information for all orphans by calling orphanInfo() method
		o1.orphanInfo();
		System.out.println();
		o2.orphanInfo();
		System.out.println();
		o3.orphanInfo();
		System.out.println();
		o4.orphanInfo();
		System.out.println();
		o5.orphanInfo();
		System.out.println();
		o6.orphanInfo();
		System.out.println();
		
		
		//Introduces three orphans (o3, o4, o6) by calling introduceMyself() method
		o3.introduceMyself();
		System.out.println();
		o4.introduceMyself();
		System.out.println();
		o5.introduceMyself();
		System.out.println();
		
		//Displays number of adopted children 
		System.out.println("The number of orphans adopted is " + Orphan_Tapadar.num_adopted + ".");
		//Adds space
		System.out.println();
		
		//Sets up all 6 orphans to become ready for adoption by calling the readyAdoption() method
		o1.readyAdoption();
		System.out.println();
		o2.readyAdoption();
		System.out.println();
		o3.readyAdoption();
		System.out.println();
		o4.readyAdoption();
		System.out.println();
		o5.readyAdoption();
		System.out.println();
		o6.readyAdoption();
		System.out.println();
		
		//Displays the number of orphans that are adopted
		System.out.println("The number of orphans adopted is " + Orphan_Tapadar.num_adopted + ".");
		System.out.println();
		
		//Checks out the orphans and displays message
		o1.checkOut();
		System.out.println();
		o2.checkOut();
		System.out.println();
		o3.checkOut();
		System.out.println();
		o4.checkOut();
		System.out.println();
		o5.checkOut();
		System.out.println();
		o6.checkOut();
		System.out.println();
		
		//Displays updated orphanage status 
		Orphan_Tapadar.orphanageStatus();	

	}

}
