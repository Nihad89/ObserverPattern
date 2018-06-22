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
public abstract class Observer {
protected ClassRepresentative CR;
protected int Id;
public abstract void update(String msg);
}
