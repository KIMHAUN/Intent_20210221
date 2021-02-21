package kr.co.neoplus.intent_20210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        목적지에 도착한 상황 => 첨부한 데이터를 받아주자 (어떤 형태에 자료인가?)
        
//        String  등 참조형 변수는 기본값 지정 안 함
//        첨부가 안 됐을 때 null 로 자동 저장
        val receivedMessage = intent.getStringExtra("message")

//        수신문구 표현 텍스트뷰의 문구로 설정 => 상황마다 코드가 달라짐
        receivedMessageTxt.text = receivedMessage

//        첨부된 출생년도 받는 예시 => Int, Double, Boolean 등 기본형(에 가까운) 변수들은,
//        첨부가 안 됐을 때 뭘로 꺼낼지 기본값 지정 필요
        val myBirthYear = intent.getIntExtra("출생년도", 0)


    }
}