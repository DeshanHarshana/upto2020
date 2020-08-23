class SummeReport{
	public static void main(String a[]){
		int Marks[][]={
			{90,70,85,80},
			{68,85,70,90},
			{87,82,90,78},
			{76,70,70,80},
			{93,75,75,90},
		};
		String Film[]={"The Matrix", "Terminator 2", "Titanic", "Avetar"};
		int points[]=new int[4];
		for(int x=0; x<5; x++){
			int max=maxVal(Marks[x]);
			int index=0;
			for(int y=0; y<4; y++){
				if(max==Marks[x][y]){
					index=y;
				}
			}
			points[index]++;
		}
		System.out.println("Summer Report");
		System.out.println("Marks Assign By revievers ");
		System.out.println("\t\tThe Matrix" + "\tTerminator 2" + "\tTitanic" + "\t\tAvetar");
		for(int i=0; i<5; i++){
			System.out.print("Reviever " + (i+1) + "\t");
			for(int j=0; j<4; j++){
				System.out.print(Marks[i][j]+ "\t\t");
			}
			System.out.println();
		}
		for(int i=0; i<points.length; i++){
			if(points[i]==0){
				continue;
			}
			else{
			System.out.println(Film[i] + " = " + points[i] + " Points" );
			}
		}
		System.out.println(Film[Index(points,maxVal(points))] + " is selected as the Best movie of the year!! ");
	}
	static int maxVal(int x[]){
		int max=x[0];
		for(int i=0; i<x.length; i++){
			if(max<x[i]){
				max = x[i];
			}
		}
		return max;
	}
	static int Index(int x[], int val){
		int index=0;
		for(int i=0; i<x.length; i++){
			if(x[i]==val){
				index=i;
			}
		}
		return index;
	}
}