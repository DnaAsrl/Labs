package main;

public class SimpleNetwork {
    private String a[][];

    public SimpleNetwork(String a[][]) {
        this.a=a;
    }
    
    public void displayHost (){
        for (int i=0;i<a.length;i++){
            System.out.print("Host name: Host "+(i+1));
            for (int j=0;j<a[i].length;j++){
                if (j==0){
                System.out.print(" IP: "+a[i][j]);}
                if (j==1){
                System.out.print(" Subnet Mask: "+a[i][j]);}
                if (j==2){
                System.out.print(" Status: "+a[i][j]);}
            }
            System.out.println("");
        }
    }
    
    public String PingHost (int x,int y){
        if (a[x-1][2].equals("DOWN")){
            return "Host "+x+" cannot ping Host "+y+" because the destination Host "+x+" is down";
        }
        if (a[y-1][2].equals("DOWN")){
            return "Host "+x+" cannot ping Host "+y+" because the destination Host "+y+" is down";
        }
        else
            return null;
    }
    
}
