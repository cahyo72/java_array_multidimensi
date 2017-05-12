import java.io.*;
public class Multi2{
public static void main (String[] args) throws IOException{
	String inData;
	int dua[][] = new int[2][2];
	int x;
	BufferedReader datain =  new BufferedReader(new InputStreamReader(System.in));
	
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{System.out.print("Masukkan Angka : ");
		x = Integer.parseInt(datain.readLine());
		System.out.println("Data indeks ke : "+dua[i][j]);
		}
	}
} 	
	}
		
	