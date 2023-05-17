package com.example.perapplanguage

import android.app.LocaleManager
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.LocaleList
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.util.*

class MainActivity : AppCompatActivity() {
    private var localeManager: LocaleManager? = null

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            localeManager =
                getSystemService(Context.LOCALE_SERVICE) as LocaleManager
        }

        findViewById<Button>(R.id.button_lang_id).setOnClickListener {
            localeManager?.applicationLocales = LocaleList(Locale.forLanguageTag("id-ID"))
        }
    }
}