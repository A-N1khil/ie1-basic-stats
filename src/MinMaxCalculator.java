public class MinMaxCalculator {

    public static void main(String[] args) {
        
        // Create an array of double numbers
        double numbers[] = { 1.9, 6.7, 8.9, 7.8, 2.0 };
    }
    
    public static double findMax(double... numbers) {
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double min(double[] num)
    {
        if(num.length == 0 ){
            return 0;
        }
        double min = num[0];
        for (int i=0; i < num.length; i++)
        {
            if(num[i]<min){
                min=num[i];
            }

        }
        return min;

    }
}
