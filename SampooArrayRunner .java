class SampooArrayRunner {
    public static void main(String[] args) {
        SampooArray[] sampoo = new SampooArray[5];

        SampooArray  s1 = new SampooArray();
        s1.setBrand("Head&Sholder");
        s1.setPrice(45.0);
		
       // sampoo[0] = s1;

        SampooArray s2 = new SampooArray();
        s2.setBrand("Induleka");
        s2.setPrice(30.0);
		
        //sampoo[1] = s2;

        SampooArray s3 = new SampooArray();
        s3.setBrand("Mova");
        s3.setPrice(50.0);
		
        //sampoo[2] = s3;

        SampooArray s4 = new SampooArray();
        s4.setBrand("Cinthol");
        s4.setPrice(40.0);
		
       // sampoo[3] = s4;

        SampooArray s5 = new SampooArray();
        s5.setBrand("Liril");
        s5.setPrice(35.0);
		
       // sampoo[4] = s5;
	    for (int i = 0; i < sampoo.length; i++) {
			if(i==0){
				sampoo[i]=s1;
			}else if(i==1){
				sampoo[i]=s2;
			}else if(i==3){
				sampoo[i]=s3;
				}else if(i==4){
				sampoo[i]=s4;
				}else if(i==5){
				sampoo[i]=s5;
				}
		}

        for (int i = 0; i < sampoo.length; i++) {
            SampooArray s = sampoo[i];
			if(s != null){
            System.out.println("Brand: " + s.getBrand());
            System.out.println("Price: " + s.getPrice());
            System.out.println();
			}
			if(sampoo[i]!=null){
				System.out.println("Sampoo Brand: " + sampoo[i].getBrand());
            System.out.println("Sampoo Price: " + sampoo[i].getPrice());
            System.out.println();
			}
        }
    }
}
