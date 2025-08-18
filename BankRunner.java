class BankRunner{

public static void main(String[] args){
	
	Bank bank1=new Bank("Manthan",24617,"Ankola",9467656432L,90.000f);
	
	System.out.println(bank1.getName());
	System.out.println(bank1.getAccountNo());
	System.out.println(bank1.getAddress());
	System.out.println(bank1.getMobileNumber());
	System.out.println(bank1.getAmount());
	System.out.println();

	
	Bank bank2=new Bank("Sanath",24618,"Kumata",6345891920L,73.000f);
	
	System.out.println(bank2.getName());
	System.out.println(bank2.getAccountNo());
	System.out.println(bank2.getAddress());
	System.out.println(bank2.getMobileNumber());
	System.out.println(bank2.getAmount());
	System.out.println();

	
	Bank bank3=new Bank("Akash",24619,"kasaragodu",9146395624L,40.000f);
	
	System.out.println(bank3.getName());
	System.out.println(bank3.getAccountNo());
	System.out.println(bank3.getAddress());
	System.out.println(bank3.getMobileNumber());
	System.out.println(bank3.getAmount());
	System.out.println();

	
	Bank bank4=new Bank("Ganapati",25000,"Sirsi",9467753596L,55.000f);
	
	System.out.println(bank4.getName());
	System.out.println(bank4.getAccountNo());
	System.out.println(bank4.getAddress());
	System.out.println(bank4.getMobileNumber());
	System.out.println(bank4.getAmount());
	System.out.println();
	
	Bank bank5=new Bank("Pralhad",25001,"Karwar",9457244590L,47.000f);
	
	System.out.println(bank5.getName());
	System.out.println(bank5.getAccountNo());
	System.out.println(bank5.getAddress());
	System.out.println(bank5.getMobileNumber());
	System.out.println(bank5.getAmount());
}
}