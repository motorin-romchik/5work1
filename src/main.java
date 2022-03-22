public class main {
    public static void main (String args[]){
        double [] mas = new double [12];
        double array[] = new double []{3,23,54,33,67,234,5,7,9,12};
        for (int i = 0; i< 5;i++){
            mas[i] = i+1;
        }
        for(int i=0;i <12;i++){
            System.out.print(mas[i]+" ");
        }
        double sum = 0;
        for (int i=0; i < 10;i++){
            sum += array[i];
        }
        System.out.println("\nAverage: " + (double) sum/array.length);
    }
}
