package io.smallant.imerir.library.data.sources.local

import io.smallant.imerir.library.data.sources.local.database.dao.BaseDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

abstract class BaseLocalDataSource<T, DAO: BaseDao<T>>(protected val dao: DAO) {

    fun deleteItem(item: T) {
        dao.delete(item)
    }

    suspend fun saveItem(item: T): Long {
        return withContext(Dispatchers.IO) {
            dao.insertOrUpdate(item)
        }
    }

    fun saveItems(list: List<T>) {
        dao.insertOrUpdate(list)
    }
}