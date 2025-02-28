package OOP;
public class MahasiswaMain {

    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa("Budi", "1234", "2", "4");

        mhs1.tampilInformasi();
        mhs1.setNama("Anto");
        System.out.println(mhs1.getnim());
        
        String data = mhs1.sayHi("Ganteng");
        System.out.println(data);
    }
}