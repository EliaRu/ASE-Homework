package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    Calculator calc = new Calculator( );

    @Test
    public void sum() throws Exception {

        int result = calc.sum( 5, 6 );
        assertEquals( result, 11);
        result = calc.sum( 5, 0 );
        assertEquals( result, 5 );
        result = calc.sum( 5, -3 );
        assertEquals( result, 2 );
        result = calc.sum( -5, 3 );
        assertEquals( result, -2 );
    }

    @Test
    public void subtract() throws Exception {
        int result = calc.subtract( 5, 6 );
        assertEquals( result, -1);
        result = calc.subtract( 5, 0 );
        assertEquals( result, 5 );
        result = calc.subtract( 5, -3 );
        assertEquals( result, 8 );
        result = calc.subtract( -5, 3 );
        assertEquals( result, -8 );
    }

    @Test
    public void multiply() throws Exception {
        int result = calc.multiply( 5, 6 );
        assertEquals( result, 30);
        result = calc.multiply( 5, 0 );
        assertEquals( result, 0 );
        result = calc.multiply( 5, -3 );
        assertEquals( result, -15 );
        result = calc.multiply( -5, 3 );
        assertEquals( result, -15 );
    }

    @Test( expected = ArithmeticException.class )
    public void divide() throws Exception {
        int result = calc.divide( 5, 6 );
        assertEquals( result, 0);
        result = calc.divide( 5, 0 );
        result = calc.divide( 5, -3 );
        assertEquals( result, -2 );
        result = calc.divide( -5, 3 );
        assertEquals( result, -2 );
    }

}