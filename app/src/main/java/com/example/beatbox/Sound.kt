package com.example.beatbox


private const val WAV = ".wav"

class Sound (val assetPath:String) {

    //파일의 이름을 얻음
    val name = assetPath.split("/").last().removeSuffix(WAV)


}