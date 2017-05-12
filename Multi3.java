public class Multi3
{
 public static void main(String[] eko) {
	int duad[][] = new int[4][5];
	int e = 0;
	
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
			System.out.print(duad[i][j]);
			duad[i][j] = e++;
			}
		}
		}
			}