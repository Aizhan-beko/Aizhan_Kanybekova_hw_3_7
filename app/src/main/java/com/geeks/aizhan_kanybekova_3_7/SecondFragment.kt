package com.geeks.aizhan_kanybekova_3_7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.aizhan_kanybekova_3_7.databinding.FragmentSecondBinding


class SecondFragment : Fragment(), FilmItemClick {
    private lateinit var binding: FragmentSecondBinding
    private val filmList = arrayListOf(
        Film("The gentleman"),
        Film("Young Sheldon"),
        Film("Poor things"),
        Film("Poor things"),
        Film("The Sympathyzer"),
        Film("Jump Street"),
        Film("The workout room"),
        Film("Ruin Agency"),
        Film("Dead Rappers"),
        Film("Same Girl"),
        Film("Bob N Weave")

    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val adapter = FilmAdapter(filmList, this)
        binding.rvFilms.adapter = adapter
    }

    override fun onFilmItemClick(film: Film) {
        val intent = Intent(requireContext(), SecondActivity::class.java)
        intent.putExtra("filmName", film.name)

        startActivity(intent)

    }
}

