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
        val lang=SharedPreferences(this).getLang()
        val tvText:TextView=findViewById(R.id.tvText_main)
        val btnUzbek:Button=findViewById(R.id.btnUzbek)
        val btnRussian:Button=findViewById(R.id.btnRussian)
        val btnEnglish:Button=findViewById(R.id.btnEnglish)
        val btnKorean:Button=findViewById(R.id.btnKorean)
        val btnJapan:Button=findViewById(R.id.btnJapanese)
        val btnArab:Button=findViewById(R.id.btnArabic)
        val btnFrench:Button=findViewById(R.id.btnFrench)
        val btnGerman:Button=findViewById(R.id.btnGerman)
        LocalManager.setLocale(this, lang)

        btnGerman.setOnClickListener {

            LocalManager.setLocale(this,"de")
            SharedPreferences(this).saveLang("de")
            openLangActivity()

        }

        btnFrench.setOnClickListener {

            LocalManager.setLocale(this,"fr")
            SharedPreferences(this).saveLang("fr")
            openLangActivity()

        }

        btnArab.setOnClickListener {

            LocalManager.setLocale(this,"ar")
            SharedPreferences(this).saveLang("ar")
            openLangActivity()

        }

        btnJapan.setOnClickListener {

            LocalManager.setLocale(this,"ja")
            SharedPreferences(this).saveLang("ja")
            openLangActivity()

        }

        btnKorean.setOnClickListener {

            LocalManager.setLocale(this,"ko")
            SharedPreferences(this).saveLang("ko")
            openLangActivity()

        }

        btnRussian.setOnClickListener {

            LocalManager.setLocale(this,"ru")
            SharedPreferences(this).saveLang("ru")
            openLangActivity()

        }

        btnUzbek.setOnClickListener {

            LocalManager.setLocale(this,"uz")
            SharedPreferences(this).saveLang("uz")
            openLangActivity()

        }

        btnEnglish.setOnClickListener {

            LocalManager.setLocale(this,"en")
            SharedPreferences(this).saveLang("en")
            openLangActivity()
        }

    }

    private fun openLangActivity() {

        val intent=Intent(this,LanguageActivity::class.java)
        startActivity(intent)

    }



}