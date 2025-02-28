package OOP;
public class Mahasiswa {

    String nama;
    String nim;
    String semester;
    String ipk;

    // Construktor dipanggil saat object pertama kali dibuat / cons default
    public Mahasiswa() {

    }

    // construktor berparameter
    public Mahasiswa(String nama, String nim, String semester, String ipk) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.ipk = ipk;
    }

    // Method tanpa paramater dan return
    void tampilInformasi() {
        System.out.println("Nama Mhs : " + this.nama);
        System.out.println("Nim Mhs : " + this.nim);
        System.out.println("Semester Mhs : " + this.semester);
        System.out.println("IPK Mhs : " + this.ipk);
    }

    // Method berparameter tanpa return
    void setNama(String nama) {
        this.nama = nama;
    }

    // Method return tak berparameter
    String getnim() {
        return this.nim;
    }
    
    // method berparameter dan return
    String sayHi(String pesan) {
        return pesan + " juga nama saya adalah " + this.nama;
    }

   
}