package com.rahul.googlelensclone

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.rahul.googlelensclone.barcode.BarcodeActivity
import com.rahul.googlelensclone.barcode.BarcodeAnalyzer
import com.rahul.googlelensclone.facedetect.FaceDetectActivity
import com.rahul.googlelensclone.imagelabeler.ImageLabelingActivity
import com.rahul.googlelensclone.textrecog.TextRecognitionActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        @JvmStatic val Photo_Req_code= 234
        @JvmStatic val Extra_Data = "data"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        takephotoBtn.setOnClickListener {
            val takephotoIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takephotoIntent, Photo_Req_code)
        }

        btnCameraActivity.setOnClickListener {
            startActivity(Intent(this,CameraActivity::class.java))
        }
        btnBarcodeActivity.setOnClickListener {
            startActivity(Intent(this,BarcodeActivity::class.java)) }

        btnFaceDetectActivity.setOnClickListener {
            startActivity(Intent(this,FaceDetectActivity::class.java))
        }
        btnLabelerActivity.setOnClickListener {
            startActivity(Intent(this,ImageLabelingActivity::class.java))
        }
        btnTextRecogActivity.setOnClickListener {
            startActivity(Intent(this,TextRecognitionActivity::class.java))
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Photo_Req_code){
            val bitmap = data?.extras?.get(Extra_Data) as Bitmap
            imagethumb.setImageBitmap(bitmap)
            return
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}