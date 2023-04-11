package chap06;

public class MyMaum {
    public static void main(String[] args) {
        int str[]={1,2,3,4,5,6,7,8,9};
        int str2[]=new int[9];

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
        //str2=str.clone();
        System.arraycopy(str,0,str2,2,5);
        System.out.println();
        for (int i = 0; i < str2.length; i++) {
            System.out.print(str2[i]+" ");
        }

    }
}
