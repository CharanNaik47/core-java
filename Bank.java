class Bank{

private String name;
private int account_No;
private String address;
private long mobile_No;
private float have_amount;

public Bank(){
}

public Bank(String name,int account_No){
System.out.println("Initializing account name,number");
this.name=name;
this.account_No=account_No;
}

public Bank(String name,int account_No,String address){
//this.name=name;
//this.account_No=account_No;
this(name,account_No);
System.out.println("Initializing address");
this.address=address;
}

public Bank(String name,int account_No,String address,long mobile_No){
this(name,account_No,address);
System.out.println("Initializing mobile number");
this.mobile_No=mobile_No;
}

public Bank(String name,int account_No,String address,long mobile_No,float have_amount){
this(name,account_No,address,mobile_No);
System.out.println("Initializing accounter amount");
this.have_amount=have_amount;
}
public String getName(){
	return name;
}
public int getAccountNo(){
	return account_No;
}
public String getAddress(){
	return address;
}
public long getMobileNumber(){
	return mobile_No;
}
public float getAmount(){
	return have_amount;
}
}