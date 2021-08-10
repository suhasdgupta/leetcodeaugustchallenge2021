class FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        if(s == null || s.length() <= 0 )
		return 0;

        char[] sChars = s.toCharArray();
        int flipCount = 0;
        int onesCount = 0;

        for(int i=0; i<sChars.length; i++){
            if(sChars[i] == '0'){
                if(onesCount == 0) continue;
                else flipCount++;
            }else{
                onesCount++;
            }
            if(flipCount > onesCount){
                flipCount = onesCount;
            }
        }
        return flipCount;
    }
}
