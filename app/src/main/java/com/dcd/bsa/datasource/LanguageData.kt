package com.dcd.bsa.datasource

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.dcd.bsa.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProgrammingLanguage(
    var name: String = "",
    @DrawableRes var image: Int = 0,
    var description: String = "",
    var advantage: String = "",
    var deficiency: String = ""
) : Parcelable

object LanguageData {
    fun getList(): ArrayList<ProgrammingLanguage> {
        val listProgrammingLanguage = arrayListOf<ProgrammingLanguage>().apply {
            add(
                ProgrammingLanguage(
                    "Java",
                    image = R.drawable.ic_java,
                    "Java adalah bahasa pemrograman tingkat tinggi yang dikembangkan oleh Sun Microsystems pada tahun 1995. Ia menggunakan paradigma pemrograman berorientasi objek dan dirancang untuk memiliki kemampuan portabilitas tinggi, artinya kode yang ditulis dalam Java dapat dijalankan di berbagai platform dengan sedikit atau tanpa modifikasi.",
                    "Kelebihan Java meliputi portabilitas tinggi yang memungkinkan kode yang sama dijalankan di berbagai platform, sistem keamanan yang kuat, dukungan untuk pemrograman berorientasi objek yang modular, ekosistem yang luas dengan banyak pustaka, dan kemampuan untuk melakukan pemrograman multi-threading.",
                    "Java juga memiliki kekurangan, seperti kinerja yang cenderung lebih lambat dibandingkan dengan bahasa yang dikompilasi langsung, konsumsi memori yang lebih tinggi karena JVM dan garbage collector, dan kurangnya fleksibilitas dalam beberapa aspek sintaksis yang mungkin membuatnya kurang sesuai untuk beberapa jenis proyek."
                )
            )
            add(
                ProgrammingLanguage(
                    "Kotlin",
                    R.drawable.ic_kotlin,
                    "Kotlin adalah bahasa pemrograman modern yang berjalan di atas Java Virtual Machine (JVM), dikembangkan oleh JetBrains. Dirancang untuk ekspresif, ringkas, dan aman, Kotlin mendukung paradigma pemrograman berorientasi objek dan fungsional.",
                    "nteroperabilitas yang mulus dengan Java memungkinkan pengembang menggunakan perpustakaan Java yang ada. Kotlin menawarkan sintaksis yang lebih ringkas dan jelas dibandingkan dengan Java. Keamanan terhadap null secara bawaan mencegah Null Pointer Exception. Fitur pemrograman fungsional seperti lambdas dan operasi koleksi mendukung pengembangan yang lebih deklaratif.",
                    "Belum sepopuler Java, menyebabkan ketersediaan sumber daya dan dukungan komunitasnya belum sebesar Java. Kompatibilitas bakward terbatas bisa menyulitkan konversi dari Java ke Kotlin. Dokumentasi dan materi pembelajaran untuk Kotlin masih terbatas dibandingkan dengan Java."
                )
            )
            add(
                ProgrammingLanguage(
                    "PHP",
                    image = R.drawable.ic_php,
                    "PHP, singkatan dari Hypertext Preprocessor, adalah bahasa pemrograman yang banyak digunakan untuk pengembangan aplikasi web. PHP secara khusus digunakan di sisi server untuk memproses data yang diterima dari klien (browser) dan menghasilkan respon yang sesuai, seperti halaman web dinamis atau akses ke basis data.",
                    "Salah satu kekuatan utama PHP adalah integrasinya yang kuat dengan berbagai teknologi web. PHP dapat dengan mudah berinteraksi dengan berbagai basis data seperti MySQL, SQLite, PostgreSQL, dan lainnya. Ini memungkinkan pengembang untuk membuat situs web yang dinamis dengan kemampuan seperti pendaftaran pengguna, formulir, sistem manajemen konten, dan masih banyak lagi.",
                    "Bahasa pemrograman PHP juga memiliki beberapa kekurangan. Salah satunya adalah kinerja yang cenderung lebih lambat dibandingkan dengan bahasa pemrograman lain yang dikompilasi, seperti Java atau C++. Selain itu, sejarah PHP juga menunjukkan beberapa masalah keamanan, yang memerlukan perhatian khusus dari pengembang untuk memastikan keamanan aplikasi."
                )
            )
            add(
                ProgrammingLanguage(
                    "Python",
                    image = R.drawable.ic_python,
                    "Python adalah bahasa pemrograman tingkat tinggi yang populer untuk pengembangan perangkat lunak. Dikenal dengan sintaksis yang bersih dan mudah dipahami, Python sering digunakan dalam berbagai aplikasi seperti pengembangan web, analisis data, kecerdasan buatan, dan pengembangan permainan.",
                    "Python memiliki kelebihan seperti kemudahan pembelajaran dan penggunaan, dukungan komunitas yang besar, serta tersedianya banyak pustaka dan framework yang mempercepat pengembangan. Python juga terkenal karena fleksibilitasnya yang tinggi, mendukung banyak paradigma pemrograman seperti pemrograman berorientasi objek, pemrograman fungsional, dan pemrograman prosedural.",
                    "Python juga memiliki beberapa kekurangan, termasuk kinerja yang relatif lambat dibandingkan dengan bahasa yang dikompilasi, terutama dalam pengolahan data besar. Selain itu, karena Python adalah bahasa interpretatif, aplikasi Python cenderung memerlukan lebih banyak sumber daya CPU dan memori daripada aplikasi yang ditulis dalam bahasa yang dikompilasi."
                )
            )
            add(
                ProgrammingLanguage(
                    "Javascript", image = R.drawable.ic_javascript,
                    "JavaScript adalah bahasa pemrograman yang digunakan secara luas untuk pengembangan aplikasi web. Dibuat untuk memberikan interaktivitas pada halaman web, JavaScript dapat dijalankan di sisi klien (browser) untuk memanipulasi elemen HTML, berinteraksi dengan pengguna, dan mengirim permintaan ke server.",
                    "Kelebihan JavaScript termasuk kemampuan untuk membuat aplikasi web yang responsif dan dinamis tanpa perlu me-refresh halaman, integrasi yang baik dengan HTML dan CSS, serta adopsi yang luas di komunitas pengembangan web. Selain itu, JavaScript memiliki banyak framework dan library yang mempercepat pengembangan aplikasi web, seperti React, Angular, dan Vue.js.",
                    " JavaScript juga memiliki beberapa kelemahan. Salah satunya adalah keterbatasan dalam keamanan, karena kode JavaScript dieksekusi di sisi klien dan dapat dimanipulasi oleh pengguna. Selain itu, perbedaan implementasi di berbagai browser kadang dapat menyebabkan masalah kompatibilitas. Meskipun demikian, JavaScript tetap menjadi salah satu bahasa pemrograman yang paling populer dan penting untuk pengembangan web."
                )
            )
            add(
                ProgrammingLanguage(
                    "C++",
                    image = R.drawable.ic_c_plus,
                    "C++ adalah bahasa pemrograman tingkat tinggi yang digunakan untuk pengembangan perangkat lunak, terutama aplikasi desktop dan sistem yang memerlukan kinerja tinggi. Bahasa ini memiliki sintaksis yang mirip dengan C, sehingga penggunaan dan pemahamannya relatif mudah bagi mereka yang sudah terbiasa dengan bahasa tersebut.",
                    "Kelebihan C++ meliputi kinerja yang tinggi, kontrol yang lebih baik terhadap sumber daya sistem, kemampuan untuk melakukan pemrograman prosedural, berorientasi objek, dan generik. Bahasa ini juga memiliki dukungan yang kuat terhadap komunitas, serta banyaknya pustaka dan framework yang tersedia untuk mempercepat pengembangan.",
                    "C++ juga memiliki beberapa kelemahan. Sintaksisnya yang kompleks dan lebih sulit dipahami bagi pemula dapat menjadi hambatan. Selain itu, penggunaan yang tidak hati-hati dapat mengakibatkan kerentanan keamanan, terutama dalam manajemen memori. Selain itu, pengembangan dengan C++ cenderung memakan waktu lebih lama dibandingkan dengan bahasa yang lebih tinggi tingkat abstraksi, seperti Python atau Java."
                )
            )
            add(
                ProgrammingLanguage(
                    "C#",
                    image = R.drawable.ic_c_sharp,
                    "C# adalah bahasa pemrograman yang dikembangkan oleh Microsoft dan dirilis pada tahun 2000 sebagai bagian dari platform .NET. Ini adalah bahasa yang kuat dan serbaguna, terutama digunakan untuk pengembangan perangkat lunak berbasis Windows, game, dan aplikasi web.",
                    "Kelebihan dari C# meliputi keamanan yang tinggi karena konsep kode yang bersih, dukungan yang kuat untuk pemrograman berorientasi objek, integrasi yang baik dengan platform Microsoft, dan ketersediaan pustaka yang luas. Selain itu, C# memiliki komunitas pengguna yang besar dan aktif, serta dukungan resmi dari Microsoft.",
                    "C# juga memiliki beberapa kekurangan. Salah satunya adalah kurangnya portabilitas karena ketergantungan pada platform Microsoft. Kinerjanya bisa menjadi perhatian dalam beberapa kasus, terutama pada aplikasi yang sangat besar atau yang membutuhkan kinerja tinggi. Selain itu, kurva pembelajarannya mungkin lebih curam bagi pemula dibandingkan dengan beberapa bahasa pemrograman lainnya."
                )
            )
            add(
                ProgrammingLanguage(
                    "Swift",
                    image = R.drawable.ic_swift,
                    "Swift adalah bahasa pemrograman yang dikembangkan oleh Apple untuk pengembangan aplikasi iOS, macOS, watchOS, dan tvOS. Didesain sebagai pengganti dari Objective-C, Swift memiliki sintaksis yang bersih dan ekspresif, serta berfokus pada keselamatan dan keamanan kode.",
                    "Kelebihan Swift termasuk kemudahan pembelajaran dan penggunaan, performa yang tinggi, dukungan penuh dari Apple dan komunitasnya, serta fitur-fitur modern seperti type inference, generics, dan optionals yang membuat kode lebih aman dan efisien.",
                    "Swift juga memiliki beberapa kekurangan. Ini termasuk kurangnya kompatibilitas mundur dengan versi Swift yang lebih lama, terutama karena Apple sering melakukan perubahan signifikan dalam pembaruan versi, serta terbatasnya penggunaan Swift di luar lingkup platform Apple, seperti Android atau pengembangan web."
                )
            )
            add(
                ProgrammingLanguage(
                    "Go Lang",
                    image = R.drawable.ic_go,
                    "Go, juga dikenal sebagai Golang, adalah bahasa pemrograman yang dikembangkan oleh Google pada tahun 2007 dan dirilis secara resmi pada tahun 2009. Go didesain untuk menggabungkan kecepatan kompilasi dengan kinerja yang efisien dalam eksekusi program. Bahasa ini memiliki sintaksis yang sederhana dan mudah dipahami, dengan fokus pada kesederhanaan dan kejelasan kode.",
                    "Kelebihan Go meliputi performa tinggi, kemampuan konkurensi yang kuat dengan goroutines, serta manajemen memori yang efisien. Go juga memiliki pengelolaan dependensi yang baik dengan modul dan standar kompatibilitas mundur yang kuat. Selain itu, Go memiliki sistem pengujian bawaan yang kuat serta dokumentasi yang baik.",
                    "Go juga memiliki beberapa kekurangan. Salah satunya adalah kurangnya dukungan untuk generics, yang dapat mempersulit penulisan kode dalam beberapa kasus. Selain itu, ekosistem pustaka dan framework Go mungkin tidak sekuat bahasa pemrograman lain yang lebih mapan seperti Python atau JavaScript. Meskipun demikian, Go tetap menjadi pilihan yang populer untuk pengembangan aplikasi berperforma tinggi dan konkurensi."
                )
            )
            add(
                ProgrammingLanguage(
                    "Ruby",
                    image = R.drawable.ic_ruby,
                    "Ruby adalah bahasa pemrograman dinamis yang dirancang oleh Yukihiro Matsumoto pada tahun 1995. Bahasa ini terkenal dengan sintaksisnya yang sederhana dan mudah dipahami, serta fleksibilitasnya dalam memungkinkan pengembang untuk menulis kode yang singkat dan mudah dipelihara.",
                    "Kelebihan dari bahasa Ruby termasuk kemampuan untuk mengembangkan aplikasi dengan cepat berkat sintaksis yang ekspresif dan penggunaan framework seperti Ruby on Rails. Selain itu, Ruby memiliki komunitas yang aktif dan ramah, dengan banyaknya pustaka dan alat pengembangan yang tersedia untuk mendukung proyek-proyeknya.",
                    "Ruby juga memiliki kekurangan, terutama dalam hal kinerja. Meskipun telah ada peningkatan dalam versi-versi terbaru, Ruby masih cenderung memiliki kinerja yang lebih lambat dibandingkan dengan bahasa pemrograman lain seperti C++ atau Java. Selain itu, karena penggunaan yang kurang luas dibandingkan dengan beberapa bahasa lain, sumber daya untuk belajar dan dukungan mungkin tidak sebanyak yang tersedia untuk bahasa lain yang lebih populer."
                )
            )
        }
        return listProgrammingLanguage
    }
}