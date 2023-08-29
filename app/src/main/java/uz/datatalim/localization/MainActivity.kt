package uz.datatalim.localization

import android.content.Intent
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
            LocalManager.setLocale(this,"ru")
            SharedPreferences(this).saveLang("ru")

        }

        btnUzbek.setOnClickListener {

            openLangActivity()
            LocalManager.setLocale(this,"uz")
            SharedPreferences(this).saveLang("uz")

        }

        btnEnglish.setOnClickListener {

            openLangActivity()
            LocalManager.setLocale(this,"en")
            SharedPreferences(this).saveLang("en")
        }

    }

    private fun openLangActivity() {

        val intent=Intent(this,LanguageActivity::class.java)
        startActivity(intent)

    }



}