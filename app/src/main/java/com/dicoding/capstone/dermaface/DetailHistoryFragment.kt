package com.dicoding.capstone.dermaface

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DetailHistoryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Example: Set the content of the fragment using arguments or ViewModel
        val diagnosisTextView: TextView = view.findViewById(R.id.tv_diagnosis)
        val recommendationTextView: TextView = view.findViewById(R.id.tv_recommendation)
        val dateTextView: TextView = view.findViewById(R.id.tv_date)

        // Set the data for the views (this is just an example)
        dateTextView.text = "Tanggal Pemindaian: 01/01/2024"
        diagnosisTextView.text = "Diagnosa: Kulit Kering"
        recommendationTextView.text = "Rekomendasi: Gunakan pelembap setiap hari"
    }
}
