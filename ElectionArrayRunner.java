class ElectionArrayRunner {
    public static void main(String[] args) {
        ElectionArray[] elections = new ElectionArray[5];

        ElectionArray e1 = new ElectionArray();
        e1.setCandidate("N. Modi");
        e1.setParty("BJP");

        ElectionArray e2 = new ElectionArray();
        e2.setCandidate("Rahul");
        e2.setParty("Congress");

        ElectionArray e3 = new ElectionArray();
        e3.setCandidate("John");
        e3.setParty("AAP");

        ElectionArray e4 = new ElectionArray();
        e4.setCandidate("Meera");
        e4.setParty("Independent");

        ElectionArray e5 = new ElectionArray();
        e5.setCandidate("Kumarswamy");
        e5.setParty("JDS");

        for (int i = 0; i < elections.length; i++) {
            if (i == 0) 
				elections[i] = e1;
            else if (i == 1)
				elections[i] = e2;
            else if (i == 2) 
				elections[i] = e3;
            else if (i == 3) 
				elections[i] = e4;
            else if (i == 4)
				elections[i] = e5;
        }

        for (int i = 0; i < elections.length; i++) {
            if (elections[i] != null) {
                System.out.println("Candidate: " + elections[i].getCandidate());
                System.out.println("Party: " + elections[i].getParty());
                System.out.println();
            }
        }
    }
}
