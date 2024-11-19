package com.example.raionacademy


data class AppEntity(
    val id: String,
    val name: String,
    val category: String,
    val rating: Double,
    val imageURL: String,
)

object AppObject {
    val whatsapp = AppEntity(
        id = "1",
        name = "Whatsapp Messager",
        category = "Communication",
        rating = 4.5,
        imageURL = "https://cdn-icons-png.freepik.com/256/15707/15707917.png?semt=ais_hybrid"
    )
    val capcut = AppEntity(
        id = "2",
        name = "Capcut - Video Editor",
        category = "Video Player & Editor",
        rating = 4.0,
        imageURL = "https://uxwing.com/wp-content/themes/uxwing/download/brands-and-social-media/capcut-icon.png"
    )
    val tiktok = AppEntity(
        id = "3",
        name = "Tiktok",
        category = "Video Player & Editor",
        rating = 4.3,
        imageURL = "https://w7.pngwing.com/pngs/986/124/png-transparent-tiktok-social-media-logos-brands-icon-thumbnail.png"

    )
    val dana = AppEntity(
        id = "4",
        name = "Dana",
        category = "Digital Wallet",
        rating = 4.6,
        imageURL = "https://i.pinimg.com/originals/f5/8c/a3/f58ca3528b238877e9855fcac1daa328.jpg"
    )
}