class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String rnaStrand= new String("");
        for(int i=0; i<dnaStrand.length(); i++){
            switch(dnaStrand.charAt(i)){
                case 'C':
                    rnaStrand+="G";
                    break;
                case 'G':
                    rnaStrand+="C";
                    break;
                case 'T':
                    rnaStrand+="A";
                    break;
                case 'A':
                    rnaStrand+="U";
                    break;
            }
        }
        return rnaStrand;
    }

}
