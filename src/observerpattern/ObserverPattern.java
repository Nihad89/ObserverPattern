/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author lenovo pc
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   ClassRepresentative CR=new ClassRepresentative();
   Students s1=new Students(CR,1);
   Students s2=new Students(CR,2);
   Students s3=new Students(CR,3);
   s1.subscribe();
   s2.subscribe();
   s3.subscribe();
   s3.unsubscribe();
   CR.notifyAllObservers("I am your new CR");
// TODO code application logic here
    }
    
}
