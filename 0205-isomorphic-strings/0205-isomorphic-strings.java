class Solution {
    public boolean isIsomorphic(String s, String t) {
        //first we check if theor length is equall or not;
        if(s.length() != t.length()){
            return false ;//if not then we return false ;
        }

        HashMap<Character , Character> hm = new HashMap<>();
        //then we make a hashmap to map the characters of string "s" to characters of string"t";

        //then we used a for loop to map them 
        for(int i = 0 ; i <s.length() ; i++){
            if(hm.containsValue(t.charAt(i))){//this is important
            //we check if the value to which we are mapping is already mapped to other character then we don;t change it;
                continue ;
            }else{//else we map it ;
                hm.put(s.charAt(i),t.charAt(i));
            }
            
        }
        //then we made a string ubilder and used the mapped charcters to check if the string formed using mapped characters id equall
        //to other string or not ;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <s.length() ;i++){
            sb.append(hm.get(s.charAt(i)));
        }
        //then we return it using a comparator ;
        return(sb.toString().equals(t));
        
    }
}