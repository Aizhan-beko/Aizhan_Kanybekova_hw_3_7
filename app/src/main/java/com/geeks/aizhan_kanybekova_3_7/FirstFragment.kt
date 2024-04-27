package com.geeks.aizhan_kanybekova_3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.aizhan_kanybekova_3_7.databinding.FragmentFirstBinding

private var binding:FragmentFirstBinding?=null;
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        var view = binding!!.root;
        return view
            }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    }
