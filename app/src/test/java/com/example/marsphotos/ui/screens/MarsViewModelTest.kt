package com.example.marsphotos.ui.screens

import com.example.marsphotos.fake.FakeDataSource
import com.example.marsphotos.fake.FakeNetworkMarsPhotoRepository
import com.example.marsphotos.rules.TestDispatcherRule
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MarsViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() = runTest {
        val marsViewModel = MarsViewModel(
            marsPhotoRepository = FakeNetworkMarsPhotoRepository()
        )
        assertEquals(
            MarsUiState.Success(
                "Success: ${FakeDataSource.photosList.size} Mars " +
                        "photos retrieved"
            ),
            marsViewModel.marsUiState
        )
    }

}
