package io.smallant.imerir.library.data.sources.local.database.dao

import androidx.room.*


@Dao
abstract class BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun insert(obj: T): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun insert(obj: List<T>): List<Long>

    @Update
    abstract fun update(obj: T): Int

    @Update
    abstract fun update(obj: List<T>): Int

    @Delete
    abstract fun delete(obj: T)

    @Delete
    abstract fun delete(obj: List<T>)

    @Transaction
    open fun insertOrUpdate(obj: T): Long {
        val id = insert(obj)
        if (id == -1L) update(obj)
        return id
    }

    @Transaction
    open fun insertOrUpdate(objList: List<T>) {
        val insertResult = insert(objList)
        val updateList = mutableListOf<T>()

        for (i in insertResult.indices) {
            if (insertResult[i] == -1L) updateList.add(objList[i])
        }

        if (updateList.isNotEmpty()) update(updateList)
    }
}