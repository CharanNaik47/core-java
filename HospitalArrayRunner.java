class HospitalArrayRunner{

public static void main(String[] args){

Hosital[] hospitals=new Hosital[2];

Hosital hospital=new Hosital();
hospital.setName("Jaydev");
hospital.setAddress("Micro Layout");
System.out.println(hospital.getAddress());

hospitals[0]=hospital;

Hosital hospital1=new Hosital();
hospital1.setName("Nimanhas");
hospital1.setAddress("");

hospitals[1]=hospital1;

for(int i=0;i<hospitals.length;i++){
System.out.println("Hospitals=== "+i+1); 

Hosital localHospital=hospitals[i];

System.out.println(localHospital.getName());
System.out.println(localHospital.getAddress());
}
}

}