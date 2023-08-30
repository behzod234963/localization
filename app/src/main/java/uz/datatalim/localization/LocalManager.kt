package uz.datatalim.localization

import android.app.LocaleManager
import android.content.Context
import android.os.Build
import android.os.LocaleList
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import java.util.Locale

object LocalManager {

    private var localeManager:LocaleManager?=null
    fun setLocale(ctx: Context, language:String){

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.TIRAMISU){

            setTiramisuLocale(ctx,language)

        }else{

            val locale= Locale(language)
            Locale.setDefault(locale)
            val config=ctx.resources.configuration
            config.locale=locale
            ctx.resources.updateConfiguration(config,ctx.resources.displayMetrics)

        }

    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    fun setTiramisuLocale(ctx: Context,language: String){

        localeManager=ctx.getSystemService(Context.LOCALE_SERVICE) as LocaleManager
        localeManager?.applicationLocales= LocaleList(Locale.forLanguageTag(language))

    }

}