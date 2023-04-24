package Java;

import java.util.Arrays;

public class Duplicatechar {

	public static void main(String[] args) {
//		String s="ashishshwessww ashdhidh kkawawalelee";
//		s=s.replace(" ", "");
//        char Names[]=s.toCharArray();
//        int count;
//        for(int i=0;i<Names.length;i++) {
//        	count=1;
//        for(int j=i+1;j<Names.length;j++) {
//        if(Names[i]==Names[j]&&Names[i]!=' ') {
//        	count++;
//        	Names[j]='0';
//        } }
//        if(count>1 && Names[i]!='0') {
//        System.out.println(Names[i]+"==>"+count);	
//        }   	
//        }
      
		int Arr[]= {1,2,3,4,5,6,7,8,9,4,8,5,6,2,4,5,6,2,8,4,56,1,12,1};
		 int count=0;
		 Arrays.sort(Arr);
		for(int i=0;i<Arr.length;i++) {
			count=1;
		for(int j=i+1;j<Arr.length;j++) {
			if(Arr[i]==Arr[j]) {
			count++;	
			}
		}
		if(count>=1 && Arr[i]!=' ') {
			System.out.println(Arr[i]+"==>"+count);
			i+=(count-1);
		}
		}
		
   
	}
}
