package test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main a1 = new Main();
        System.out.println(a1.aP(6));
    }

    public int aP(int target){
        int [] a = {3,4,9,5,12,11,10};
        int i=0;
        for(;i<a.length;i++){
//            System.out.println("i1 = "+a[i]);
//            System.out.println("i2 = "+a[0]);
            if(a[i] > target){
                System.out.println("i3 =  "+i);
                break;
            }
            System.out.println("i4 =  "+i);
        }
        //System.out.println("i 22222=  "+i);
        return i;
    }
}
