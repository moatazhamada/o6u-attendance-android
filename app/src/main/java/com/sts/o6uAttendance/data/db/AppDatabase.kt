package com.sts.o6uAttendance.data.db

//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase

//@Database(entities = [User::class/*, Subject::class*/], version = AppDatabase.VERSION)
abstract class AppDatabase /*: RoomDatabase() {

    abstract fun userDao(): UserDao
//    abstract fun subjectDao(): SubjectDao

    companion object {
        private const val DB_NAME = "Attendance.db"
        const val VERSION = 1
        private val instance: AppDatabase by lazy { create(App.instance) }

        @Synchronized
        internal fun getInstance(): AppDatabase {
            return instance
        }

        private fun create(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME)
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        }


//            // Singleton prevents multiple instances of database opening at the
//            // same time.
//            @Volatile
//            private var INSTANCE: AppDatabase? = null
//
//            fun getDatabase(context: Context): AppDatabase {
//                val tempInstance = INSTANCE
//                if (tempInstance != null) {
//                    return tempInstance
//                }
//                synchronized(this) {
//                    val instance = Room.databaseBuilder(
//                        context.applicationContext,
//                        AppDatabase::class.java,
//                        DB_NAME
//                    ).build()
//                    INSTANCE = instance
//                    return instance
//                }
//            }

    }

}*/