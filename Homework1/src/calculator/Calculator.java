package calculator;

public class Calculator {

    public int sum( int m, int n ) {
        if( n >= 0 ) {
            return increment( m, n );
        } else {
            return decrement( m, -n );
        }
    }

    public int subtract( int m, int n ) {
        if( n <= 0 ) {
            return increment( m, -n );
        } else {
            return decrement( m, n );
        }
    }

    private int increment( int m, int n ) {
        for( ; n > 0; n-- ) {
            m++;
        }
        return m;
    }

    public int decrement( int m, int n ) {
        for( ; n > 0; n-- ) {
            m--;
        }
        return m;
    }

    public int multiply( int m, int n ) {
        int signM = ( m >= 0 ) ? 1 : -1;
        int signN = ( n >= 0 ) ? 1 : -1;
        m = ( m > 0 ) ? m : -m;
        n = ( n > 0 ) ? n : -n;
        int result = 0;
        for( ; n > 0; n-- ) {
            result += m;
        }
        if( ( signM < 0 ) ^ ( signN < 0 ) ) {
            result = -result;
        }
        return result;
    }

    public int divide( int m, int n ) {
        if( n == 0 ) {
            throw new ArithmeticException( );
        }
        int signM = ( m >= 0 ) ? 1 : -1;
        int signN = ( n >= 0 ) ? 1 : -1;
        m = ( m > 0 ) ? m : -m;
        n = ( n > 0 ) ? n : -n;
        int q = 0;
        for( ; m > 0; m = m-n ) {
            q++;
        }
        if( m < 0 ) {
            q--;
        }
        if( ( signM < 0 ) ^ ( signN < 0 ) ) {
            q = -q;
        }
        return q;
    }
}
