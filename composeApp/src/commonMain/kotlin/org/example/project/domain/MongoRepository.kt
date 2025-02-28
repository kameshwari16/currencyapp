package org.example.project.domain


import kotlinx.coroutines.flow.Flow
import org.example.project.domain.model.Currency
import org.example.project.domain.model.RequestState

interface MongoRepository {
    fun configureTheRealm()
    suspend fun insertCurrencyData(currency: Currency)
    fun readCurrencyData(): Flow<RequestState<List<Currency>>>
    suspend fun cleanUp()
}