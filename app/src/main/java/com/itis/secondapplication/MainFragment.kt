package com.itis.secondapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.secondapplication.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var binding : FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

//        binding?.run {
//            btnToChats.setOnClickListener {
//                findNavController().navigate(R.id.action_mainFragment_to_chatFragment)
//            }
//            btnToProfile.setOnClickListener {
//
//                findNavController().navigate(R.id.action_mainFragment_to_profileFragment,
//                ProfileFragment.createBundle("JoJo", 33))
//            }
//            btnToServices.setOnClickListener {
//                findNavController().navigate(R.id.action_mainFragment_to_serviceFragment)
//            }
//            btnToSettings.setOnClickListener {
//                findNavController().navigate(R.id.action_mainFragment_to_settingFragment)
//            }
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}