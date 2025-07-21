class CricketerRunner{
	public static void main(String[] args){
		Cricketers c = new Cricketers();
		c.setProfile("Virat",10000,56.2f);
		System.out.println("Name:" + c.getName());
		System.out.println("Runs:" + c.getRuns());
		System.out.println("Avg:" + c.getAvg());
		
		Cricketers c1 = new Cricketers();
		c1.setProfile("Rahul",5000,48.2f);
		System.out.println("Name:" + c1.getName());
		System.out.println("Runs:" + c1.getRuns());
		System.out.println("Avg:" + c1.getAvg());
		
		Cricketers c2 = new Cricketers();
		c2.setProfile("Gayle",12000,45.2f);
		System.out.println("Name:" + c2.getName());
		System.out.println("Runs:" + c2.getRuns());
		System.out.println("Avg:" + c2.getAvg());
		
		Cricketers c3 = new Cricketers();
		c3.setProfile("Shreyas",3000,44.5f);
		System.out.println("Name:" + c3.getName());
		System.out.println("Runs:" + c3.getRuns());
		System.out.println("Avg:" + c3.getAvg());
		
		Cricketers c4 = new Cricketers();
		c4.setProfile("Rishabh",2500,38.2f);
		System.out.println("Name:" + c4.getName());
		System.out.println("Runs:" + c4.getRuns());
		System.out.println("Avg:" + c4.getAvg());
		
		
		System.out.println(" ");
		System.out.println("Parameterized constructor");
		System.out.println("--------------------------");
		
		Cricketers c5 = new Cricketers("Warner",1256,49.9f);
		System.out.println("Name:" + c5.playerName);
		System.out.println("Runs:" + c5.runs);
		System.out.println("Avg:" + c5.avg);
		
		Cricketers c6 = new Cricketers("ABD",2256,39.7f);
		System.out.println("Name:" + c6.playerName);
		System.out.println("Runs:" + c6.runs);
		System.out.println("Avg:" + c6.avg);
		
		Cricketers c7 = new Cricketers("Smith",930,40.3f);
		System.out.println("Name:" + c7.getName());
		System.out.println("Runs:" + c7.getRuns());
		System.out.println("Avg:" + c7.getAvg());
		
		Cricketers c8 = new Cricketers("Rohit",5696,34.9f);
		System.out.println("Name:" + c8.getName());
		System.out.println("Runs:" + c8.getRuns());
		System.out.println("Avg:" + c8.getAvg());
		
		Cricketers c9 = new Cricketers("Surya",4566,38.9f);
		System.out.println("Name:" + c9.getName());
		System.out.println("Runs:" + c9.getRuns());
		System.out.println("Avg:" + c9.getAvg());
	}	
}