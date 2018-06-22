/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo pc
 */
public class ClassRepresentative {
  private List<Observer> observers = new ArrayList<Observer>();
   private String change;

   public String get() {
      return change;
   }

   public void set(String change) {
      this.change = change;
      notifyAllObservers(change);
   }

   public void subscribe(Observer observer){
      observers.add(observer);		
   }
   public void unsubscribe(Observer observer)
   {
   observers.remove(observer);
   }

   public void notifyAllObservers(String msg){
      for (Observer observer : observers) {
         observer.update(msg);
      }
   } 	
}  

