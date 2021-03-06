package kr.co.neoplus.intent_20210221

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    닉네임변경 - 1001 이라는 것을 아예 변수로 넣어두고 사용하자
    val REQ_FOR_NICKNAME = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToFirstActivityBtn.setOnClickListener {

//            FirstActivity 로 넘어가기
            val myIntent = Intent(this, FirstActivity::class.java)
            startActivity(myIntent)
        }

        sendContentBtn.setOnClickListener {

//            입력한 문구를 String 으로 추출 (저장)
            val inputContent = contentEdt.text.toString()

//            두번째 화면 (SecondActivity) 으로 => inputContent 의 값을 들고 => 이동
            val myIntent = Intent(this, SecondActivity::class.java)

//            인텐트의 부가정보로, 들고갈 데이터들을 붙여주자
            myIntent.putExtra("message", inputContent)

//            필요시 여러개 데이터를 첨부 가능 (단순 예시)
            myIntent.putExtra("출생년도",1988)

            startActivity(myIntent)

        }

        changeNicknameBtn.setOnClickListener {

//            새 닉네임을 얻기 위해 => 액티비티 이동
            val myIntent = Intent(this,EditNicknameActivity::class.java)

//            어떤 데이터를 받으러 가는건지를 숫자로 구별해야함 예) 닉네임변경 - 1001
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)

        }
    }
}