
package psp_ejercicio8.Tasks;

import java.util.TimerTask;

/**
 * @author Miguel
 */
public class Watch extends TimerTask{
    private String name;
    
    public Watch(String name) {
        this.name = name;
    }
    
    public void run() {
        System.out.println(this.name);
    }
    
}
