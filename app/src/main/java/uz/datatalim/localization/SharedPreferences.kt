package uz.datatalim.localization

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

class SharedPreferences(val ctx:Context) {

    val pref=ctx.getSharedPreferences("MySharedPref", AppCompatActivity.MODE_PRIVATE)
    fun saveLang(language: String) {

        val editor=pref.edit()
        editor.putString("Lang",language)
        editor.apply()

    }

    fun getLang(): String? {

        val editor = pref.edit()
        return pref.getString("Lang", "en",)

    }

}