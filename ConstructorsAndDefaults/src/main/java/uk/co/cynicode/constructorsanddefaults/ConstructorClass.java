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
 * This is another example of a class that contains 
 * a constructor. The constructor is the method that
 * is ran when a new instance of the whole object is
 * created.
 * 
 * i.e. on the 'new ConstructorClass()' instruction.
 * 
 * @author Matthew David Ball
 */
public class ConstructorClass {
	
	/**
	 * Once again, as in the other class, we're going to have
	 * an example of a non-defined variable, this one, which 
	 * shall default to the default of the datatype. In this 
	 * case, that means that constructorTest is going to be a
	 * null object.
	 */
	private String constructorTest;
	
	/**
	 * And on the other side of things, we have the other item
	 * which /has/ been instantiated to a string. In this case
	 * the string is "Hello World!" and will stay that way for
	 * now.
	 */
	private String constructorTest2 = "Hello World!";
	
	/**
	 * Once again, this is the thing that will be ran when the
	 * class itself is instantiated. It is going to print out 
	 * all the data variables that we have in this class in an
	 * order of some sort or another. Probably the non-defined
	 * followed by the defined.
	 */
	public ConstructorClass() {
		
		//Non-defined variable being printed here...
		System.out.println( constructorTest  );
		
		//Defined variable being printed here...
		System.out.println( constructorTest2 );
		
	};
	
}