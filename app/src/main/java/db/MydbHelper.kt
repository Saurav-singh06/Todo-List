package db

import android.content.Context
import android.database.sqlite.SQLiteOpenHelper

class MydbHelper(context: Context):SQLiteOpenHelper(
        context, "todos.db",
) {
}