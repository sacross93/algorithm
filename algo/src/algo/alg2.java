package algo;

import java.util.*;
class alg2 
{
 public static void main(String[] args) 
 {
  int[] iArray = new int[3];
  for(int i=0;i<iArray.length;i++){
   iArray[i] = i;
  }
  
  System.out.println("배열크기: " + iArray.length);
  for(int i=0;i<iArray.length;i++){
   System.out.println("배열"+i+"값: " + iArray[i]);
  }
  System.out.println("++++++++++++++++++++++++++++++");
  iArray = Arrays.copyOf(iArray, iArray.length + 10);
  System.out.println("배열크기: " + iArray.length);
  for(int i=0;i<iArray.length;i++){
   System.out.println("배열"+i+"값: " + iArray[i]);
  }
 }
}