package com.example.homework_2

import android.content.Context
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main3.*
import java.lang.Math.abs


class MainActivity3 : AppCompatActivity() {
    lateinit var movieList: List<MovieData>
    lateinit var posterTable:MutableMap<String, Int>
    var h=0
    var w=0
    var downX=0.0F
    var movieIndex=0


    private fun ini(){
        posterTable = mutableMapOf()

        posterTable[movieList[0].title]=R.drawable.pci1aryw7oj2eyto2nmyekhhicp
        posterTable[movieList[1].title]=R.drawable.oyg9tl7fcrp4ez9vid6ukzwdndz
        posterTable[movieList[2].title]=R.drawable.riaoojrfvvhotyaogoi0wr7okse
        posterTable[movieList[3].title]=R.drawable.zgvbrulkupqpbwginedkjpyqum4
        posterTable[movieList[4].title]=R.drawable.t7xhp8sqtvanzecvn1oqrvwcxti
        posterTable[movieList[5].title]=R.drawable.q719jxxezooyaps6babgknononx
        posterTable[movieList[6].title]=R.drawable.hek3koduyrqk7fihpxsa6mt2zc3
        posterTable[movieList[7].title]=R.drawable.h1b7tw0t399vdjacwjh8m87469b
        posterTable[movieList[8].title]=R.drawable.velwphvmqeqkcxggneu8ymio52r
        posterTable[movieList[9].title]=R.drawable.plnlrtbuult0rh3xsjmpubiso3l


    }

    private fun loadMovieInfo() {


    poster.setImageResource(posterTable[movieList[movieIndex].title]!!)

    movieTitle.text = movieList[movieIndex].title
        movieID.text = movieList[movieIndex].id.toString()
        movieRate.text = movieList[movieIndex].vote_average.toString()
        movieOverview.text = movieList[movieIndex].overview
//        imageHeight = imageView.drawable.intrinsicHeight
//        imageWidth = imageView.drawable.intrinsicWidth
//        changeImageViewSize(imageHeight, imageWidth)
    }






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)











        this.movieList = Gson().fromJson(movies, Array<MovieData>::class.java).asList()
        ini()
        loadMovieInfo()
        var originHeight=poster.layoutParams.height
        var originWidth=poster.layoutParams.width
        h=originHeight
        w=originWidth




        imageSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {


//                test.text=progress.toString()
                poster.layoutParams.width=originWidth*progress/50
                poster.layoutParams.height=originHeight*progress/50
                poster.requestLayout()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })


        poster.setOnLongClickListener{
            this.imageSeekBar.progress=50
            poster.layoutParams.width=w
            poster.layoutParams.height=h
            true
        }
        poster.setOnClickListener{

            Toast.makeText(applicationContext,"Poster Clicked",Toast.LENGTH_SHORT).show()
            Snackbar.make(findViewById<View>(R.id.layout3),"Poster Clicked",Snackbar.LENGTH_SHORT).show()

            true
        }
        poster.setOnTouchListener { v, event ->
            when(event?.action){
                MotionEvent.ACTION_DOWN -> {
                    downX=event.x
                }
                MotionEvent.ACTION_UP -> {
                    val deltaX=downX-event.x
                    if(abs(deltaX)>10F){
                        if(deltaX>0){
                            movieIndex++
                            if(movieIndex>=movieList.size){
                                movieIndex=movieList.size-1
                            }
                            else{
                                loadMovieInfo()
                            }

                        }
                        else{
                            movieIndex--
                            if(movieIndex<0){
                                movieIndex=0
                            }
                            else{
                                loadMovieInfo()
                            }
                        }
                    }

                }
            }
            v?.onTouchEvent(event)?:true
        }

    }






}






