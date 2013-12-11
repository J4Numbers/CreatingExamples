package uk.co.cynicode.getsetandformat;

/**
 *
 * @author Cynical
 */
public class ClassForObjects {
	
	public static String formatObject( int object ) {
		return String.format( "This integer's value is \t %d.", object );
	}
	
	public static String formatObject( double object ) {
		return String.format( "This double's value is \t\t %.2f.", object );
	}
	
	public static String formatObject( String object ) {
		return String.format( "This string's value is \t\t '%s'.", object );
	}
	
	public static String formatObject( boolean object ) {
		return String.format( "This boolean's value is \t %s", object);
	}
	
	public static void main( String[] args ) {
		
		ClassOfObjects objects = new ClassOfObjects();
		
		System.out.println( formatObject( objects.getObjInt() ) );
		objects.setObjInt( 50 );
		System.out.println( formatObject( objects.getObjInt() ) );
		
		objects.setObjDoub( 67.8 );
		System.out.println( formatObject( objects.getObjDoub() ) );
		objects.setObjDoub( 76.852 );
		System.out.println( formatObject( objects.getObjDoub() ) );
		
		System.out.println( formatObject( objects.getObjStr() ) );
		objects.setObjStr( "This is a string!" );
		System.out.println( formatObject( objects.getObjStr() ) );
		
		System.out.println( formatObject( objects.getObjBool() ) );
		objects.setObjBool( true );
		System.out.println( formatObject( objects.getObjBool() ) );
		
	}
	
}
