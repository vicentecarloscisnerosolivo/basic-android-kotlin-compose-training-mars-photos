package com.example.marsphotos.fake

import com.example.marsphotos.data.MarsPhotoRepository

class FakeNetworkMarsPhotoRepository : MarsPhotoRepository {
    override suspend fun getMarsPhotos() =
        FakeDataSource.photosList
}