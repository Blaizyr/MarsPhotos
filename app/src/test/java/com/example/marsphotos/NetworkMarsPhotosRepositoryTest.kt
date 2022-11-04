package com.example.marsphotos

import com.example.marsphotos.data.DefaultMarsPhotosRepository
import com.example.marsphotos.fake.FakeDataSource
import com.example.marsphotos.fake.FakeMarsApiService
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test


class NetworkMarsPhotosRepositoryTest {

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
            val repository = DefaultMarsPhotosRepository(FakeMarsApiService())
            assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }

}