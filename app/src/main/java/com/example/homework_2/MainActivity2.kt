package com.example.homework_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private var a=0
    private var b=0
    private var c=""
    private var r=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        num0.setOnClickListener(this)
        num1.setOnClickListener(this)
        num2.setOnClickListener(this)
        num3.setOnClickListener(this)
        num4.setOnClickListener(this)
        num5.setOnClickListener(this)
        num6.setOnClickListener(this)
        num7.setOnClickListener(this)
        num8.setOnClickListener(this)
        num9.setOnClickListener(this)
        add.setOnClickListener(this)
        sub.setOnClickListener(this)
        mul.setOnClickListener(this)
        div.setOnClickListener(this)
        AC.setOnClickListener(this)
        equal.setOnClickListener(this)

    }
    override fun onClick(v: View?){
        when(v?.id){
            R.id.num0,R.id.num1,R.id.num2,
            R.id.num3,R.id.num4,R.id.num5,
            R.id.num6,R.id.num7,R.id.num8,
            R.id.num9->{
                var num=findViewById<Button>(v?.id)

                if (result.text=="0"||c==result.text||r==1){
                    result.text=num.text.toString()
                    r=0
                }
                else if(result.text!="error"){
                    result.text=result.text.toString()+num.text.toString()
                }
            }
            R.id.add,R.id.sub,R.id.mul,R.id.div->{
                if(result.text!="error"){
                    if(c==""){
                        c= findViewById<Button>(v?.id).text.toString()
                        a=result.text.toString().toInt()
                        r=0
                    }
                    else{

                        c= findViewById<Button>(v?.id).text.toString()
                    }

                    result.text=c
                }

            }
            R.id.equal->{
                if(result.text!="error"){
                    b=result.text.toString().toInt()
                    when(c){
                        "+"->{
                            result.text=(a+b).toString()
                        }
                        "-"->{
                            result.text=(a-b).toString()
                        }
                        "*"->{
                            result.text=(a*b).toString()
                        }
                        "/"->{
                            if(b!=0){
                                result.text=(a.toDouble()/b.toDouble()).toString()
                            }
                            else{
                                result.text="error"
                            }

                        }

                    }
                    a=0
                    b=0
                    c=""
                    r=1
                }

            }
            R.id.AC->{
                a=0
                b=0
                c=""
                result.text="0"
            }

        }

    }

}

