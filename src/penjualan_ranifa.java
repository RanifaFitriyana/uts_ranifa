import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class penjualan_ranifa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat)
                DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        //Deklarasi variabel
        int jumlah=0, i=0;
        double total_bayar=0;

        //deklarasi array
        int[] kode_barang = new int[5];
        int[] qty = new int[5];
        int[] harga = new int[10];
        String[] nama_barang = new String[20];
        double[] sub_total = new double[10];
        double[] diskon = new double[5];
        System.out.println("PENJUALAN KOSMETIK");

        System.out.print("Masukan Jumlah Beli : ");
        jumlah=input.nextInt();
        System.out.println(" ");

        //masukan elemen didalam array
        for (i=0; i<jumlah; i++){
            System.out.print("Masukan kode barang ke-"+(i+1)+" : ");
            kode_barang[i]=input.nextInt();
            System.out.print("Masukan qyt ke-"+(i+1)+" : ");
            qty[i]=input.nextInt();

            //menentukan barang berdasarkan kode yang dimasukan
            switch (kode_barang[i]){
                case 1 :
                    kode_barang[i]=100;
                    nama_barang[i]="Bedak Padat";
                    harga[i]=45000;
                    diskon[i]=0.3;
                    break;
                case 2 :
                    kode_barang[i]=101;
                    nama_barang[i]="Pensil Alis";
                    harga[i]=30000;
                    diskon[i]=0.2;
                    break;
                case 3 :
                    kode_barang[i]=102;
                    nama_barang[i]="Eyeliner";
                    harga[i]=45000;
                    diskon[i]=0.3;
                    break;
                case 4 :
                    kode_barang[i]=103;
                    nama_barang[i]="Bedak Tabur";
                    harga[i]=20000;
                    diskon[i]=0;
                    break;
                case 5 :
                    kode_barang[i]=104;
                    nama_barang[i]="Lip Cream";
                    harga[i]=35000;
                    diskon[i]=0;
                    break;
                case 6 :
                    kode_barang[i]=105;
                    nama_barang[i]="Lip Tint";
                    harga[i]=25000;
                    diskon[i]=0.2;
                    break;
                case 7 :
                    kode_barang[i]=106;
                    nama_barang[i]="Lip Balm";
                    harga[i]=15000;
                    diskon[i]=0;
                    break;
                case 8 :
                    kode_barang[i]=107;
                    nama_barang[i]="Primer";
                    harga[i]=50000;
                    diskon[i]=0.2;
                    break;
                case 9 :
                    kode_barang[i]=108;
                    nama_barang[i]="Foundation";
                    harga[i]=55000;
                    diskon[i]=0;
                    break;
                case 10 :
                    kode_barang[i]=109;
                    nama_barang[i]="EyeShadow";
                    harga[i]=45000;
                    diskon[i]=0.3;
                    break;
                default:
                    System.out.println("Kode barang tidak tersedia");
            }
        }
        //Pengaturan format number
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println(" ");
        System.out.println("No   Kode Barang        Nama Barang             Harga            QTY  Diskon   Sub Total");
        //Menampilkan seluruh elemen di dalam array
        for (i=0; i<jumlah;i++){
            sub_total[i]=((qty[i]*harga[i])-(qty[i]*harga[i]*diskon[i]));
            total_bayar+=sub_total[i];
            System.out.println(i+1+"    "+nama_barang[i]+"   "+kursIndonesia.format(harga[i])+"    "+qty[i]+"     "+(int)(diskon[i]*100)+"%"+"     "+kursIndonesia.format(sub_total[i]));
        }
        System.out.println(" ");
        //Menampilkan total bayar
        System.out.println("Total Bayar : "+kursIndonesia.format(total_bayar));
    }
}
