package com.abelmsg.lab13

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abelmsg.lab13.databinding.ActivityGalleryBinding
import java.io.File

/**
 * Actividad que muestra un conjunto de imágenes almacenadas localmente utilizando un ViewPager.
 *
 * Esta actividad configura un [GalleryAdapter] para gestionar y mostrar las imágenes
 * en un ViewPager. Las imágenes se obtienen de un directorio externo del dispositivo.
 */
class GalleryActivity: AppCompatActivity() {
    private lateinit var binding: ActivityGalleryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val directory= File(externalMediaDirs[0].absolutePath)
        val files= directory.listFiles() as Array<File>
        val adapter= GalleryAdapter(files.reversedArray())
        binding.viewPager.adapter = adapter
    }
}