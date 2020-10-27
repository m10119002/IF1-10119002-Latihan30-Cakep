/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan30;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program cakep
 * 
 * 
 */
public class Cakep {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_MERAH = "\u001B[31m";
    private static final String ANSI_HIJAU = "\u001B[32m";
    private static final String ANSI_KUNING = "\u001B[33m";
    private static final String ANSI_BIRU = "\u001B[34m";
    private static final String ANSI_UNGU = "\u001B[35m";
    private static final String ANSI_TOSKA = "\u001B[36m";
    
    enum WARNA {
        MERAH,
        HIJAU,
        KUNING,
        BIRU,
        UNGU,
        TOSKA
    }
    
    private static String warnai(String test, WARNA warna) {
        switch (warna) {
            case MERAH:
                return ANSI_RESET.concat(ANSI_MERAH.concat(test)).
                        concat(ANSI_RESET);
            case HIJAU:
                return ANSI_RESET.concat(ANSI_HIJAU.concat(test)).
                        concat(ANSI_RESET);
            case KUNING:
                return ANSI_RESET.concat(ANSI_KUNING.concat(test)).
                        concat(ANSI_RESET);
            case BIRU:
                return ANSI_RESET.concat(ANSI_BIRU.concat(test)).
                        concat(ANSI_RESET);
            case UNGU:
                return ANSI_RESET.concat(ANSI_UNGU.concat(test)).
                        concat(ANSI_RESET);
            case TOSKA:
                return ANSI_RESET.concat(ANSI_TOSKA.concat(test)).
                        concat(ANSI_RESET);
            default:
                System.err.println("Coding Error / System Error");
                return null;
        }
    }
    
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println(warnai("Kamu ", WARNA.MERAH).
                concat(warnai("ngerjain sendiri ", WARNA.HIJAU)).
                concat(warnai("latihan 17 sampe ", WARNA.KUNING)).
                concat(warnai("latihan 30 ini?", WARNA.BIRU)));
        System.out.print(warnai("Jawab ", WARNA.BIRU).
                concat(warnai("(Yoi/Enggak) : ", WARNA.MERAH)));
        input = scanner.nextLine();
        System.out.println("");
        if(input.equalsIgnoreCase("yoi")) {
            System.out.println(warnai("Cakep Bener. ", WARNA.MERAH).
                    concat(warnai("Good Job", WARNA.UNGU)));
        } else if(input.equalsIgnoreCase("enggak")) {
            System.out.println(warnai("Tetep cakep sih.", WARNA.MERAH));
            System.out.println(warnai("Sing penting paham konsep nya yee.", 
                    WARNA.TOSKA));
            System.out.println("Keep the code works dude");
        } else {
            System.err.println("Gagal proses, masukkan tidak dikenal!");
        }
    }
}
