package strings;
import java.util.*;
public class All_substrings {
	public static void substring(String s) {
		for(int size=0;size<=s.length();size++) {
			for(int i=0;i<=s.length()-size;i++) {
				String t="";
				for(int j=i;j<size+i;j++) {
				t=t+s.charAt(j);
			}
			System.out.println(t);
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("enter string");
     String s=scan.next();
     substring(s);
     }
	} 
