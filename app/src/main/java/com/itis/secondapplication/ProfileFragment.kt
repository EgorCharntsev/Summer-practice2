package com.itis.secondapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.itis.secondapplication.databinding.FragmentProfileBinding
import com.itis.secondapplication.databinding.FragmentServicesBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private var binding : FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        binding?.btnNavigationToMusic?.setOnClickListener{
            findNavController().navigate(R.id.action_profileFragment_to_musicFragment,
                MusicFragment.createBundle(ProfileFragment().javaClass.name))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}