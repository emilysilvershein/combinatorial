import java.util.*;
public class ThreeNumbers {

  public static void order( int a, int b, int c ) {
    int maximum = Math.max( a, Math.max( b, c ) );
    int minimum = Math.min( a, Math.min( b, c ) );
    int median = a;
    if ( a < b && a < c ) {
      median = Math.min( b, c );
    }
    else if ( a > b && a > c ) {
      median = Math.max( b, c );
    }
    System.out.println( "The maximum is " + maximum + "." );
    System.out.println( "The minimum is " + minimum + "." );
    System.out.println( "The median is " + median + "." );
  }

  public static void angles( double a, double b, double c ) {
    if ( a + b + c != 180 || a <= 0 || b <= 0 || c <= 0 ) {
      System.out.println( "Not a triangle." );
      return;
    }
    if ( a == b && a == c ) {
      System.out.println( "A perfect triangle." );
    }
    else if ( a == b || a == c || b == c ) {
      System.out.println( "A non-perfect isosceles triangle." );
    }
    else {
      System.out.println( "Not an isosceles triangle." );
    }
    if ( a == 90 || b == 90 || c == 90 ) {
      System.out.println( "A right-angled triangle." );
    }
    else if ( a > 90 || b > 90 || c > 90 ) {
      System.out.println( "An obtuse triangle." );
    }
    else {
      System.out.println( "An acute triangle." );
    }
  }

  public static void sides( double a, double b, double c ) {
    if ( a <= 0 || b <= 0 || c <= 0
      || a + b < c || b + c < a || c + a < b ) {
      System.out.println( "Not a triangle." );
      return;
    }
    if ( a == b && a == c ) {
      System.out.println( "A perfect triangle." );
    }
    else if ( a == b || a == c || b == c ) {
      System.out.println( "A non-perfect isosceles triangle." );
    }
    else {
      System.out.println( "Not an isosceles triangle." );
    }
    double aSquare = Math.pow( a, 2 );
    double bSquare = Math.pow( b, 2 );
    double cSquare = Math.pow( c, 2 );
    if ( aSquare + bSquare == cSquare
      || cSquare + bSquare == aSquare
      || cSquare + bSquare == aSquare ) {
      System.out.println( "A right-angled triangle." );
    }
    else if ( aSquare + bSquare < cSquare
      || cSquare + bSquare < aSquare
      || cSquare + bSquare < aSquare ) {
      System.out.println( "An obtuse triangle." );
    }
    else {
      System.out.println( "An acute triangle." );
    }
  }

  public static void main( String[] args ) {
    Scanner keyboard = new Scanner( System.in );
    double a, b, c;
    int x, y, z;
    System.out.print( "Enter three integers: " );
    x = keyboard.nextInt();
    y = keyboard.nextInt();
    z = keyboard.nextInt();
    order( x, y, z );
    System.out.print( "Enter three angles: " );
    a = keyboard.nextDouble();
    b = keyboard.nextDouble();
    c = keyboard.nextDouble();
    angles( a, b, c );
    System.out.print( "Enter three sides: " );
    a = keyboard.nextDouble();
    b = keyboard.nextDouble();
    c = keyboard.nextDouble();
    sides( a, b, c );
  }
}
