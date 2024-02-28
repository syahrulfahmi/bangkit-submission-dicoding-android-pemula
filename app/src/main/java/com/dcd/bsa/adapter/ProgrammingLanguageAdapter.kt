package com.dcd.bsa.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.dcd.bsa.databinding.ItemProgrammingLanguageBinding
import com.dcd.bsa.datasource.ProgrammingLanguage

class ProgrammingLanguageAdapter : RecyclerView.Adapter<ProgrammingLanguageAdapter.ProgrammingLanguageViewHolder>() {

    private var listener: OnItemClickListener? = null
    private var list: List<ProgrammingLanguage> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammingLanguageViewHolder {
        val binding = ItemProgrammingLanguageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProgrammingLanguageViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ProgrammingLanguageViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener {
            listener?.onItemClick(it, position)
        }
    }

    fun setupList(list: List<ProgrammingLanguage>) {
        this.list = list
    }

    fun getItemPosition(position: Int) : ProgrammingLanguage = list[position]

    fun setListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    inner class ProgrammingLanguageViewHolder(private val binding: ItemProgrammingLanguageBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ProgrammingLanguage) = with(binding) {
            val (name, image, description) = item
            ivProgrammingLanguage.load(image)
            tvName.text = name
            tvDescription.text = description
        }
    }
}