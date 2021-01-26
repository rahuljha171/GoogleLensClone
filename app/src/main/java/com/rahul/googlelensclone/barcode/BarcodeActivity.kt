package com.rahul.googlelensclone.barcode

import android.Manifest
import android.app.AlertDialog
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.camera.core.*
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.net.toUri
import com.rahul.googlelensclone.BaseLensActivity
import com.rahul.googlelensclone.R
import kotlinx.android.synthetic.main.activity_barcode.*
import kotlinx.android.synthetic.main.activity_camera.*
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream

class BarcodeActivity : BaseLensActivity() {

    override val imageAnalyzer = BarcodeAnalyzer()


    override fun startScanner() {
        ScanBarcode()
    }

    private fun ScanBarcode() {
        imageAnalysis.setAnalyzer(ContextCompat.getMainExecutor(this), imageAnalyzer)

    }


}