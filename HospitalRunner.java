class HospitalRunner{

public static void main(String[] args){
	
	String[] doctorNames=Hospital.getDoctorNames();
	System.out.println(doctorNames);
	
	for(int c=0;c<doctorNames.length;c++){
	System.out.println(doctorNames[c]);
	}
}
}