package com.example.recycleviewch6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MahasiswaAdapter: RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {
    private val mahasiswas: MutableList<Mahasiswa> = mutableListOf()

    fun addMahasiswas(mahasiswas: List<Mahasiswa>) {
        this.mahasiswas.addAll(mahasiswas)
        notifyDataSetChanged()
    }

    fun addMahasiswa(mahasiswa: Mahasiswa) {
        this.mahasiswas.add(mahasiswa)
        notifyDataSetChanged()
    }

    inner class MahasiswaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(itemMahasiswa: Mahasiswa) = itemView.run {
            val tvItemName: TextView = findViewById(R.id.item_tv_name)
            val tvItemFakultas: TextView = findViewById(R.id.item_tv_fakultas)
            val tvItemJurusan: TextView = findViewById(R.id.item_tv_jurusan)
            val tvItemNameIpk: TextView = findViewById(R.id.item_tv_nameipk)
            val tvItemIpk: TextView = findViewById(R.id.item_tv_ipk)

            tvItemName.text = itemMahasiswa.name
            tvItemFakultas.text = itemMahasiswa.fakultas
            tvItemJurusan.text = itemMahasiswa.jurusan
            tvItemNameIpk.text = itemMahasiswa.nameipk
            tvItemIpk.text = itemMahasiswa.nilai.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        val context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.layout_item_mahasiswa, parent, false)
        return MahasiswaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        val mahasiswa = mahasiswas[position]
        holder.bind(mahasiswa)
    }

    override fun getItemCount(): Int {
        return mahasiswas.size
    }
}