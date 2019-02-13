/*tests to make sure the zoo class is able to
function as designed*/
public class ZooTest 
{
	// tests the getTotalHeight, getCapacity, and toString methods of the zoo class
	
	
	public void getTotalHeightTest() throws AssertException
	{
		Zoo coolZoo = new Zoo (1);
		
		Animal Monkey = new Animal("brown", "George", 60.5, 47.8);
		Animal Lion = new Animal("orange", "Timothy", 230, 50.9);
		Animal Bird = new Animal("red", "Simon", 3.2, 7.4);
		
		coolZoo.addAnimal(Monkey);
		coolZoo.addAnimal(Lion);
		coolZoo.addAnimal(Bird);
		
		double actualTotalHeight = coolZoo.getTotalHeight();
		double shouldBeTotalHeight = 106.1;
		
		Assert.assertEquals(shouldBeTotalHeight, actualTotalHeight);
	}
	
	public void getCapacityTest() throws AssertException
	{
		Zoo okcZoo = new Zoo (2);
		
		Animal Monkey = new Animal("brown", "George", 60.5, 47.8);
		Animal Lion = new Animal("orange", "Timothy", 230, 50.9);
		Animal Bird = new Animal("red", "Simon", 3.2, 7.4);
		
		okcZoo.addAnimal(Monkey);
		okcZoo.addAnimal(Lion);
		okcZoo.addAnimal(Bird);
		
		int actualCapacity = okcZoo.getCapacity();
		int shouldBeCapacity = 4;
		
		Assert.assertEquals(shouldBeCapacity, actualCapacity);
	}
	
	public void zooToStringTest() throws AssertException
	{
		Zoo okcZoo = new Zoo (5);
		
		Animal Monkey = new Animal("brown", "George", 60.5, 47.8);
		Animal Lion = new Animal("orange", "Timothy", 230, 50.9);
		Animal Bird = new Animal("red", "Simon", 3.2, 7.4);
		
		okcZoo.addAnimal(Monkey);
		okcZoo.addAnimal(Lion);
		okcZoo.addAnimal(Bird);
		
		String expected = "These animals live in the zoo: \n"
				+ "George, a brown-colored animal. 60.5 pounds, 47.8 inches\n"
				+ "Timothy, a orange-colored animal. 230.0 pounds, 50.9 inches\n"
				+ "Simon, a red-colored animal. 3.2 pounds, 7.4 inches\n";
		String actual = okcZoo.toString();
		
		Assert.assertEquals(expected, actual);		
	}
	
}