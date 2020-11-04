/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sri Utami Ningsih
 * Nama  : Sri Utami Ningsih
 * Kelas : PBO-IF2
 * Nim   : 10116378
 */
public class WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date Waktu = new Date ( );
    SimpleDateFormat FormatWaktu = new SimpleDateFormat("EEEE, dd MMM yyy "
            + "hh:mm:ss");
        
        System.out.println("Hari ini adalah hari : " + FormatWaktu.format
        (Waktu));
    }
    
}
