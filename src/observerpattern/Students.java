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
public class Students extends Observer{
public Students(ClassRepresentative CR)
{
    this.CR=CR;
    this.CR.subscribe(this);
}
public void Remove()
{
this.CR.unsubscribe(this);
}

    
   

    @Override
     public void update(String msg) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("An email from CR : "+msg);
    }
}
