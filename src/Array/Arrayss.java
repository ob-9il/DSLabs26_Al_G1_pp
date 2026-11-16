package Array;

public class Arrayss{
    public void update(int []a,int index,int nvalue){
        if(index<0 || index>=a.length)
            System.out.println("index not found");
        else {
            a[index] = 0;
        }
    }
}
