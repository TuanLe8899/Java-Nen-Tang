package buoi6;

import java.util.Arrays;

public class ConvertString {

	public static void main(String[] args) {
		String str 		= "D:/GoogleDrive/Doing/__psd/luutruonghailan/zendVN.xyz";
		
		String[] arrStr = str.split("/");
		
		int length 		= arrStr.length;
		int index		= 0;
		
		String[] fileInfo = arrStr[length-1].split("\\.");

		System.out.println("fileName: "+fileInfo[0]);
		System.out.println("fileExtension: "+fileInfo[1]);
	}

}
