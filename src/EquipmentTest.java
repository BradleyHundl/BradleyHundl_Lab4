/*tests to assure that the equipment class is able to meet
standard created by the test*/

public class EquipmentTest 
{
	
//	Tests the equipment constructor and getter methods 
	
	public void fullConstructorTest() throws AssertException
	{
		// creating a new full constructor 
		Equipment newItem = new Equipment("batrope/5,2.2,10.7,used for repelling");
		
		// initializing the actual values
		String actualName = newItem.getName();
		int actualCount = newItem.getCount();
		double actualTotalWeight = newItem.getTotalWeight();
		double actualTotalPrice = newItem.getTotalPrice();
		String actualDescription = newItem.getDescription();
		
		// initializing the should be values
		String shouldBeName = "batrope";
		int shouldBeCount = 8;	// fix 8 back to 5
		double shouldBeTotalWeight = 2.2;
		double shouldBeTotalPrice = 10.7;
		String shouldBeDescription = "used for repelling";
		
		// comparing the actual values to the should be values
		Assert.assertEquals(shouldBeName, actualName);
		Assert.assertEquals(shouldBeCount, actualCount);
		Assert.assertEquals(shouldBeTotalWeight, actualTotalWeight, .2);
		Assert.assertEquals(shouldBeTotalPrice, actualTotalPrice, .2);
		Assert.assertEquals(shouldBeDescription, actualDescription);	
	}
	
	// testing the toString method
	public void equipmentToStringTest() throws AssertException
	{
		Equipment newItem2 = new Equipment("batsword/1,8.9,50.6,used for battle");
		
		String expected = "Name: batsword, Number: 1, Weight: 8.90 lbs, Price: $50.60 - used for battle";
		String actual = newItem2.toString();
		
		Assert.assertEquals(expected, actual);
	}
	
}