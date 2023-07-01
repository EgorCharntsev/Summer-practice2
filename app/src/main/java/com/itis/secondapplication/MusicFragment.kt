package com.itis.secondapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.itis.secondapplication.databinding.FragmentMusicBinding

class MusicFragment : Fragment(R.layout.fragment_music) {

    private var binding : FragmentMusicBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMusicBinding.bind(view)

        val className = arguments?.getString(CLASS_NAME)
        if (className != null) {
            Snackbar.make(binding!!.root, className, Snackbar.LENGTH_LONG).show()
        }

        binding?.btnNavigationToServices?.setOnClickListener{
            findNavController().navigateUp()
        }
    }

    companion object {

        private const val CLASS_NAME = "CLASS_NAME"

        fun createBundle(name: String) : Bundle {
            val bundle = Bundle()
            bundle.putString(CLASS_NAME, name)

            return bundle
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}