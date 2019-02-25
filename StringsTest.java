import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StringsTest.
 *
 * @author  Dave Avis
 * @version 2.25.2019
 */
public class StringsTest
{
    /**
     * Tests Strings.dasher()
     */
    @Test(timeout=2000)
    public void dasherTest()
    {
        String[] in = { "Rabbit", "abcdefg", "ComputerScience" };
        String[] out = { "R-a-b-b-i-t", "a-b-c-d-e-f-g", "C-o-m-p-u-t-e-r-S-c-i-e-n-c-e" };
        for( int i = 0; i < in.length; i++ )
        {
            assertEquals( "Failed dasher(\"" + in[i] + "\") (-30 points)", out[i], Strings.dasher( in[i] ) );
        }
    }
    
    /**
     * Tests Strings.lastF()
     */
    @Test(timeout=2000)
    public void lastFTest()
    {
        String[] in = { "Jack Rabbit", "Tom Cat", "Jane Doe" };
        String[] out = { "Rabbit, J.", "Cat, T.", "Doe, J." };
        for( int i = 0; i < in.length; i++ )
        {
            assertEquals( "Failed lastF(\"" + in[i] + "\") (-30 points)", out[i], Strings.lastF( in[i] ) );
        }
    }
    
    /**
     * Tests Strings.pairFlipper()
     */
    @Test(timeout=2000)
    public void pairFlipperTest()
    {
        String[] in = { "Rabbit", "abcdefg", "ComputerScience" };
        String[] out = { "aRbbti", "badcfeg", "oCpmturecSeicne" };
        for( int i = 0; i < in.length; i++ )
        {
            assertEquals( "Failed pairFlipper(\"" + in[i] + "\") (-30 points)", out[i], Strings.pairFlipper( in[i] ) );
        }
    }
}
