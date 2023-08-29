package uz.datatalim.localization

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LanguageActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        initView()

    }

    private fun initView() {

        val tvText:TextView=findViewById(R.id.tvText_lang)

    }
}