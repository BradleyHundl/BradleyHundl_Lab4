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

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }
    
    public void fullConstructorTest() throws AssertException
    {
    	Animal tiger = new Animal("blue", "tigger", 160.4, 50.1);
    	
    	Assert.assertEquals("blue", tiger.getColor());
    	Assert.assertEquals("tigger", tiger.getName());
    	Assert.assertEquals(160.4, tiger.getWeight(), 0.02);
    	Assert.assertEquals(50.1, tiger.getHeight(), 0.02);
    }
    
    public void toStringTest() throws AssertException
    {
    	Animal tiger = new Animal("blue", "tigger", 160.4, 50.1);
    	String expected = "tigger, a blue-colored animal. 160.4 pounds, 50.1 inches\n";
    	String actual = tiger.toString();
    	
    	Assert.assertEquals(expected, actual);
    }

    // TODO: test full constructor, getters, and toString
    // good?
}

