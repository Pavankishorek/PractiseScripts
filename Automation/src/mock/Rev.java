package mock;

public class Rev {
public static void main(String[] args) {
	String s1="hey123487hey";
	int count=0;
	for (int i=0;i<s1.length();i++){
		char ch=s1.charAt(i);
		if (ch>=48&&ch<=57) {
			count++;
		}
	}
	System.out.println(count);
}
}
