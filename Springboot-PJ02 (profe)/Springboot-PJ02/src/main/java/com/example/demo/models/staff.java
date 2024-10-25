package com.example.demo.models;

import org.w3c.dom.NodeList;

public class staff {
    String id;
    String firstname;
    String lastname;
    String nickname;   
    String salary;
    String currency;
    public staff(
	    String id,
	    String firstname,
	    String lastname,
	    String nickname,   
	    String salary,
	    String currency)
    {
	    this.id=id;
	    this.firstname=firstname;
	    this.lastname=lastname;
	    this.nickname=nickname;   
	    this.salary=salary;
	    this.currency=currency;    	
    }

    public String getId() {
		return id;
	}
    public void setId(String id) {
		this.id = id;
	}    
    public String getFirstname() {
		return firstname;
	}
    public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
    public String getLastname() {
		return lastname;
	}
    public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    public String getNickname() {
		return nickname;
	}
    public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@Override 
	public String toString() {
		return 
		"id= " + id + "\n" +
		"firstname= " + firstname + "\n" +
		"lastname= " + lastname + "\n" +
		"nickname= " + nickname + "\n" +
		"salary= " + salary + "\n" + 
		"currency=" +currency ;
	}
}

