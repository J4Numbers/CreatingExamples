//Copyright 2013 Matthew David Ball (numbers@cynicode.co.uk)
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.

package uk.co.cynicode.getsetandformat;

/**
 * This class uses the objects in the class: ClassOfObjects.
 * 
 * This class simply contains a main method and manipulates 
 * all the other objects in the other class as it sees fit. 
 * That is the point of OO code, that you have an object you
 * set once and can access the items within it whenever you 
 * please.
 * 
 * @author Matthew David Ball
 */
public class ClassForObjects {
	
	/**
	 * This is the only method in this class and is hard-coded
	 * to do everything. This is the first method that will be
	 * ran and when it is over, that is when the program will 
	 * end.
	 * 
	 * @param args - Not used.
	 */
	public static void main( String[] args ) {
		
		//Firstly, we have to actually make a new ClassOfObjects
		// for us to use in the rest of this method. To see why,
		// look at the class that we are defining.
		ClassOfObjects objects = new ClassOfObjects();
		
		//Now let's first look at the integer object.
		
		//Before we set it to anything, it sets itself to 0, as
		// can be seen on the output.
		System.out.println( objects.formatInteger() );
		
		//Now let's set it to an integer and display the difference
		// now we've actually defined what it is.
		objects.setObjInt( 50 );
		System.out.println( objects.formatInteger() );
		
		
		
		//Moving onto doubles
		System.out.println( objects.formatDouble() );
		
		//This shows what happens when the double defined has a smaller
		// decimal order than the format string defined it to have.
		objects.setObjDoub( 67.8 );
		System.out.println( objects.formatDouble() );
		
		
		
		//And when the double has a higher decimal order than the format
		// said it would.
		objects.setObjDoub( 76.852 );
		System.out.println( objects.formatDouble() );
		
		
		
		//Now for strings
		System.out.println( objects.formatString() );
		objects.setObjStr( "This is a string!" );
		System.out.println( objects.formatString() );
		
		
		
		//And booleans
		//As a note, a boolean will be printed out in a string
		// as either true or false as opposed to 1 or 0.
		System.out.println( objects.formatBoolean() );
		objects.setObjBool( true );
		System.out.println( objects.formatBoolean() );
		
		
		
		//And sets
		System.out.println( objects.formatSetOfBooleans() );
		objects.getObjSet().add( true );
		objects.getObjSet().add( false );
		System.out.println( objects.formatSetOfBooleans() );
		
		//What is special about a set is that it doesn't allow
		// duplicates and ignores them in any output that is 
		// tried to be plied from it. In a set of booleans, there
		// can only ever be two items in that set.
		objects.getObjSet().add( true );
		System.out.println( objects.formatSetOfBooleans() );
		
		
		
		//Then lists
		System.out.println( objects.formatListOfStrings() );
		objects.getObjList().add( "Hello" );
		objects.getObjList().add( "World!" );
		System.out.println( objects.formatListOfStrings() );
		objects.getObjList().add( "Hallo" );
		objects.getObjList().add( "Welt" );
		System.out.println( objects.formatListOfStrings() );
		
		//A list is basically a set without the restriction of
		// having no duplicates. Here, you can have as many as
		// you want.
		objects.getObjList().add( "Hello" );
		objects.getObjList().add( "World!" );
		System.out.println( objects.formatListOfStrings() );
		
		
		
		//And finally maps...
		System.out.println( objects.formatMapOfIntsToDoubles() );
		
		//A map is a key mapped to a value, so we need to
		// define both when we're setting them.
		objects.getObjMap().put( 50, 76.8 );
		System.out.println( objects.formatMapOfIntsToDoubles() );
		
		//And a map has a Set of keys. This is slightly different
		// to the traditional definition of a set as it's mapped
		// to a list of values. This means that there can only be
		// one key with the name of "hi", but there can be many
		// values with the name of "there". Also, if you try to
		// overwrite a key, the value is overwritten too.
		objects.getObjMap().put( 75, 100.0 );
		objects.getObjMap().put( 50, 75.2 );
		System.out.println( objects.formatMapOfIntsToDoubles() );
		
	}
	
}
