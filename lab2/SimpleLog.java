/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Dina
 */
public interface SimpleLog {
    public void insert(String name);
    public boolean full();
    public int size();
    public boolean contains(String name);
    public void delete();
    public void display();
}
