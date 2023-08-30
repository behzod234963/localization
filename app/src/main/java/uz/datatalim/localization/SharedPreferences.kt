package uz.datatalim.localization

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity

class SharedPreferences(private val ctx:Context) {

    private val pref: SharedPreferences =ctx.getSharedPreferences("MySharedPref", AppCompatActivity.MODE_PRIVATE)
    fun saveLang(language: String) {

        val editor=pref.edit()
        editor.putString("Lang",language)
        editor.apply()

    }

    fun getLang(): String {

        val language=pref.getString("Lang", "en",)
        return language!!

    }

}