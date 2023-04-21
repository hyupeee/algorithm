class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // my_string.replace(my_string.substring(s, s + overwrite_string.length()), overwrite_string)
        String str = "";
        String a = my_string.substring(0, s);
        String b = my_string.substring(s + overwrite_string.length());
        String c = my_string.substring(s, s + overwrite_string.length()).replace(my_string.substring(s, s + overwrite_string.length()).substring(0), overwrite_string);
        str = a + c + b; 
        return str;
    }
}