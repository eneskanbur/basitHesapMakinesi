package com.enesk.basithesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.enesk.basithesapmakinesi.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    fun toplamaYap(view : View){
        var ilkSayi: String? = binding.ilkSayi.text.toString()
        var ikinciSayi: String? = binding.ikinciSayi.text.toString()

        if(kontrol(ilkSayi,ikinciSayi)){
            var result= (ilkSayi!!.toDouble()) + (ikinciSayi!!.toDouble())
            binding.islemSonuc.text = result.toString()
        }else{
            binding.islemSonuc.text = "Lütfen Bir Sayı Giriniz"
        }
    }

    fun cikartmaYap(view : View){
        var ilkSayi: String? = binding.ilkSayi.text.toString()
        var ikinciSayi: String? = binding.ikinciSayi.text.toString()

        if(kontrol(ilkSayi,ikinciSayi)){
            var result = ilkSayi!!.toDouble() - ikinciSayi!!.toDouble()
            binding.islemSonuc.text = result.toString()
        }else{
            binding.islemSonuc.text = "Lütfen Bir Sayı Giriniz"
        }
    }

    fun bolmeYap(view : View){
        var ilkSayi: String? = binding.ilkSayi.text.toString()
        var ikinciSayi: String? = binding.ikinciSayi.text.toString()

        if(kontrol(ilkSayi,ikinciSayi)){
            var result= ilkSayi!!.toDouble() / ikinciSayi!!.toDouble()
            binding.islemSonuc.text = result.toString()
        }else{
            binding.islemSonuc.text = "Lütfen Bir Sayı Giriniz"
        }
    }

    fun carpmaYap(view : View){
        var ilkSayi: String? = binding.ilkSayi.text.toString()
        var ikinciSayi: String? = binding.ikinciSayi.text.toString()

        if(kontrol(ilkSayi,ikinciSayi)){
            var result= ilkSayi!!.toDouble() * ikinciSayi!!.toDouble()
            binding.islemSonuc.text = result.toString()
        }else{
            binding.islemSonuc.text = "Lütfen Bir Sayı Giriniz"
        }
    }

    fun kontrol(ilk: String?,ikinci: String?): Boolean{
        if(ilk.isNullOrEmpty()|| ikinci.isNullOrEmpty()){
            return false
        }
        return true
    }

}