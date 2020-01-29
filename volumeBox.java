import java.util.*;

class volumeBox{
 static double volumeBoxs(double width,double height,double depth)
{
      return width*height*depth;
}

public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
System.out.println("enter width of box");
   double width= sc.nextDouble();
System.out.println("enter height of box");
   double height= sc.nextDouble();
System.out.println("enter depth of box");
   double depth= sc.nextDouble();
   double volume = volumeBoxs(width,height,depth);
 
  System.out.println("The volume of the Box is"+volume);
}
}

   