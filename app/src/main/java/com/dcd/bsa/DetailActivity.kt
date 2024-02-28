package com.dcd.bsa

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.dcd.bsa.databinding.ActivityDetailBinding
import com.dcd.bsa.datasource.ProgrammingLanguage
import com.dcd.bsa.utils.parcelable

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private var data: ProgrammingLanguage = ProgrammingLanguage()

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getParcelableData()
        setupView()
    }

    private fun getParcelableData() {
        data = intent.parcelable(EXTRA_DATA) ?: ProgrammingLanguage()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_app_bar_detail, menu)
        return true
    }

    private fun setupView() = with(binding) {
        val (name, image, description, advantage, deficiency ) = data
        toolbar.title = name
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId) {
                R.id.action_share -> {
                    val sendIntent: Intent = Intent().apply {
                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, "$name\n$description")
                        type = "text/plain"
                    }

                    val shareIntent = Intent.createChooser(sendIntent, null)
                    startActivity(shareIntent)
                    true
                }
                else -> false
            }
        }
        ivProgrammingLanguage.load(image)
        tvName.text = name
        tvDescription.text = description
        tvAdvantage.text = advantage
        tvDeficiency.text = deficiency
    }

}
