package mx.com.happykids

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import mx.com.happykids.databinding.FragmentVideoGameBinding

class VideoGameFragment : Fragment() {

    private var _binding: FragmentVideoGameBinding? = null
    private val binding: FragmentVideoGameBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVideoGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "VideoGameFragment"
    }

}