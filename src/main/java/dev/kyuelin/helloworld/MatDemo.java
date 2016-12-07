package dev.kyuelin.helloworld;

import javax.sound.midi.ControllerEventListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linken on 11/1/16.
 */
public class MatDemo {
    public static void main(String[] args) {

        List<List<ControllerEventListener>> listenerList = new ArrayList<List<ControllerEventListener>>();
        for (int i=40000; i>0; i--) {
            List<ControllerEventListener> lstenlist = new ArrayList<ControllerEventListener>();
            listenerList.add(lstenlist);
        }

        while(true) {
        }
    }
}
