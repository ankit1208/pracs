import java.util.*;
import java.io.*;
public class lexical {


    static ArrayList Analyzer(String[] brk,String[] out,boolean num){
        ArrayList output=new ArrayList();
        if(!num){
            for(i=0;i<brk.length;i++){
                for(j=0;j<out.length;j++){
                    if(brk[i].equals(out[j])){
                        output.add(brk[i]);
                    }
                }
            }
        }

        else{
            for(i=0;i<brk.length;i++){
                int val=Integer.parseInt(brk[i]);
            }
        }
        return output;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter input");
        String inp=sc.nextLine();
        String[] brk=inp.split(" ");
        String[] keywords1={"int","string","void","double"};
        String[] deli={";"};
        String[] const1={"1","2","3"};
        String[] op={"+","-","?","*"};
        String[] var={"a"}

        System.out.println("keywords:")

    }
    
}
