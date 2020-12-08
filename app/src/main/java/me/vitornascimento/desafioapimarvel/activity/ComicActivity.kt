package me.vitornascimento.desafioapimarvel.activity

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import me.vitornascimento.desafioapimarvel.R
import me.vitornascimento.desafioapimarvel.domain.Comic
import me.vitornascimento.desafioapimarvel.extension.toFormatted
import me.vitornascimento.desafioapimarvel.extension.toPrice
import kotlinx.android.synthetic.main.activity_comic.*
import com.bumptech.glide.Glide

class ComicActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic)

        val comic = intent.getSerializableExtra("comic") as Comic

        tvTitulo.text = comic.title

        tvDescricao.text = comic.description ?: getString(R.string.no_description)

        tvPaginas.text = (comic.pageCount ?: getString(R.string.no_info)).toString()

        tvDataPublicacao.text = comic.dates.firstOrNull { it.type == "onsaleDate" }?.getDate()?.toFormatted() ?: getString(R.string.no_info)

        tvPreco.text = comic.prices.firstOrNull { it.type == "printPrice" }?.price?.toPrice() ?: getString(R.string.no_info)

        Glide.with(this).asBitmap()
            .load(comic.images.first().toString())
            .into(ivComicCover)

        Glide.with(this).asBitmap()
            .load(comic.images.first().toString())
            .into(ivCover)

        toolbar.setNavigationOnClickListener {
            this.onBackPressed()
        }
    }
}