/**
 * 
 */
package com.naveen.web.model;

/**
 * @author admin
 *
 */
public class Student {
private int stid;
private int age;
private String name;
/**
 * @return the stid
 */
public int getStid() {
	return stid;
}
/**
 * @param stid the stid to set
 */
public void setStid(int stid) {
	this.stid = stid;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Student [stid=" + stid + ", age=" + age + ", name=" + name + "]";
}


}
