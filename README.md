# LAPORAN PROJECT 1

## PEMROGRAMAN BERORIENTASI OBJEK

## SISTEM MANAJEMEN PANTI JOMPO

Nama  : Alisya Octa Noor Ghina

NIM   : 2509116017

Kelas : Sistem Informasi (A)

# BAB I PENDAHULUAN

## 1.1 Latar Belakang

Panti jompo merupakan tempat tinggal bagi para lansia yang membutuhkan tempat tinggal, perawatan, serta pendampingan dalam menjalani aktivitas sehari-hari. Di dalam panti jompo, para lansia dapat tinggal dan beraktivitas bersama dengan penghuni lainnya dalam lingkungan yang teratur dan terkelola. Dalam proses pengelolaannya, diperlukan pendataan penghuni yang terstruktur agar informasi seperti identitas, usia, nomor telepon, jenis kelamin, dan kondisi penghuni dapat dicatat dan dikelola dengan baik. Pengelolaan data yang terorganisir dapat membantu pihak panti dalam mengetahui informasi setiap penghuni serta mempermudah proses pencarian dan pembaruan data.

Berdasarkan kebutuhan tersebut, dibuat **Sistem Manajemen Panti Jompo Rumah Senja** yang digunakan untuk mengelola data penghuni panti. Sistem ini menyediakan beberapa fungsi utama, yaitu menambahkan data penghuni, menampilkan seluruh data, mencari data berdasarkan nama, mengubah data, serta menghapus data penghuni. Selain digunakan untuk mengelola data, sistem ini juga dirancang dengan menerapkan konsep _Object-Oriented Programming_ (OOP). Dengan adanya sistem ini, proses pengelolaan data penghuni dapat dilakukan secara lebih terstruktur.

## 1.2 Tujuan
Tujuan dari pembuatan sistem ini adalah sebagai berikut:
- Mempermudah pengelolaan data penghuni panti jompo.
- Memudahkan proses penambahan, pencarian, perubahan, dan penghapusan data penghuni.
- Membantu menyimpan informasi penghuni secara lebih terstruktur.

# BAB II PEMBAHASAN

## 2.1 Hierarki Kelas

Hierarki class merupakan struktur yang menunjukkan hubungan antara class induk (superclass) dan class turunan (subclass) dalam penerapan konsep inheritance. Class induk berisi atribut dan method yang dapat digunakan kembali oleh class turunan, sehingga class turunan tidak perlu mendefinisikan kembali bagian yang sama. Dengan adanya hubungan tersebut, setiap subclass dapat memiliki karakteristik tambahan sesuai dengan kebutuhan sistem, tetapi tetap mewarisi sifat dan perilaku dari superclass.

Pada Sistem Manajemen Panti Jompo Rumah Senja, hierarki class digunakan untuk menggambarkan hubungan antarclass yang menerapkan inheritance. Super-class menjadi class utama yang menyediakan atribut dan method umum, sedangkan subclass merupakan class yang mewarisi dan dapat mengembangkan atribut atau method tersebut sesuai kebutuhan. Diagram hierarki class pada sistem ditampilkan pada gambar berikut.

Dalam perancangan sistem **Manajemen Panti Jompo Rumah Senja**, terdapat **6 class** yang digunakan untuk membangun dan mengatur keseluruhan fungsi program. Keenam class tersebut terdiri dari  main class, 1 parent class, 2 subclass, serta 2 class pendukung, yaitu Main, PenghuniPanti, PenghuniKhusus, PenghuniNonKhusus, PenghuniCRUD, dan InputValidasi.

**Main** merupakan class utama yang berfungsi sebagai titik awal atau *entry point* ketika program dijalankan. Class ini bertugas menjalankan program serta menghubungkan pengguna dengan berbagai menu yang tersedia dalam sistem.

**PenghuniPanti** merupakan **parent class** yang menjadi dasar dari data penghuni panti. Class ini menyimpan atribut dan informasi umum yang dimiliki oleh seluruh penghuni, seperti **ID, nama, usia, nomor telepon keluarga, jenis kelamin, dan kondisi kesehatan**. Dengan adanya parent class, informasi yang bersifat umum tidak perlu ditulis berulang pada setiap jenis penghuni. Selanjutnya, terdapat dua **subclass**, yaitu **PenghuniKhusus** dan **PenghuniNonKhusus**. Kedua subclass tersebut merupakan turunan dari class **PenghuniPanti** dan memiliki karakteristik tambahan sesuai dengan kategori penghuni.

Class **PenghuniKhusus** digunakan untuk mengelola data penghuni yang membutuhkan perhatian atau perawatan khusus. Selain mewarisi informasi umum dari parent class, class ini memiliki informasi tambahan berupa **jadwal perawatan dan jadwal pemberian obat**.

Sementara itu, class **PenghuniNonKhusus** digunakan untuk mengelola data penghuni yang termasuk dalam kategori non khusus. Class ini juga mewarisi atribut umum dari **PenghuniPanti**, tetapi memiliki informasi tambahan berupa **jadwal kegiatan** yang digunakan untuk mengatur aktivitas penghuni sehari-hari.

Selain class yang berkaitan langsung dengan objek penghuni, terdapat **PenghuniCRUD** yang berfungsi untuk mengelola proses **CRUD (Create, Read, Update, Delete)** terhadap data penghuni. Class ini menangani berbagai proses seperti **menambahkan data penghuni, menampilkan data, mencari data, memperbarui data, dan menghapus data penghuni**. Dengan adanya class ini, proses pengelolaan data dapat dipisahkan dari class yang menyimpan informasi penghuni sehingga struktur program menjadi lebih terorganisir.

Terakhir, terdapat class **InputValidasi** yang berfungsi untuk menangani dan memastikan validitas data yang dimasukkan oleh pengguna. Class ini digunakan agar input yang diberikan sesuai dengan ketentuan yang telah ditentukan oleh sistem, sehingga dapat mengurangi kesalahan input dan mencegah data yang tidak sesuai masuk ke dalam sistem.

## 2.2 Implementasi Inheritance

### 2.2.1 Superclass

<img width="639" height="400" alt="image" src="https://github.com/user-attachments/assets/d8d3f62f-ea43-44fe-841c-15df218d4ba8" />

Gambar di atas menampilkan penerapan superclass pada class PenghuniPanti. Class PenghuniPanti berperan sebagai class induk yang menjadi dasar bagi class PenghuniKhusus dan PenghuniNonKhusus. Di dalam class ini terdapat atribut dan method yang bersifat umum dan dimiliki oleh seluruh penghuni panti, seperti ID, nama, usia, nomor telepon keluarga, jenis kelamin, dan kondisi kesehatan. Sebagai superclass, PenghuniPanti menyediakan struktur dasar yang nantinya dapat diwariskan kepada class turunannya.

### 2.2.2 Subclass

**1. Class Penghuni Khusus**

<img width="753" height="294" alt="image" src="https://github.com/user-attachments/assets/1fbdd4f3-3d8e-4f0a-b92d-0bb8ceeec0c6" />

Gambar di atas menampilkan penerapan inheritance untuk class PenghuniKhusus. Penerapan inheritance ditandai dengan penggunaan kata kunci extends, yang menunjukkan bahwa class PenghuniKhusus merupakan turunan dari class PenghuniPanti. Dengan demikian, class PenghuniKhusus dapat mewarisi atribut dan method yang terdapat pada class PenghuniPanti, sekaligus memiliki atribut atau method tambahan yang sesuai dengan kebutuhan penghuni khusus. Penerapan ini memungkinkan kode yang bersifat umum digunakan kembali pada class turunan tanpa perlu menuliskannya kembali.

**2. Class Penghuni Non Khusus**

<img width="664" height="219" alt="image" src="https://github.com/user-attachments/assets/e8a72617-858b-47db-9f15-f8808298c457" />

Sama dengan gambar sebelumnya, gambar di atas menampilkan penerapan inheritance untuk class PenghuniNonKhusus. Penerapan inheritance ditandai dengan penggunaan kata kunci extends, yang menunjukkan bahwa class PenghuniNonKhusus merupakan turunan dari class PenghuniPanti. Dengan demikian, class PenghuniKhusus dapat mewarisi atribut dan method yang terdapat pada class PenghuniPanti, sekaligus memiliki atribut atau method tambahan yang sesuai dengan kebutuhan penghuni khusus. Penerapan ini memungkinkan kode yang bersifat umum digunakan kembali pada class turunan tanpa perlu menuliskannya kembali.

# BAB III OUTPUT

## 3.1 Menu Utama

<img width="379" height="205" alt="image" src="https://github.com/user-attachments/assets/8e8c43e1-6e6c-44d1-aea3-876ec819dc4b"/>

Gambar di atas merupakan tampilan dari Menu Utama program ini. Dalam program ini saya menyediakan fitur tambah, tampilkan, update, cari, dan hapus.

## 3.2 Menu Tambah

<img width="382" height="157" alt="image" src="https://github.com/user-attachments/assets/43dd1d17-e4ce-4aef-92bf-5e1f554e33bc" />

Gambar di atas merupakan tampilan menu tambah yang digunakan untuk menambahkan data penghuni panti. Pada menu ini, pengguna dapat memasukkan data penghuni sesuai dengan jenisnya, yaitu penghuni khusus atau penghuni nonkhusus. Pemilihan jenis penghuni tersebut akan menentukan data dan informasi yang perlu dimasukkan sesuai dengan karakteristik masing-masing jenis penghuni.

### 3.2.1 Tambah Data Penghuni Khusus

<img width="431" height="222" alt="image" src="https://github.com/user-attachments/assets/26d76e01-49b7-4a8c-bdb0-62c8d8f7f347" />

Gambar di atas menunjukkan tampilan informasi yang ditambahkan untuk penghuni khusus. Informasi umum yang dicatat meliputi ID penghuni, nama, usia, nomor telepon keluarga, jenis kelamin, dan kondisi kesehatan.

Selain informasi umum tersebut, penghuni khusus juga memiliki informasi tambahan yang berkaitan dengan kebutuhan perawatannya, yaitu **jadwal perawatan** dan **jadwal pemberian obat**. Informasi khusus ini digunakan untuk membantu memastikan kebutuhan perawatan dan pemberian obat kepada penghuni dapat dilakukan sesuai dengan jadwal yang telah ditentukan.

### 3.2.2 Tambah Data Penghuni Non Khusus

<img width="371" height="202" alt="image" src="https://github.com/user-attachments/assets/b9881077-a06d-4f1c-83e2-4d7c0fc42eb7" />

Gambar di atas menunjukkan tampilan informasi yang ditambahkan untuk penghuni non khusus. Informasi umum yang dicatat meliputi ID penghuni, nama, usia, nomor telepon keluarga, jenis kelamin, dan kondisi kesehatan.

Selain informasi umum tersebut, penghuni non khusus juga memiliki informasi tambahan yang berkaitan dengan aktivitas sehari-hari, yaitu **jadwal kegiatan**. Informasi tambahan ini digunakan untuk membantu mengatur dan mencatat kegiatan penghuni agar dapat dilaksanakan sesuai dengan jadwal yang telah ditentukan.

## 3.3 Menu Tampilkan

<img width="385" height="172" alt="image" src="https://github.com/user-attachments/assets/21faed59-c221-4df1-98b7-ac7bf04d5b14" />

Pada menu Tampilkan Data, tersedia fitur yang digunakan untuk menampilkan data penghuni panti yang tersedia. Data yang ditampilkan mencakup data seluruh penghuni, penghuni khusus, dan penghuni non khusus. Fitur ini memudahkan pengguna dalam melihat dan mengakses informasi penghuni sesuai dengan kategori yang tersedia.

### 3.3.1 Tampilkan Seluruh Data Penghuni 

<img width="672" height="552" alt="image" src="https://github.com/user-attachments/assets/800e62e9-fa62-4dd6-b6de-764af71a80c3" />

Jika pengguna memilih menu Tampilkan Seluruh Data Penghuni, sistem akan menampilkan seluruh data penghuni panti tanpa membedakan kategori. Data yang ditampilkan mencakup penghuni khusus maupun penghuni non khusus, sehingga pengguna dapat melihat keseluruhan data penghuni dalam satu tampilan.

### 3.3.2 Tampilkan Data Penghuni Khusus

<img width="743" height="158" alt="image" src="https://github.com/user-attachments/assets/4191ebc5-bb6c-434e-9ebc-6842e932a932" />

Jika pengguna memilih menu Tampilkan Data Penghuni Khusus, sistem akan menampilkan data penghuni yang termasuk dalam kategori khusus. Informasi yang ditampilkan meliputi ID, nama, usia, nomor telepon keluarga, jenis kelamin, kondisi kesehatan, jadwal perawatan, dan jadwal pemberian obat.

### 3.3.3 Tampilkan Data Penghuni Non Khusus

<img width="748" height="142" alt="image" src="https://github.com/user-attachments/assets/82f0a671-af9d-44e8-aff3-5ea24d57818e" />

Jika pengguna memilih menu Tampilkan Data Penghuni Non Khusus, sistem akan menampilkan data penghuni yang termasuk dalam kategori non khusus. Informasi yang ditampilkan meliputi ID, nama, usia, nomor telepon keluarga, jenis kelamin, kondisi kesehatan, dan jadwal kegiatan.

## 3.4 Menu Update

<img width="380" height="170" alt="image" src="https://github.com/user-attachments/assets/d952aa92-9ad6-4f19-9243-9b61a0994c30" />

Gambar di atas merupakan tampilan menu Update. Pada menu ini, pengguna dapat memperbarui atau mengubah informasi penghuni yang mengalami perubahan. Informasi yang dapat diperbarui meliputi usia penghuni, kondisi kesehatan, serta jadwal khusus penghuni.

### 3.4.1 Update Usia Penghuni Panti

<img width="374" height="123" alt="image" src="https://github.com/user-attachments/assets/0d59a28d-b4ad-4d4f-9fc5-cb484176a5c8" />

Gambar di atas menampilkan proses pembaruan usia penghuni. Pembaruan usia dilakukan setiap satu tahun sekali untuk memastikan data usia setiap penghuni tetap akurat dan sesuai dengan kondisi terkini. 

### 3.4.2 Update Kondisi Kessehatan Penghuni Panti

<img width="374" height="123" alt="image" src="https://github.com/user-attachments/assets/a30843e1-68de-416f-a839-7111fba9f8b3" />

Gambar di atas menampilkan proses pembaruan kondisi kesehatan penghuni Panti Rumah Senja. Pembaruan kondisi kesehatan dilakukan secara berkala agar data kesehatan penghuni selalu sesuai dengan kondisi terkini. Dengan adanya pembaruan ini, para perawat dapat memperoleh informasi terbaru mengenai kondisi kesehatan setiap lansia sehingga dapat menyesuaikan perawatan dan kegiatan yang diberikan.

### 3.4.3 Update Data Penghuni Khusus

<img width="378" height="445" alt="image" src="https://github.com/user-attachments/assets/6167ded9-5ac4-4806-886d-f510beb4b8d7" />

Gambar di atas menampilkan proses pembaruan jadwal pemberian obat bagi penghuni khusus. Pembaruan ini dilakukan untuk memastikan jadwal pemberian obat selalu sesuai dengan kebutuhan dan kondisi terkini penghuni, sehingga pemberian obat dapat dilakukan secara teratur dan tepat waktu.

### 3.4.4 Update Data Penghuni Non Khusus

<img width="376" height="354" alt="image" src="https://github.com/user-attachments/assets/d528a00d-571a-4268-b6d8-320388d122ca" />

Gambar di atas menampilkan proses pembaruan jadwal kegiatan bagi penghuni non khusus. Pembaruan ini dilakukan untuk menyesuaikan jadwal kegiatan dengan kebutuhan dan aktivitas penghuni, sehingga setiap kegiatan dapat dilaksanakan sesuai dengan jadwal yang telah ditentukan.

### 3.4.5 Hasil Update Data

<img width="387" height="575" alt="image" src="https://github.com/user-attachments/assets/7e082054-c81d-4250-87ca-17a3d80683b7" />

Gambar di atas menampilkan hasil dari seluruh proses pembaruan.

## 3.5 Menu Hapus

<img width="368" height="112" alt="image" src="https://github.com/user-attachments/assets/c39f6568-0e38-46a7-b201-d636a079fd19" />

Gambar di atas menampilkan proses penghapusan data penghuni. Pada menu ini, pengguna dapat menghapus data penghuni dengan cara memasukkan ID penghuni yang ingin dihapus. Sistem kemudian akan mencari data berdasarkan ID tersebut dan menghapus data penghuni yang sesuai.

**Hasil Tampilan Setelah ID 1 Dihapus**

<img width="747" height="161" alt="image" src="https://github.com/user-attachments/assets/fbf8f3cd-7ab1-4f43-a4b9-4dcb9cf4f8ae" />

## 3.6 Menu Cari 

<img width="425" height="101" alt="image" src="https://github.com/user-attachments/assets/6b458551-fa0d-4a5a-8670-806b635cde55" />

<img width="1069" height="90" alt="image" src="https://github.com/user-attachments/assets/610d873c-62d0-4216-8a46-69d6c116ae1d" />

Pada menu Cari Penghuni, pengguna dapat mencari data penghuni berdasarkan nama. Penggunaan nama sebagai kata kunci pencarian dipilih karena lebih mudah diingat dan digunakan dalam situasi sehari-hari. Ketika keluarga penghuni datang untuk menjenguk, mereka umumnya akan menyebutkan nama penghuni yang ingin ditemui daripada ID penghuni. Oleh karena itu, pencarian berdasarkan nama dapat memudahkan pengguna dalam menemukan data penghuni dengan lebih cepat dan praktis.

## 3.7 Menu Keluar

<img width="380" height="271" alt="image" src="https://github.com/user-attachments/assets/98cea80a-d9bd-4b05-9385-cc0e85987063" />

Gambar di atas merupakan tampilan yang muncul ketika pengguna memilih menu Keluar dari program Manajemen Panti Jompo Rumah Senja. Menu ini digunakan untuk mengakhiri penggunaan program dan keluar dari sistem.
