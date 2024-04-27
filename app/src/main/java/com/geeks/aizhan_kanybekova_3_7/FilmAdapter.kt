package com.geeks.aizhan_kanybekova_3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.aizhan_kanybekova_3_7.databinding.FilmItemBinding
import java.text.SimpleDateFormat
import java.util.*

class FilmAdapter(private val filmList: List<Film>,private val itemClickListener:FilmItemClick) : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val binding = FilmItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FilmViewHolder(binding)
    }

    override fun getItemCount(): Int = filmList.size

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val film = filmList[position]
        holder.bind(film, position + 1)
        holder.itemView.setOnClickListener { itemClickListener.onFilmItemClick(film) }
    }


    class FilmViewHolder(private val binding: FilmItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(film: Film, index: Int) {
            val currentTime = Calendar.getInstance().time
            val sdf24 = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
            val formattedTime24 = sdf24.format(currentTime)

            binding.tvFilmNumber.text = index.toString()
            binding.tvFilmName.text = film.name
            binding.textClock.text = formattedTime24
        }
    }
}



