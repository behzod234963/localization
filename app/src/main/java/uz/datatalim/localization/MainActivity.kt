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
            tvText.text= LocalManager.setLocale(this,"ru").toString()
            tvText.text=SharedPreferences(this).saveLang("ru").toString()

        }

        btnUzbek.setOnClickListener {

            openLangActivity()
            LocalManager.setLocale(this,"uz")
            SharedPreferences(this).saveLang("uz")
            tvText.text= LocalManager.setLocale(this,"uz").toString()
            tvText.text=SharedPreferences(this).saveLang("uz").toString()

        }

        btnEnglish.setOnClickListener {

            openLangActivity()
            LocalManager.setLocale(this,"en")
            SharedPreferences(this).saveLang("en")
            tvText.text= LocalManager.setLocale(this,"en").toString()
            tvText.text=SharedPreferences(this).saveLang("en").toString()
        }

    }

    private fun openLangActivity() {

        val intent=Intent(this,LanguageActivity::class.java)
        startActivity(intent)

    }



}