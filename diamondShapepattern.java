import java.util.Scanner;
public class diamondShapepattern {
	public static void main(String[] args) {
	int i,j,k,n;
	System.out.print("Enter number of rows: ");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	for(i=1;i<=n;i++) { //For creating rows
	if(i>=1 && i<=n/2+1){ //for upper half	
		for(j=i;j<=n/2+1;j++) { //For top space
			System.out.print("  ");
		}
		for(k=1;k<i;k++) { //For top first triangle *
			System.out.print(" *");
		}
		for(k=1;k<=i;k++) { //for top second triangle *
			System.out.print(" *");
		}
	}
	else{ //for lower half
		for(j=n/2+1;j<=i;j++) { //for bottom space
			System.out.print("  ");
		}
		for(k=i;k<n;k++) { //for bottom first triangle
			System.out.print(" *");
		}
		for(k=i;k<=n;k++) { //for bottom second triangle
			System.out.print(" *");
		}
	}
		System.out.println();
	}
	}	
}
