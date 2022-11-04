package com.example.marsphotos.fake

import com.example.marsphotos.network.MarsPhoto

object FakeDataSource {
    const val idOne = "img1"
    const val idTwo = "img2"
    const val imgOne = "url1"
    const val imgTwo = "url2"
    val photosList = listOf(
        MarsPhoto(id = idOne, imgSrc = imgOne),
        MarsPhoto(idTwo, imgTwo)
    )

}