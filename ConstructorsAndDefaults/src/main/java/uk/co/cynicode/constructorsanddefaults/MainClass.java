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

package uk.co.cynicode.constructorsanddefaults;

/**
 * This is a constructor class. It means that when it is instantiated, 
 * the method that shares the same name as the class is ran. An example
 * being in this class. When we instantiate a new instance of the class
 * the method MainClass is ran.
 * 
 * @author Matthew David Ball
 */
public class MainClass {
	
	/**
	 * Here we have a variable that belongs to the class and is given
	 * absolutely nothing to initialise itself as. In this instance, 
	 * it'll default to the integer's default of '0'.
	 */
	private int mainTest;
	
	/**
	 * This is another way of saying what a variable will be when it is 
	 * instantiated in the class. As opposed to waiting to be assigned a
	 * value in the rest of the code, it pre-emptively assigns itself a 
	 * value, in this case, 5.
	 */
	private int mainTest2 = 5;
	
	/**
	 * This is the constructor of MainClass. It can be used to do things
	 * when the class is initialised. This can be very helpful when you 
	 * would like to establish connections in a connection class or when
	 * you would like to put a method as a constructor to save on lines 
	 * in the rest of the code.
	 */
	public MainClass() {
		
		//Since we haven't actually assigned this a value yet, it is
		// going to print out the default value of this datatype, in
		// this case, 0.
		System.out.println( mainTest  );
		
		//Then we're going to print out something that we have actually
		// given a value to. This should print out the default value of
		// 5, the thing that we assigned just above us on line 42.
		System.out.println( mainTest2 );
		
	}
	
	/**
	 * We need something to plan out everything and to actually make
	 * all these classes that we're going to be instantiating. This 
	 * is where the main class comes in, ready and waiting to create
	 * these classes and run the constructors within them.
	 * 
	 * @param args : Not used
	 */
	public static void main( String[] args ) {
		
		//Taking it in order, let's instantiate this first so it can
		// run the constructor that is just a few lines above us.
		MainClass main = new MainClass();
		
		//After that, we can run the other constructor in the other
		// class.
		ConstructorClass constructor = new ConstructorClass();
		
	}
	
}