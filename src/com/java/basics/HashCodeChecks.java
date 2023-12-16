package com.java.basics;

public class HashCodeChecks {
	
	int id;
	String name ;
	HashCodeChecks(int id,String name){
		this.id = id;
		this.name =  name;
		
	}
	HashCodeChecks(int id ){
		this.id = id;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashCodeChecks  obj1 = new HashCodeChecks(10,"naik");
        
        HashCodeChecks  obj2 = new HashCodeChecks(10,"naik");
        
        HashCodeChecks obj3 = new HashCodeChecks(10);
        HashCodeChecks obj4 = new HashCodeChecks (10);
        
        
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
          System.out.println(obj1.equals(obj2));
          System.out.println(obj3.equals(obj4));
        System.out.println("hashcode of obj3 :" + obj3.hashCode() );
        System.out.println("hashcode of obj4 :" + obj4.hashCode());
        System.out.println(obj3==obj4);
	}

}
