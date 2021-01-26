package com.rahul.googlelensclone.textrecog

import androidx.core.content.ContextCompat
import com.rahul.googlelensclone.BaseLensActivity

class TextRecognitionActivity : BaseLensActivity() {
    override val imageAnalyzer = TextAnalyzer()

    override fun startScanner() {
        startTextRecognition()
    }

    private fun startTextRecognition() {
        imageAnalysis.setAnalyzer(
                ContextCompat.getMainExecutor(this),
                imageAnalyzer
        )
    }

}