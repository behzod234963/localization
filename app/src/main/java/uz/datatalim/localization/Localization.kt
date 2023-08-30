package uz.datatalim.localization

import android.app.Application

class Localization:Application() {

    override fun onCreate() {
        super.onCreate()
        setLang()
    }

    private fun setLang() {

        val lang=SharedPreferences(this).getLang()
        lang?.let { LocalManager.setLocale(this, it) }

    }

}