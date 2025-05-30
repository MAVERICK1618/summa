import java.util.HashMap;
class java {
    public boolean isIsomorphic(String s, String t) {

        if( s.length() != t.length() ){
            return false;
        }

        Map<Character , Character> map = new HashMap<>();

        for(int i = 0;i<s.length() ;i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if( !map.containsKey(original) ){
                if( !map.containsValue(replacement) ){
                    map.put( original , replacement );
                }
                else{
                    return false;
                }
            }
            else{
                char mapchar = map.get(original);
                if( mapchar != replacement ){
                    return false;
                }
            }
        }
            return true;
    }
}
