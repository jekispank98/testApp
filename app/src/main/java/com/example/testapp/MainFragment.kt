package com.example.testapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.testapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setButtonListeners()
    }

    private fun setButtonListeners() {
        binding.apply {
            btUpgradeProduceSpeed.setOnClickListener { showToastMessage() }
            btUpgradeStartUnits.setOnClickListener { showToastMessage() }
            btTapToPlay.setOnClickListener { navigateToPlayFragment() }
            btAd.setOnClickListener { showToastMessage() }
            btPvp.setOnClickListener { showToastMessage() }
            btMarket.setOnClickListener { showToastMessage() }
            btWins.setOnClickListener { showToastMessage() }
            btSilver.setOnClickListener { showToastMessage() }
        }
    }

    private fun showToastMessage() {
        Toast.makeText(requireContext(), "Click-Click!", Toast.LENGTH_SHORT).show()
    }

    private fun navigateToPlayFragment() {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, PlayFragment.newInstance())
            .commit()
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}