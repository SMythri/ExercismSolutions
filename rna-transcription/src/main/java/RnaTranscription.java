class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        for (int i=0; i<dnaStrand.length(); i++){
            if (dnaStrand.charAt(i)=='G')
                rnaStrand+="C";
            if (dnaStrand.charAt(i)=='C')
				rnaStrand+='G';
			if (dnaStrand.charAt(i)=='T')
				rnaStrand+='A';
			if (dnaStrand.charAt(i)=='A')
				rnaStrand+='U';
		}
	    return rnaStrand;
            
    }
}

