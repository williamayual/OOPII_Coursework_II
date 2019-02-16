
package william;
import java.util.ArrayList;
import java.util.Scanner;

public class William {

    
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList();
        
        Scanner shine=new Scanner(System.in);
        System.out.println("enter student (enter exit when done");
        int x=1;
        while(true){
            System.out.println("enter name:"+ x +":");
            String y = shine.next();
            if(y.toLowerCase().equals("exit"))
                break;
            else
                
            {
                 Scanner willy=new Scanner(System.in);
     
     int a=0,b=0,c=0,d=0,e=0,f=0,g=0,j=0;
     String m;
     if(a==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         a=willy.nextInt();
         System.out.println("your result is:" +a);
         
         
     }
     if(b==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         b=willy.nextInt();
         System.out.println("your result is:" +b);
         
         
     }
     if(c==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         c=willy.nextInt();
         System.out.println("your result is:" +c);
         
         
     }
     if(d==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         d=willy.nextInt();
         System.out.println("your result is:" +d);
         
         
     }
     if(e==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         e=willy.nextInt();
         System.out.println("your result is:" +e);
         
         
     }
     if(f==0){
         System.out.println("enter your course unit");
         m=willy.next();
         System.out.println("enter your : " +m);
         System.out.println("enter your result:");
         f=willy.nextInt();
         System.out.println("your result is:" +f);
         
         
     }
     g = a+b+c+d+e+f;
     j=g*100/600;

                name.add(y);
             x++;   
            }
            
            }
            
        
            
        }
        
        
       
       
    }
    

