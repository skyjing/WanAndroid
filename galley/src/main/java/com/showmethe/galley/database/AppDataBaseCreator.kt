package com.showmethe.galley.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.showmethe.galley.database.dao.PhotoWallDao
import com.showmethe.galley.database.dao.UserDataDao
import com.showmethe.galley.database.dto.PhotoWallDto
import com.showmethe.galley.database.dto.UserDto

/**
 * Author: showMeThe
 * Update Time: 2019/10/18 14:30
 * Package Name:com.showmethe.galley.database
 */
@Database(entities = arrayOf(PhotoWallDto::class,UserDto::class),version = 1)
abstract class AppDataBaseCreator : RoomDatabase() {

    abstract fun getPhotoDao() : PhotoWallDao

    abstract fun getUserDao() : UserDataDao


}