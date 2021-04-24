import java.util.ArrayList;

public class Statistic {
	Math math;
	public static float Mean(int []dataList) {
		int total = 0;
		for(int i = 0 ; i < dataList.length ; i ++) {
			total += dataList[i];
		}
		float mean = 0;
		mean = (float)total / dataList.length;
		return mean;
	}
	
	public static float Median(int []dataList) {
		int position1, position2;
		float median = 0;
		for(int i = 0 ; i < dataList.length ; i ++) {
			if(dataList.length%2==0) {
				position1 = dataList.length/2;
				position2 = dataList.length/2 + 1;
				median = (dataList[position1] + dataList[position2])/2;
			}else {
				median = dataList[dataList.length/2];
			}
		}
		return median;
	}
	
	public static float[] LinearRegression(int []Xdependent, int []Yindependent) {
		int []Xpow = new int[Xdependent.length];
		int []Ypow = new int[Yindependent.length];
		for(int i = 0 ; i < Xdependent.length ; i ++) {
			Xpow[i] = (int)Math.pow(Xdependent[i], 2);
		}
		for(int j = 0 ; j < Yindependent.length ; j ++) {
			Ypow[j] = (int)Math.pow(Yindependent[j], 2);
		}
		
		int []XY = new int[Xdependent.length];
		for(int k = 0 ; k < Ypow.length ; k++) {
			XY[k] = Xdependent[k] * Yindependent[k];
		}
		int sigXY = 0;int sigX = 0;int sigY = 0;int sigXpow = 0;int sigYpow = 0;
		float b = 0; float a = 0;
		for(int l = 0 ; l < XY.length ; l++) {
			sigXY += XY[l];
			sigX += Xdependent[l];
			sigY += Yindependent[l];
			sigXpow += Xpow[l];
			sigYpow += Ypow[l];
		}
		
		b = (float) ((float)((XY.length*sigXY) - (sigX * sigY)) / (XY.length*sigXpow - Math.pow(sigX, 2)));
		a = Mean(Yindependent) - (b * Mean(Xdependent));
		
		float []Y = new float[Yindependent.length];
		for(int m = 0 ; m < Yindependent.length ; m++) {
			Y[m] = a + (b*Xpow[m]);
		}
		return Y;
	}
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}else {
			return n * factorial(n - 1);
		}
	}
	
	public static int Combination(int n, int r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}
	
	public static int Permutation(int n, int r) {
		return factorial(n) / factorial(n-r);
	}
	
	public static double DistributionBinomial(int n, int x, double p) {
		double q = 1 - p;
		double dist = (double) ((double)Combination(n, x) * Math.pow(p, x) * Math.pow(q, n-x));
		return dist;
	}
	
	public static double HarmonicMean(float []weight, float []variableValue) {
		float [] wPerX = new float[weight.length];
		float total = 0;
		float wTotal = 0;
		for(int i = 0 ; i < weight.length ; i++) {
			wPerX[i] = weight[i] / variableValue[i];
			total += wPerX[i];
			wTotal += weight[i];
		}
		return wTotal / total;
	}

	public static int GeometricMean(int []x) {
		float gm = 1;
		for(int i = 0 ; i < x.length ; i++) {
			gm *= x[i];
		}
		return (int)Math.pow(gm, 1.0/(float)x.length);
	}
	
	public static float CircularPermutation(boolean anticlockwise, int n) {
		return anticlockwise == true ? factorial(n-1) / factorial(2) : factorial(n-1);
	}
	
	public static float MeanDifferent(int []x1, int []x2) {
		return Mean(x1) - Mean(x2);
	}
}
