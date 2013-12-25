/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceClasses;

/**
 *
 * @author zhoushuwen
 */
public class SampleFrame implements FrameInterface{
    String name;
    public SampleFrame(String theName){
        name = theName;
    }
    @Override
    public String getFrameName() {
       return name;
    }
    /*
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    */
}
