class Hosital{

private String name;
private int hospitalNum;
private String address;

int[] numberOfPatientWards={10,20,30,40,50};
int[]numberOfBedCounts={2,5,6,7};
static String[] doctorNames={"Vinyas","Mantan","Sanath","Charan"}; 




public void setName(String name){
	this.name=name;
}

public String getName(){
	return this.name;
}
public void setAddress(String address){
	this.address=address;
}

public String getAddress(){
	return this.address;
}
}