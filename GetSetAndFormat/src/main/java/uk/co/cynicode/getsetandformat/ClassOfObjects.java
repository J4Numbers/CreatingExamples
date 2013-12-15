/**
 * Copyright 2013 Matthew David Ball (numbers@cynicode.co.uk).
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.co.cynicode.getsetandformat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This is a class of objects. All it does is hold some
 * properties that we define. The methods contained should 
 * only perform operations on the properties within this
 * class. It is no use in overlapping objects in an object 
 * when the overlap should be carried out by a higher order
 * 
 * @author Matthew David Ball
 */
public class ClassOfObjects {
	
	//From here until the next // comment, these are the
	// variables that have been defined inide this class
	// and that we want to store on a more permanant basis
	
	/**
	 * This is an integer. It is a private object which means
	 * that it cannot be accessed directly from outside this 
	 * class.
	 * 
	 * This datatype does not require any formal instantiation 
	 * and defaults to zero when the variable has been declared
	 */
	private int objInt;
	
	/**
	 * This is a double. It is also a private object which
	 * also means that it can't be accessed directly from 
	 * outside the class.
	 * 
	 * This datatype defaults to 0, just like the integer 
	 * variable above.
	 */
	private double objDoub;
	
	/**
	 * This is a string. It can be absolutely anything and
	 * can contain letters, numbers and symbols. Once more
	 * it is a private variable.
	 * 
	 * This datatype defaults to null until it is given a 
	 * value, even if that value is ""
	 */
	private String objStr;
	
	/**
	 * This is a boolean. It can be one of two values, one
	 * or zero (true or false). Once more, it is private. 
	 * 
	 * This datatype defaults to false (or zero) and will 
	 * only change to true when you say that it is now so.
	 */
	private boolean objBool;
	
	/**
	 * This is a set. It is a lot of values that are packed
	 * together into a single set of objects which, according
	 * to present set theory, will ignore duplicates within
	 * the set.
	 * 
	 * Without initialisation, this object will be completely
	 * empty and will not allow for itself to be used until
	 * it is initialised with the HashSet type on the right
	 * with the same datatype as defined in the set type.
	 */
	private Set<Boolean> objSet = new HashSet<Boolean>();
	
	/**
	 * This is a List.
	 */
	private List<String> objList = new ArrayList<String>();
	
	/**
	 * This is a Map. It is a one-dimensional array with a 
	 * second part on the other side. The first side of the
	 * map is made up of a set of UNIQUE keys which each go
	 * to a value. Only the keys have to be unique as many 
	 * keys can go to a single value.
	 * 
	 * Once again, this item needs to be instantiated with 
	 * a different type before it can be used. We use the  
	 * HashMap type with this and define what values go in 
	 * which parts.
	 */
	private Map<Integer, Double> objMap = new HashMap<Integer, Double>();
	
	//Now we move onto methods. Since we have declared all 
	// of our variables to be a private type, we need to be
	// following the conventions of the language and have a
	// get and a set method for each of the variables we've
	// defined above this comment.
	//
	//From here on down to the next //, we're going to make
	// all the get methods and talk about what they are doing
	
	/**
	 * This gets the variable: objInt.
	 * 
	 * It's important to remember how you define a method in
	 * java... In English, what you are saying is:
	 * 
	 * This is a public method that will return an integer. 
	 * It is named getObjInt and takes no parameters.
	 * 
	 * Then you have to actually return what you declared in
	 * the method definition. In this case...
	 * 
	 * @return an integer, as per the method definition
	 */
	public int getObjInt() {
		return objInt;
	}
	
	/**
	 * This gets the variable: objDoub.
	 * 
	 * This is a public method that will return a double.
	 * It is named getObjDoub and takes no parameters.
	 * 
	 * Of course, now that we've said that it'll return a
	 * double, it has to actually do so...
	 * 
	 * @return the double, as per the method definition
	 */
	public double getObjDoub() {
		return objDoub;
	}
	
	/**
	 * This gets the variable: objStr.
	 * 
	 * This is a public method that will return a string.
	 * It is named getObjString and takes no parameters.
	 * 
	 * It must, therefore, return a string.
	 * 
	 * @return a string.
	 */
	public String getObjStr() {
		return objStr;
	}
	
	/**
	 * This gets the variable: objBool.
	 * 
	 * This is a public method that will return a boolean.
	 * It is named getObjBool and takes no parameters.
	 * 
	 * It returns a boolean.
	 * 
	 * @return a boolean.
	 */
	public boolean getObjBool() {
		return objBool;
	}
	
	/**
	 * This gets the variable: objSet.
	 * 
	 * This is a public method that will return a set of Booleans.
	 * It is named getObjSet and takes no parameters.
	 * 
	 * It returns a set of Booleans.
	 * 
	 * @return a set of Booleans.
	 */
	public Set<Boolean> getObjSet() {
		return objSet;
	}
	
	/**
	 * This gets the variable: objList.
	 * 
	 * This is a public method that will return a list of Strings.
	 * It is named getObkList and takes no parameters.
	 * 
	 * It returns a list of strings.
	 * 
	 * @return a list of strings.
	 */
	public List<String> getObjList() {
		return objList;
	}
	
	/**
	 * This gets the variable: objMap.
	 * 
	 * This is a public method that will return a map of integers
	 * that have been mapped to doubles. It is named getObjMap and
	 * takes no parameters.
	 * 
	 * It returns a map of integers mapped onto doubled.
	 * 
	 * @return a map of integers mapped onto doubles.
	 */
	public Map<Integer, Double> getObjMap() {
		return objMap;
	}
	
	//Now that's all the getters out of the way, we move onto the 
	// other half of the necessary methods: the setters. These are
	// how we change the variables that we've defined above here. 
	//
	//The important thing about setters is that they should contain
	// a parameter that we're going to set the variable to now. The
	// parameter must be of the type that the variable is so there 
	// is no type-mismatching.
	//
	//The next // comment is where we shall manipulate the data in 
	// this class and print out formatted strings relating to them.
	
	/**
	 * This sets the variable: objInt.
	 * 
	 * Once again, we can see a lot about the method by just reading
	 * the method definition in plain English.
	 * 
	 * This is a public method that returns nothing. It is named
	 * setObjInt and takes a single integer as a parameter.
	 * 
	 * Now we've read the method definition, we know what has to be
	 * used at some point...
	 * 
	 * The set methods are generally defined by making the two items 
	 * the same name. In this case, objInt is being set to objInt. We
	 * define between the two of them by use of the 'this' keyword. A
	 * wonderful thing that allows us to select a variable in respect
	 * to the class or the local scope. In this instance, this means 
	 * that the class variable 'objInt' is being set to the local var
	 * 'objInt'.
	 * 
	 * @param objInt : The integer that we're going to make objInt 
	 *  (the variable defined in the class) equal to.
	 */
	public void setObjInt(int objInt) {
		this.objInt = objInt;
	}
	
	/**
	 * This sets the variable: objDoub.
	 * 
	 * This is a public method that returns nothing. It is named
	 * setObjDoub and takes a single double as a parameter.
	 * 
	 * @param objDoub : The double that we're going to make the 
	 *  class variable 'objDoub' equal to.
	 */
	public void setObjDoub(double objDoub) {
		this.objDoub = objDoub;
	}
	
	/**
	 * This sets the variable: objStr.
	 * 
	 * This is a public method that returns nothing. It is named
	 * setObjStr and takes a single string as a parameter.
	 * 
	 * @param objStr : The string that we're going to make the 
	 *  class variable 'objStr' equal to.
	 */
	public void setObjStr(String objStr) {
		this.objStr = objStr;
	}
	
	/**
	 * This sets the variable: objBool.
	 * 
	 * This is a public method that returns nothing. It is named
	 * setObjBool and takes a single boolean as a parameter.
	 * 
	 * @param objBool : The boolean that we're going to make the 
	 *  class variable 'objBool' equal to.
	 */
	public void setObjBool(boolean objBool) {
		this.objBool = objBool;
	}
	
	/**
	 * This sets the variable: objSet.
	 * 
	 * This is a public method that returns nothing. It is named
	 * setObjSet and takes a set of booleans as a parameter.
	 * 
	 * @param objSet : The set of booleans that we're going to 
	 *  make the class variable 'objSet' equal to.
	 */
	public void setObjSet(Set<Boolean> objSet) {
		this.objSet = objSet;
	}
	
	/**
	 * This sets the variable: objList.
	 * 
	 * This is a public method that returns nothing. It is named
	 * setObjList and takes a list of strings as a parameter.
	 * 
	 * @param objList : The list of strings that we're going to 
	 *  make the class variable 'objList' equal to.
	 */
	public void setObjList(List<String> objList) {
		this.objList = objList;
	}
	
	/**
	 * This sets the variable: objMap.
	 * 
	 * This is a public method that returns nothing. It is named
	 * setObjMap and takes a map of integers mapped onto doubles
	 * as a parameter.
	 * 
	 * @param objMap : The map of integers mapped onto doubles 
	 *  that we're going to make the class variable 'objMap' 
	 *  equal to.
	 */
	public void setObjMap(Map<Integer, Double> objMap) {
		this.objMap = objMap;
	}
	
	//As promised, from here on in, we start looking at using the
	// data from the other classes for output and to show things 
	// happening on screen.
	//
	//From here to the end, we have methods that return a string 
	// of the contents of the variables in this class.
	
	/**
	 * Creates a formatted string for the objInt variable.
	 * 
	 * This is a public method that will return a string. 
	 * It is called formatInteger and takes no parameters.
	 * 
	 * @return a formated string using the objInt variable
	 */
	public String formatInteger() {
		
		//We have to return a string, so let's return one 
		// which is formatted.
		return String.format( 
				
				//Firstly, we give the method a string to 
				// format and change around.
				"This integer's value is \t %d.",
				
				//Then we give it the integer that is going
				// to take the place of the %d tag in the  
				// string above.
				getObjInt() );
		
	}
	
	/**
	 * Creates a formatted string for the objDoub variable.
	 * 
	 * This is a public method that will return a string.
	 * It is called formatDouble and takes no parameters.
	 * 
	 * @return a formatted string using the objDoub variable
	 */
	public String formatDouble() {
		
		//We need to return a string... so we're doing just
		// that.
		return String.format( 
				
				//Let's make the basic format template for
				// it first and give the double 2 decimal 
				// places to play with.
				"This double's value is \t\t %.2f.", 
				
				//Then give it the actual double to replace
				// the %.2f in the string above.
				getObjDoub() );
		
	}
	
	/**
	 * Creates a formatted string for the objStr variable.
	 * 
	 * This is a public method that will return a string.
	 * It is called formatString and takes no parameters.
	 * 
	 * @return a formatted string using the objStr variable
	 */
	public String formatString() {
		
		//Actually return a string...
		return String.format( 
				
				//Then make a template to follow that we're
				// going to return in a moment.
				"This string's value is \t\t '%s'.",
				
				//Then we have to replace the %s in the string
				// above with the objStr object.
				getObjStr() );
		
	}
	
	/**
	 * Creates a formatted string for the objBool variable.
	 * 
	 * This is a public method that will return a string. 
	 * It is called formatBoolean and takes no parameters.
	 * 
	 * @return a formatted string using the objBool variable
	 */
	public String formatBoolean() {
		
		//Let's return a formatted string
		return String.format( 
				
				//And make the string template
				"This boolean's value is \t %s",
				
				//Then let's replace the %s with the value
				// of the objBool that we want to look at.
				getObjBool() );
		
	}
	
	/**
	 * Creates a formatted string using the objSet variable.
	 * 
	 * We have to do things slightly differently here since we
	 * are dealing with collections of objects that we want to
	 * show to the user.
	 * 
	 * This is a public method that will return a string.
	 * Is is called formatSetOfBooleans and takes no parameters.
	 * 
	 * This is bad practise due to how long the method name is.
	 * It is considered good practise to strike a good balance 
	 * between code readability and method rememberability.
	 * 
	 * @return a formatted string using the objBool variable
	 */
	public String formatSetOfBooleans() {
		
		//Let's instantiate a string object to a value of nothing
		String setString = "";
		
		//And for each value in the set, let's iterate through
		// this for loop in front of us.
		for ( Boolean thisBool : getObjSet() )
			
			//Add the contents of the set to the setString
			// on a completely new line.
			setString += String.format( "\n\t%s", thisBool );
		
		//Then let's return the contents of the set.
		return String.format( 
				
				//Introduce it first
				"The contents of the set are: %s",
				
				//Then replace %s with what we've made
				// earlier.
				setString );
		
	}
	
	/**
	 * Create a formatted string using the objList variable.
	 * 
	 * This is a public method that will return a string. It 
	 * is called formatListOfStrings and takes no parameters.
	 * 
	 * Once again, the long name is considered bad practise.
	 * 
	 * @return a formatted string using the objSet variable
	 */
	public String formatListOfStrings() {
		
		//Start off a new string variable
		String listString = "";
		
		//And for each item in the list...
		for ( String thisStr : getObjList() )
			
			//Add it to the string on a new line
			listString += String.format( "\n\t%s", thisStr );
		
		//Then... using that string we've just made...
		return String.format( 
				
				//Make an introduction for it...
				"The contents of the list are: %s",
				
				//And replace the %s with it
				listString );
		
	}
	
	/**
	 * Create a formatted string using the objMap variable.
	 * 
	 * This is a public method that will return a string.
	 * It is called formatMapOfIntsToDoubles and takes no
	 * parameters.
	 * 
	 * Again... bad practise to make the method names this
	 * long and unwieldy.
	 * 
	 * @return a formatted string using the objMap variable
	 */
	public String formatMapOfIntsToDoubles() {
		
		//Make a new string...
		String mapString = "";
		
		//And for each entry in the map...
		for ( Map.Entry<Integer, Double> thisEntry 
				: getObjMap().entrySet() )
			
			//Add it to the mapString above in the format
			// of the key mapped to the value.
			mapString += String.format( "\n\t%d\t%.2f",
					thisEntry.getKey(),
					thisEntry.getValue() );
		
		//Then return it.
		return String.format( 
				
				//With a template prefix
				"The contents of the map are: %s",
				
				//Followed by the mapString replacing the %s
				mapString );
		
	}
	
	//That is all the methods for now. They all manipulate the 
	// variables that we defined at the start of the class. The
	// classes are all non-static meaning that there must be an
	// instantiation of this object for them to be used; they  
	// cannot be used when the object has not been initialised.
	
}