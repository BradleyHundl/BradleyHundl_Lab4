/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {    	
        // Use the default constructor
        Animal animal = new Animal();

        // initializing the actual values
    	String actualColor = animal.getColor();
    	String actualName = animal.getName();
    	double actualWeight = animal.getWeight();
    	double actualHeight = animal.getHeight();
    	
    	// initializing the should be values
    	String shouldBeColor = "unknown";
    	String shouldBeName = "noname";
    	double shouldBeWeight = 0;
    	double shouldBeHeight = 0;
    	
        // comparing the actual values to the should be values
        Assert.assertEquals(shouldBeColor, actualColor);
        Assert.assertEquals(shouldBeName, actualName);
        Assert.assertEquals(shouldBeWeight, actualWeight, 0.03);
        Assert.assertEquals(shouldBeHeight, actualHeight, 0.03);
    }
    
    public void fullConstructorTest() throws AssertException
    {
    	// creating a new full constructor
    	Animal tiger = new Animal("blue", "tigger", 160.4, 50.1);
    	
    	// initializing the actual values
    	String actualColor = tiger.getColor();
    	String actualName = tiger.getName();
    	double actualWeight = tiger.getWeight();
    	double actualHeight = tiger.getHeight();
    	
    	// initializing the should be values
    	String shouldBeColor = "blue";
    	String shouldBeName = "tigger";
    	double shouldBeWeight = 160.4;
    	double shouldBeHeight = 50.1;
    	
    	// comparing the actual values to the should be values
    	Assert.assertEquals(shouldBeColor, actualColor);
    	Assert.assertEquals(shouldBeName, actualName);
    	Assert.assertEquals(shouldBeWeight, actualWeight, 0.02);
    	Assert.assertEquals(shouldBeHeight, actualHeight, 0.02);
    }
    
    // testing the toString method
    public void animalToStringTest() throws AssertException
    {
    	Animal tiger2 = new Animal("green", "bob", 187.2, 70.9);
    	
    	String expected = "bob, a green-colored animal. 187.2 pounds, 70.9 inches\n";
    	String actual = tiger2.toString();
    	
    	Assert.assertEquals(expected, actual);	
    }
    
}

