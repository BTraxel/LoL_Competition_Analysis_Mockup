public class PersonalMath {

    public static double Average(double [] TBAv) {
        double Av = 0;
        double size = TBAv.length;
        for (int i =0; i < size; i++){
            Av += TBAv[i];
        }
        Av = Av/size;
        return Av;
    }
    public static double Average(int [] TBAv) {
        double Av = 0;
        double size = TBAv.length;
        for (int i =0; i < size; i++){
            Av += TBAv[i];
        }
        Av = Av/size;
        return Av;
    }
    //Weighted average of all scores (choose different weights for different scores and levels)
    public static double WeightedAverage(double [] TBAv, double [] Weights) {
        double Av = 0;
        double size = 0;
        for (int i =0; i < TBAv.length; i++){
            Av += TBAv[i]*Weights[i];
            size +=  Weights[i];
        }
        Av = Av/size;
        return Av;
    }
    public static double WeightedAverage(int [] TBAv, double [] Weights) {
        double Av = 0;
        double size = 0;
        for (int i =0; i < Weights.length; i++){
            Av += TBAv[i]*Weights[i];
            size +=  Weights[i];
        }
        Av = Av/size;
        return Av;
    }
    //Average of scores disregarding the highest and lowest score.
    public static double NoExtremAverage(double [] TBAv) {
        double Av = 0;
        double min = ComputeMin(TBAv);
        double max = ComputeMax(TBAv);
        for (int i =0; i < TBAv.length; i++){
            Av += TBAv[i];
        }
        Av = (Av-min-max)/((double)TBAv.length-2.0);
        return Av;
    }
    public static double NoExtremAverage(int [] TBAv) {
        double Av = 0;
        double min = ComputeMin(TBAv);
        double max = ComputeMax(TBAv);
        for (int i =0; i < TBAv.length; i++){
            Av += TBAv[i];
        }
        Av = (Av-min-max)/((double)TBAv.length-2);
        return Av;
    }

    public static double ComputeMax(double [] L){
        double max = 0;
        for (double l : L) {
            if (l> max) {
                max = l;
            }
        }
        return max;
    }
    public static double ComputeMax(int [] L){
        double max = 0;
        for (double l : L) {
            if (l> max) {
                max = l;
            }
        }
        return max;
    }

    public static double ComputeMin(double [] L){
        double min = 10;
        for (double l : L) {
            if (l< min) {
                min = l;
            }
        }
        return min;
    }

    public static double ComputeMin(int [] L){
        double min = 10;
        for (double l : L) {
            if (l< min) {
                min = l;
            }
        }
        return min;
    }

    public static double DoubleCorrelation(double[] xs, double[] ys)
    {
        //This class comes from https://stackoverflow.com/questions/28428365/how-to-find-correlation-between-two-integer-arrays-in-java
        double sx = 0.0;
        double sy = 0.0;
        double sxx = 0.0;
        double syy = 0.0;
        double sxy = 0.0;

        double n = xs.length;

        for(int i = 0; i < n; ++i) {
            double x = xs[i];
            double y = ys[i];

            sx += x;
            sy += y;
            sxx += x * x;
            syy += y * y;
            sxy += x * y;
        }

        // covariation
        double cov = sxy / n - sx * sy / n / n;
        // standard error of x
        double sigmax = Math.sqrt(sxx / n -  sx * sx / n / n);
        // standard error of y
        double sigmay = Math.sqrt(syy / n -  sy * sy / n / n);
        // correlation is just a normalized covariation
        double result = cov / sigmax / sigmay;
        if(result == Double.NaN){
            result = 0.0;
        };
        return result;
    }
}