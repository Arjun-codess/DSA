class Solution {
    public int hIndex(int[] citation) {
        Arrays.sort(citation);
        
        for(int i=0; i< citation.length; i++){
            int h = citation.length -i;
            if(citation[i] >= h){
                return h;
            }
        }
        return 0;
    }
}