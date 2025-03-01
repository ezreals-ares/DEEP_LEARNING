def kalkulator_sederhana():
    print("Selamat datang di Kalkulator Sederhana!")
    
    try:
        # Meminta input dari pengguna
        angka1 = float(input("Masukkan angka pertama: "))
        angka2 = float(input("Masukkan angka kedua: "))
        
        # Meminta pengguna memilih operasi
        operasi = input("Pilih operasi (+, -, *, /): ")
        
        # Melakukan operasi yang dipilih
        if operasi == '+':
            hasil = angka1 + angka2
        elif operasi == '-':
            hasil = angka1 - angka2
        elif operasi == '*':
            hasil = angka1 * angka2
        elif operasi == '/':
            if angka2 == 0:
                print("Error: Pembagian dengan nol tidak diperbolehkan.")
                return  # Keluar dari fungsi jika pembagian dengan nol
            hasil = angka1 / angka2
        else:
            print("Error: Operasi tidak valid. Silakan pilih antara +, -, *, /.")
            return  # Keluar dari fungsi jika operasi tidak valid
        
        # Menampilkan hasil
        print(f"Hasil dari {angka1} {operasi} {angka2} adalah {hasil}")
    
    except ValueError:
        print("Error: Input yang dimasukkan harus berupa angka.")

# Memanggil fungsi kalkulator
kalkulator_sederhana()