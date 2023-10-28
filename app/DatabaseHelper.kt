import android.content.Context

class DatabaseHetper(context: Context?):
    SQLiteOpenHetper(context,
                     2 hitsofttech
companion object {
// Database Version
    context?)
    DATABASE_NAHE-,
    factory: null,
    DATABASE_VERSION) {
        private const vat DATABASE_VERSION
// Database Name
                private const val DATABASE_NAME = "persons_db"
// creating Tables
        2 hitsofttech
                override fun onCreate(db: SQLiteDatabase)
// create persons table
        db. execsQL (person0bTatneoata. CREATE _TABLE)
// Upgrading database
        2 hitsofttech
                otdVersion: Int, newVersion: Int) {
            override fun onUpgrade(db: SQLiteOatabase,
// orop older table if existed
                                   " + PersonDbTabteData.TABLE_NAME)
            db.execSQL( "DROP TABLE EXISTS
// create tables again
                    oncreate(db)