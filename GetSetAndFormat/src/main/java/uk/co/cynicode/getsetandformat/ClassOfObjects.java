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
 * @author Cynical
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
	 */
	private double objDoub;
	private String objStr;
	private boolean objBool;
	private Set<Object> objSet = new HashSet<Object>();
	private List<Object> objList = new ArrayList<Object>();
	private Map<Object, Object> objMap = new HashMap<Object, Object>();
	
	public int getObjInt() {
		return objInt;
	}
	
	public double getObjDoub() {
		return objDoub;
	}
	
	public String getObjStr() {
		return objStr;
	}
	
	public boolean getObjBool() {
		return objBool;
	}
	
	public Set<Object> getObjSet() {
		return objSet;
	}
	
	public List<Object> getObjList() {
		return objList;
	}
	
	public Map<Object, Object> getObjMap() {
		return objMap;
	}
	
	public void setObjInt(int objInt) {
		this.objInt = objInt;
	}
	
	public void setObjDoub(double objDoub) {
		this.objDoub = objDoub;
	}
	
	public void setObjStr(String objStr) {
		this.objStr = objStr;
	}
	
	public void setObjBool(boolean objBool) {
		this.objBool = objBool;
	}
	
	public void setObjSet(Set<Object> objSet) {
		this.objSet = objSet;
	}
	
	public void setObjList(List<Object> objList) {
		this.objList = objList;
	}
	
	public void setObjMap(Map<Object, Object> objMap) {
		this.objMap = objMap;
	}
	
}