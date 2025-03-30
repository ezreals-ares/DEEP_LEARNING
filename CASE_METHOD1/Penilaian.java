package Praktikum_ASD.CASE_METHOD1;

public class Penilaian {

   Mahasiswa mahasiswa;
   MataKuliah mataKuliah;
   double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

   public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
       this.mahasiswa = mahasiswa;
       this.mataKuliah = mataKuliah;
       this.nilaiTugas = nilaiTugas;
       this.nilaiUTS = nilaiUTS;
       this.nilaiUAS = nilaiUAS;
       hitungNilaiAkhir();
   }
   
   void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

   }

   void tampilPenilaian() {
        System.out.println(mahasiswa.nama + " | " + mataKuliah.namaMK + " | " + this.nilaiAkhir);
   }

  

   
    
}