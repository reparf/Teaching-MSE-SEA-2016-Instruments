/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author TGDMERE7
 */
public class Flute implements IInstrument{
    private int SoundVolume;
    private String color;
    
    public Flute()
    {
    }
    
    @Override
    public String play()
    {
        return "flute";
    }
    
    @Override
    public int getSoundVolume() 
    {
        this.SoundVolume = 5;
        return SoundVolume;
    }
    
    /**
     *
     * @return
     */
    @Override
    
}
