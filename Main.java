import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	public Main() {
//		int []dataList = {1, 2, 3, 3, 4, 5, 6};
//		float mean = Statistic.Mean(dataList);
//		float median = Statistic.Median(dataList);
//		System.out.println("Mean : " + mean);
//		System.out.println(median);
//		
//		int []X = {18, 16, 20, 18, 14, 15, 16, 18, 17, 15};
//		int []Y = {21, 18, 23, 21, 16, 20, 21, 17, 19, 17};
//		float[] regressionLinar = Statistic.LinearRegression(X, Y);
//		for(int r = 0 ; r < regressionLinar.length ; r++) {
//			System.out.println(X[r] + "|" + Y[r] + "|" + regressionLinar[r]);
//		}
//		
//		System.out.println(Statistic.Permutation(5, 3));
//		System.out.println(Statistic.Combination(5, 3));
//		
//		int n = 0;int x = 0;double p = 0;
//		System.out.print("Banyaknya percobaan : ");n=scan.nextInt();scan.nextLine();
//		System.out.print("Percobaan yang ingin dilakukan : ");x=scan.nextInt();scan.nextLine();
//		System.out.print("Kemungkinan sukses : ");p=scan.nextDouble();scan.nextLine();
//		for(int i = x ; i <= n ; i++) {			
//			System.out.println("Kemungkinan percobaan ke-" + i + " : " + Statistic.DistributionBinomial(n, i, p));
//		}
		
//		float []X = {4, 7, 12, 19, 25};
//		float []W = {1, 2, 1, 1, 1};
//		System.out.println(Statistic.HarmonicMean(W, X));
		
//		int []x = {1, 3, 9, 27, 81};
//		System.out.println(Statistic.GeometricMean(x));
		
		System.out.println(Statistic.CircularPermutation(true, 4));
	}

	public static void main(String[] args) {
		new Main();
	}

}
