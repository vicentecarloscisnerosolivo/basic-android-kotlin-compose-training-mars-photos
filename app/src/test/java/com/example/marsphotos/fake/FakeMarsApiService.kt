package com.example.marsphotos.fake

import com.example.marsphotos.network.MarsApiService

class FakeMarsApiService : MarsApiService {

    override suspend fun getPhotos() =
        FakeDataSource.photosList
}
