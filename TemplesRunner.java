class TemplesRunner{

public static void main(String[] args){
	
	Temples[] temple=new Temples[5];
	
	Temples temple1=new Temples();
	temple1.setName("Murdeshwara");
	temple1.setAddress("Bhatkal");
	
	//temple[0]=temple1;
	
	Temples temple2=new Temples();
	temple2.setName("Ganapati");
	temple2.setAddress("Gokarna");
	
	//temple[1]=temple2;
	
	for(int i=0;i<temple.length;i++){
		if(i==0){
			temple[i]=temple1;
		}
		else if(i==1){
			temple[i]=temple2;
		}
	}
	
	for(int i=0;i<temple.length;i++){
		
		Temples allTemple=temple[i];
		
		if(allTemple !=null){
			System.out.println(allTemple.getName());
			System.out.println(allTemple.getAddress());
		}                                                                // Or
		
		if(temple[i] !=null){
			System.out.println("Temple name "+temple[i].getName());
			System.out.println("Temple Address "+temple[i].getAddress());
		}
	}
}
}