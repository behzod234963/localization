package uz.datatalim.localization

import android.content.Context
import java.util.Locale

object LocalManager {
    fun setLocale(ctx: Context, language:String){

        val locale= Locale(language)
        Locale.setDefault(locale)
        val config=ctx.resources.configuration
        config.locale=locale
        ctx.resources.updateConfiguration(config,ctx.resources.displayMetrics)


    }

}