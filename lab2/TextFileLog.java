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
public class TextFileLog implements SimpleLog {
    private String[] log ;
    private int size,index;

    public TextFileLog(int size) {
        index = -1;
        this.size=size;
        log = new String [10];
    }

    @Override
    public void insert(String name) {
        if (!full()){
            index++;
            log[index]=name;
        }
        else {
            System.out.println("Log is full");
        }
    }

    @Override
    public boolean full() {
        return size == (index+1);
    }

    @Override
    public int size() {
        return index+1;
    }

    @Override
    public boolean contains(String name) {
        for (int i =0;i<=index;i++){
            if (log[i].compareTo(name)==0){
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete() {
        for (int i=0;i<=index;i++){
            log[i]= null;
        }
        index=-1;
    }

    @Override
    public void display() {
        for (int i=0;i<index;i++){
            System.out.print(""+log[i]);
        }
    }
    
    
}
