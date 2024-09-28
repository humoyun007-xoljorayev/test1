package com.example.kunuz

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kunuz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.card1.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kun.uz/news/2024/09/18/boysundagi-konda-yana-avariya-kuzatildi-qurbonlar-bor")
            startActivity(intent)
        }
        binding.card2.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://youtu.be/MKVFbCrQBxc?si=KqsPqjyErQPV6w-W")
            startActivity(intent)
        }
        binding.card3.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kun.uz/news/2024/09/16/trampning-golf-klubi-yaqinidagi-otishma-nimalar-malum")
            startActivity(intent)
        }
        binding.card4.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kun.uz/news/2024/09/13/tramp-va-harris-debati-qanday-otdi-tahlilchilar-fikri")
            startActivity(intent)
        }
        binding.card5.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kun.uz/news/2024/09/13/tramp-harris-bilan-ikkinchi-teledebatdan-voz-kechdi")
            startActivity(intent)
        }
    }
}