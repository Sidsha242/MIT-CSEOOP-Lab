package proj6;

import java.util.*;

class Multitable extends Thread {
   int n;

   Multitable(int num) {
      n = num;
      start();
   }

   public void run() {
      for (int i = 1; i <= 100; i++) {
         int prod = n * i;
         System.out.println(n + " X " + i + " = " + prod);
      }
      System.out.println("");
   }
}

class Tables {
   Multitable t1 = new Multitable(5);
   Multitable t2 = new Multitable(7);
}

public class Multidemo {
   public static void main(String args[]) {
      Multidemo ob = new Multidemo();
   }
}
