/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;
import java.time.Clock;
/**
 *
 * @author Enzo
 */
public class Util {
    
    public long StartTime() {
        Clock clock = Clock.systemDefaultZone();
        long ST = clock.millis();
        return ST;
    }
    
    public long SentTime(Long STime) {
        Clock clock = Clock.systemDefaultZone();
        long Actual = clock.millis();
        long TM = Actual - STime;
        return TM;
    }

}


