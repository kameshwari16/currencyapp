package org.example.project.domain

import io.realm.kotlin.internal.interop.Timestamp

interface PreferencesRepository {
    suspend fun saveLastUpdated(lastUpdated:String)
    suspend fun isDataFresh(currentTimestamp: Long):Boolean
}