package com.rivaldo.makanankekiniansurabaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list = ArrayList<Food>()
    val foodname = arrayOf("Cahkwe Peneleh",
                        "Lapis Surabaya",
                        "Ote-ote Porong",
                        "Sego Sambel Mak Yeye",
                        "Bebek Tugu Pahlawan",
                        "Tahu Telor Pak Jayen",
                        "Takoyaki Rice Crispi",
                        "Sate Cumi",
                        "Nasi Cumi Pasar Atom",
                        "Rawon Kalkulator")
    val fooddesc = arrayOf("Cakue Peneleh merupakan salah satu jajanan legendaris Surabaya yang umurnya sudah 30 tahun lamanya. Tepatnya dirintis sejak tahun 1988 yang lalu oleh Tjio Le Loe dan Kho Sioe Yan. Awalnya, tempat ini menawarkan kue cakue polos pada umumnya. Namun di tahun 1994 yang lalu, mereka berinovasi membuat cakue yang ternyata digemari oleh para pelanggan yang datang.",
            "Lapis surabaya atau biasa juga di sebut Spekkoek atau lapis legit, merupakan roti lapis yang biasanya terdiri dari 2 lapisan atau 3 lapisan dengan warna kuning, coklat, kuning. Untuk lapis legit sendiri adonan yang selain menggunakan tepung terigu dan telur juga menggunakan kayu manis, cengkeh, cardamon yang berarama cengkeh. Ini yang membuat banyak orang Eropa menyukainya. Dengan berkembangnya kulturasi budaya, Spekkoek ini dibuat sesuai dengan citarasa orang Indonesia.",
            "Ote-ote adalah sejenis gorengan yang biasanya disebut juga dengan nama bakwan goreng atau bala-bala. Di Surabaya, gorengan ini disebut ote-ote. Nah, jika ada nama Porong di belakang ote-ote, ini identik dengan isi ote-ote tersebut yaitu tiram dan rumput laut.",
            "Sego sambel satu ini merupakan sajian favorit arek-arek Suroboyo. Dari segi rasa, aneka lauk Sego Sambel Mak Yeye tak usah diragukan lagi dan harganya juga ramah di kantong. Lauk yang ditawarkan cukup bervariasi ada telur dadar, ikan pari, ayam goreng, tempe, dan masih banyak lagi. Sego Sambel Mak Yeye berada di Jalan Jagir Wonokromo Wetan No. 12 (Belakang DTC), Wonokromo, Surabaya. Rumah makan ini buka dari pukul 22.00-03.00.",
            "Salah satu penjual bebek pinggir jalan ini sering menjadi sasaran bagi pencinta bebek dari Surabaya bahkan luar kota Surabaya. Warung bebek ini terletak persis di depan pintu masuk monumen Tugu Pahlawan. Bebek digoreng dengan gaya masakan Madura ini terkenal karena dagingnya yang empuk, bumbunya yang memiliki tekstur berminyak, rasanya gurih dari rempah yang kuat. Namun ada yang sedikit berbeda. Baca juga: Bebek Tugu Pahlawan, Nasi Bebek Andalan dari Kota Pahlawan Bumbu bebek lebih kering dan tidak terlalu hitam, tapi berbentuk seperti serundeng. Bebek yang tawarkan cukup variatif, ada bagian paha jumbo, dada jumbo, protolan (bagian daging yang lepas saat proses dimasak atau dibumbui), dan jeroan. Harga seporsi bebek Tugu Pahlawan dibandrol sekitar Rp 30.000 per porsinya, tergantung bagian bebek yang dipilih.",
            "Para pecinta tahu yang sedang ada di Surabaya jangan ketinggalan menyantap Tahu Telor dari Pak Jayen.Tahu tek disajikan dengan tahu yang dibalurkan telur lalu digoreng, disajikan dengan kentang, tauge, dan lontong yang disiram bumbu kacang. Baca juga: Resep Sarapan Praktis, Tahu Telur Surabaya Bumbu kacangnya sendiri sudah dicampur dengan petis sehingga rasanya lebih gurih dan mirip dengan rujak petis. Sebagai sentuhan terakhir, ditambahakan kerupuk di atas bumbu kacangnya. Seporsinya tahu tek Pak Jayen dihargai Rp 19.000 hingga Rp 25.000. Tahu telor Pak Jayen berada di Jalan Dharmahusada No. 112, Gubeng, Surabaya.",
            "Takoyaki merupakan street food khas Jepang berbentuk bola-bola kecil yang diisi dengan potongan gurita. Di Surabaya, traveler bisa mencicipi takoyaki dengan isian rice crispy yang gurih. Takoyaki unik ini dibanderol dengan harga Rp 10 ribu (isi 4) dan Rp 12 ribu (isi 5).",
            "Cumi-cumi yang digoreng tepung dan dimasak dengan saus asam manis memang sudah biasa.Bagaimana dengan cumi-cumi yang dibakar layaknya sate? Dengan Rp 15 ribu, traveler bisa mencicipi sate cumi bakar di Surabaya.",
            "Nasi cumi satu ini berada di Jalan Waspada Nomor 2-4, Bongkaran, Pabean Cantian tepatnya berada di sebelah gedung lama Pasar Atom. Baca juga: 7 Tempat Rawon Terkenal di Surabaya, dari Kalkulator sampai Setan Kamu aka disuguhkan sepiring nasi cumu lengkap dengan aneka lauknya. Ada cumi yang dimasak dengan tinta cumi dengan rasa gurih manis. Lalu ada lauk seperti empal, paru, usus sapi. Tidak ketinggalan peyek udang yang rasanya gurih dari kemiri dan tekstur renyah. Sambal dari nasi cumi ini tidak begitu pedas. Lalu selain nasi cumi juga ada rawon cumi Kamu harus membayar sebesar Rp 33.000 untuk menikmati seporsi nasi cumi komplit.",
            "Terletak di Taman Bungkul, Surabaya, ada sebuah warung rawon yang begitu tersohor. Bukan karena menu rawonnya, melainkan kecepatan para pramuniaga dalam menghitung jumlah akhir pembayaran. Hingga akhirnya warung rawon ini dikenal dengan nama Rawon Kalkulator. \"Ini sudah buka sejak tahun 1975. Banyak pindah lokasi, terakhir di Tamang Bungkul. Sebenarnya namanya bukan Rawon Kalkulator tapi Sedap Malam, nama rawon kalkulator itu dikasih oleh pengunjung,"
    )

    val foodimg = arrayOf(R.drawable.cakuepeneleh,
                        R.drawable.lapissurabaya,
                        R.drawable.oteoteporong,
                        R.drawable.makyeye,
                        R.drawable.bebektugupahlawan,
                        R.drawable.tahutelorpakjayen,
                        R.drawable.takoyakirice,
                        R.drawable.satecumi,
                        R.drawable.nasicumipasaratom,
                        R.drawable.rawonkalkulator)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_makanan.setHasFixedSize(true)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        supportActionBar?.title = "Daftar Makanan Kekinian Di Surabaya"
        rv_makanan.layoutManager = LinearLayoutManager(this)
        for(i in 0 until foodname.size) {
            list.add(Food(foodname.get(i), foodimg.get(i), fooddesc.get(i)))
            if (foodname.size - 1 == i) {
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                rv_makanan.adapter = adapter

                adapter.setOnClickCallback(object : Adapter.OnItemClickCallback{
                    override fun onItemClicked(data: Food) {
                        val bundle = Bundle()
                        bundle.putString("nama", data.name)
                        bundle.putInt("image", data.image)
                        bundle.putString("desc", data.description)
                        val description = Intent(this@MainActivity, DescriptionActivity::class.java)
                        description.putExtra("selecteddata", bundle)
                        startActivity(description)
                    }
                })

            }
        }
    }
}