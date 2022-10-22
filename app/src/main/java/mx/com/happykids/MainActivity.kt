package mx.com.happykids

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import mx.com.happykids.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setFragment(HomeFragment(), HomeFragment.TAG)
        setupBottomNav()
    }

    private fun setupBottomNav() = with(binding.bottomNav) {
        setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> setFragment(HomeFragment(), HomeFragment.TAG)
                R.id.computer -> setFragment(ComputerFragment(), ComputerFragment.TAG)
                R.id.videogame -> setFragment(VideoGameFragment(), VideoGameFragment.TAG)
                R.id.video -> setFragment(VideoFragment(), VideoFragment.TAG)
            }
            return@setOnItemSelectedListener true
        }
    }

    private fun setFragment(fragment: Fragment, tag: String) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, fragment, tag)
            .commit()
    }

}