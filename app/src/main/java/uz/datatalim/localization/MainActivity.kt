package uz.datatalim.localization

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {

        val tvText:TextView=findViewById(R.id.tvText_main)
        val btnUzbek:Button=findViewById(R.id.btnUzbek)
        val btnRussian:Button=findViewById(R.id.btnRussian)
        val btnEnglish:Button=findViewById(R.id.btnEnglish)

        btnRussian.setOnClickListener {

            openLangActivity()
            setLocale("ru")
            saveLang("ru")

        }

        btnUzbek.setOnClickListener {

            openLangActivity()
            setLocale("uz")
            saveLang("uz")

        }

        btnEnglish.setOnClickListener {

            openLangActivity()
            setLocale("en")
            saveLang("en")

        }

    }

    private fun openLangActivity() {

        val intent=Intent(this,LanguageActivity::class.java)
        startActivity(intent)

    }

    private fun saveLang(language: String) {

        val pref=getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val editor=pref.edit()
        editor.putString("Lang",language)
        editor.apply()

    }

    private fun setLocale(language:String){

        val locale=Locale(language)
        Locale.setDefault(locale)
        val config=baseContext.resources.configuration
        config.locale=locale
        baseContext.resources.updateConfiguration(config,baseContext.resources.displayMetrics)

        saveLang(language)
        getLang(language)

    }

    private fun getLang(language: String) {

        val pref=getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val editor=pref.edit()
        val lang=pref.getString("Lang","en",)

    }

}