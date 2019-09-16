package com.example.windows.cv_kelas12;

import java.util.ArrayList;

public class AndroidData {
public static String[] [] data =new String[][] {
        {"Relative Layout","Relative Layout merupakan layout yang berfungsi untuk mengatur tata letak komponen atau widget aplikasi android dengan cara relative (secara bebas) tidak hanya vertikal atau horisontal saja seperti pada Linear Layout","https://cariponsel.com/wp-content/uploads/2018/07/android-logo.png"},
        {"Linear Layout","Pengertian Linear Layout sendiri dari situs Android adalah sebagai berikut: LinearLayout adalah sekelompok tampilan yang menyejajarkan semua ana dalam satu arah, secara vertikal atau horizontal","https://cariponsel.com/wp-content/uploads/2018/07/android-logo.png"},
        {"Scroll View","Saat sebuah aplikasi memiliki konten layout yang lebih panjang dari tinggi perangkat Android, maka konten tersebut harus dibuat agar dapat di scroll secara vertikal. Untuk itu kita memerlukan sebuah ScrollView","https://cariponsel.com/wp-content/uploads/2018/07/android-logo.png"},
        {"Image View","Image View sebuah widget kode untuk menampilkan gambar","https://cariponsel.com/wp-content/uploads/2018/07/android-logo.png"},
        {"Edit Text","EditText merupakan salah satu Widget yang ada di android studio yang berfungsi untuk memasukkan dan mengedit text atau sebut saja untuk input data yang berbentuk kolom input","https://cariponsel.com/wp-content/uploads/2018/07/android-logo.png"},
        {"Button","Button atau Tombol, juga salah satu komponen sebuah interface yang sudah biasa digunakan. Dengan sebuah Button pengguna dapat memerintahkan aplikasi untuk melakukan aksi yang telah ditentukan.","https://cariponsel.com/wp-content/uploads/2018/07/android-logo.png"},
        {"Web View","Pada tulisan kali ini saya akan membahas mengenai WebView pada Android. Bagi yang belum tahu, WebView adalah sebuah class di Android yang dapat menampilkan tampilan peramban web pada aplikasi Android.\n" +
                "Nantinya, aplikasi yang akan dibuat menghasilkan tampilan seperti kita membuka situs web menggunakan peremban web. Bedanya pada WebView ini tidak terdapat address bar, sehingga URL-nya sudah kita definisikan di dalam aplikasi Android yang kita buat.\n","https://cariponsel.com/wp-content/uploads/2018/07/android-logo.png"},
        {"Card View","CardView merupakan view paketan dari Material Design — diperkenalkan pada Android Versi Lolipop. Bentuk view ini biasa digunakan untuk pembungkusan data (sepaket data — beberapa view) yang ditandai dengan tampilan view nya yang memiliki drop shadow (elevation) dan corner radius. Adapun CardView ini merupakan subclass dari FrameLayout.","https://cariponsel.com/wp-content/uploads/2018/07/android-logo.png"},


};
    public static ArrayList<Android> getListData(){
        ArrayList<Android> list = new ArrayList<>();
        for (String[] aData : data){
            Android android = new Android();
            android.setName(aData[0]);
            android.setFrom(aData[1]);
            android.setPhoto(aData[2]);
            list.add(android);
        }
        return list;
    }
}
