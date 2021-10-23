package com.example.recycleviewch6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val rvMahasiswa: RecyclerView by lazy {
        findViewById(R.id.rv_mahasiswa)
    }

    private val mahasiswaAdapter: MahasiswaAdapter by lazy {
        MahasiswaAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMahasiswa.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rvMahasiswa.adapter = mahasiswaAdapter

        val dataMahasiswa = Constant.mahasiswas
        mahasiswaAdapter.addMahasiswas(dataMahasiswa)

    }
}