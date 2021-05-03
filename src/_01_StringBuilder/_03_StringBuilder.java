package _01_StringBuilder;


public class _03_StringBuilder {
	 
    public static String append(String str, char[] characters) {
    	StringBuilder builder = new StringBuilder();
    	builder.append(str).toString();
    	builder.append(characters).toString();
        return builder.toString();
    }
    
    public static String reverse(String str) {
    	StringBuilder builder = new StringBuilder();
    	builder.append(str);
        return builder.reverse().toString();
    }
    
    public static String insert(String str, int index, char newChar) {
    	StringBuilder builder = new StringBuilder();
    	builder.append(str).toString();
        return 	builder.insert(index, new char[] {newChar}).toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	StringBuilder builder = new StringBuilder();
    	builder.append(str).toString();
        return builder.delete(startIndex, endIndex).toString();
    }
}