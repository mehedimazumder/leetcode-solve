class Solution {
    public String freqAlphabets(String s) {
        var decrypt = new StringBuilder();
	
	for (var i = s.length() - 1; i >= 0; i--)
		if (s.charAt(i) == '#')
			decrypt.append((char) (Character.getNumericValue(s.charAt(--i)) + 
								   Character.getNumericValue(s.charAt(--i)) * 10 + 
								   'a' - 1));
		else
			decrypt.append((char) (Character.getNumericValue(s.charAt(i)) + 
								   'a' - 1));
								   
	return decrypt.reverse().toString();
    }
}