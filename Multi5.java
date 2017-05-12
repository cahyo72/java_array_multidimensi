//Pakai Inputan
import java.io.*;
public class Multi5{
public static void main (String[] eko) throws IOException{
	String inData;
	int[][][] arr3 = {{{10,20,30},{40,50,60}},
					 {{11,21,31},{41,51,61}},
					 {{12,22,32},{42,52,62}}};
	int x;
	BufferedReader datain =  new BufferedReader(new InputStreamReader(System.in));
	
	for(int i=0; i<3; i++)
	{	for(int j=0; j<2; j++)
	{		for(int k=0; k<3; k++)
	
	
		System.out.print("Masukkan Angka : ");
		x = Integer.parseInt(datain.readLine());
		System.out.println("Data indeks ke : "+arr3[i][j]);
		}
	}
} 	
	}
		
	