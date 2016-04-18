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
public class Trumpet implements IInstrument{
    
    private int SoundVolume;
    private String color;
    
    public Trumpet()
    {
    }
    
    /**
     *
     * @return
     */
    @Override
    public String play()
    {
        return "pouet";
    }
    
    @Override
    public int getSoundVolume() 
    {
        this.SoundVolume = 10;
        return SoundVolume;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getColor()
    {
        this.color = "golden";
        return color;
    }
}
