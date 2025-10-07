Belajar: Automasi Pengujian Web E-Commerce dengan Katalon Studio
Proyek ini mendemonstrasikan kemampuan pengujian otomatis pada website e-commerce fungsional, Sauce Demo. Seluruh skenario pengujian dibuat dan dieksekusi menggunakan Katalon Studio.

<img width="1920" height="792" alt="ss_report_katalon" src="https://github.com/user-attachments/assets/efc99b9e-db5f-43e7-928f-3c3e0c934637" />


🛠️ Tools yang Digunakan
Automation Tool: Katalon Studio versi 9.x.x

Bahasa: Groovy

Browser: Chrome & Edge

🧪 Cakupan Pengujian (Test Scenarios)
Proyek ini mencakup pengujian pada alur kerja utama pengguna, yang terbagi dalam 5 Test Case:

✅ Tes 1: Login Berhasil

Memastikan pengguna dengan kredensial valid dapat masuk ke sistem.

❌ Tes 2: Login Gagal

Memastikan pesan error yang sesuai muncul saat menggunakan password yang salah.

🛒 Tes 3: Alur Belanja End-to-End

Mensimulasikan alur lengkap: Login -> Tambah produk ke keranjang -> Checkout -> Isi data diri -> Selesaikan pesanan.

🗑️ Tes 4: Fungsionalitas Keranjang

Memvalidasi fitur tambah dan hapus item dari keranjang belanja.

⇅ Tes 5: Fungsionalitas Sorting Produk

Memastikan produk dapat diurutkan berdasarkan nama (A ke Z) dengan benar.

📁 Struktur Proyek
Test Cases: Berisi skrip pengujian individual untuk setiap skenario.

Object Repository: Menyimpan semua elemen web (locator) yang digunakan dalam pengujian secara terpusat.

Test Suites: Mengelompokkan Test Case menjadi dua skenario eksekusi:

Smoke_Test: Menjalankan tes paling kritikal saja.

Regression_Test: Menjalankan seluruh test case yang ada.

Test Suite Collections: Mengatur dan menjalankan beberapa Test Suite secara berurutan.

🚀 Cara Menjalankan Proyek
Clone repositori ini.

1. Buka proyek menggunakan Katalon Studio.

2. Jalankan Test Suite Collection bernama _Main_Exc untuk mengeksekusi semua tes.
