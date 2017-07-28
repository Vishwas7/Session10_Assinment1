/*
 * Declaring second package MyPack'
 * */
package MyPack;
/*
 * Using the import keyword is used to make the classes and interface 
 * of another package accessible to the current package.
 * */

/*
 * using PackageInJava.* then all the classes and interfaces of this 
 * package will be accessible but not subpackages.
 * 
 * */
import PackageInJava.*; 

//creating a class
public class Banana {
	//main method
	  public static void main(String args[]){  
		  //In here creating object 
		   Apple apl = new Apple(); 
		   // In here calling Apple class
		   apl.accessPack();  
		  } 
	  }
