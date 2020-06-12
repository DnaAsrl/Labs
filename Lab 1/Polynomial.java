package main;

public class Polynomial {
    private int degree;
    private double [] a;

    public Polynomial(int degree,double[] a) {
        this.degree =degree;
        this.a = a;
    }
    
    public void displayPoly (){
        int x = a.length-1;
        while (x>=0){
            if (x==a.length-1){
                System.out.print(a[x]);
            }
            if (x==0){
                System.out.printf("%+.2f=0",a[x]);
            }
            else{
                System.out.printf("%+.2f",a[x]);                
            }           
            x--;
        }
        
        System.out.println("");
    }
    
    public double computeX(double x){
        double sum=0;
        for (int i=0;i<degree;i++){
            sum+=a[i]*Math.pow(x,i);
        }
        return sum;
    }
}
