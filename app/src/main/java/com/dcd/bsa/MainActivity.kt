package com.dcd.bsa

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.dcd.bsa.adapter.OnItemClickListener
import com.dcd.bsa.adapter.ProgrammingLanguageAdapter
import com.dcd.bsa.databinding.ActivityMainBinding
import com.dcd.bsa.datasource.LanguageData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter by lazy { ProgrammingLanguageAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_top_app_bar_home, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun setupRecyclerView() = with(binding) {
        setSupportActionBar(toolbar)
        toolbar.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId) {
                R.id.action_about_page -> {
                    val intent = Intent(this@MainActivity, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
        rvProgrammingLanguages.adapter = adapter
        adapter.setupList(LanguageData.getList())
        adapter.setListener(object : OnItemClickListener {
            override fun onItemClick(v: View, position: Int) {
                val item = adapter.getItemPosition(position)
                val intent = Intent(this@MainActivity, DetailActivity::class.java).apply {
                    putExtra(DetailActivity.EXTRA_DATA, item)
                }
                startActivity(intent)
            }
        })
    }
}