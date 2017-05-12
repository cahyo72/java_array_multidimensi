import java.io.*;
public class Ar1
{
public static void main(String[] eko) throws IOException
{
	String inData;
	int pjgAry;
	int[] A;
	int x;
	int data=0;
	double rata;
	
		BufferedReader datain = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Masukkan Panjang Array: ");
		pjgAry = Integer.parseInt(datain.readLine());
		A = new int[pjgAry];
		
		for(int i=0; i<pjgAry; i++)
		{System.out.printf("Masukkan Index %d",i);
		 x = Integer.parseInt(datain.readLine());
		 data = data+x;
		 A[i]=x;} 
		 
	System.out.println("Data Array A : ");
	
	for(int i=0; i<pjgAry; i++)
	{System.out.print("Data Index Ke "+i+"="+A[i]);}
	rata=(double)data/pjgAry;
	System.out.println("Rata-Rata Nilai Array Yaitu: "+rata);
	}
		}