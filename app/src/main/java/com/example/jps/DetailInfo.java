package com.example.jps;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jps.BasicJob.JobData;

public class DetailInfo extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_info);

        // 이전 액티비티로부터 데이터 가져오기
        JobData jobdata = (JobData) getIntent().getSerializableExtra("jobData");

        // 기업 이름
        TextView nameTextView = findViewById(R.id.text_name);
        nameTextView.setText(jobdata.getData()[1]);

        // 직종, 계약구분, 임금형태+임금, 입사형태
        TextView TextView_1 = findViewById(R.id.textView_1);
        TextView_1.setText("직종 : " + jobdata.getData()[2]
        + "\n" + "계약 구분 : " + jobdata.getData()[3]
        + "\n" + "임금 : " + jobdata.getData()[4] + " " + jobdata.getData()[5]
        + "\n" + "입사 형태 : " + jobdata.getData()[6]);

        /*
        구인신청일자,사업장명,모집직종,고용형태,임금형태,임금,입사형태,
        요구경력,요구학력,전공계열,요구자격증,사업장 주소,기업형태,담당기관,
        등록일,연락처,인증구분,등급,인증발급일,인증만료일,시작일자,종료일자,시군구명
         */

        // 주소
        TextView TextView_addr = findViewById(R.id.textView_addr);
        TextView_addr.setText("주소 : " + jobdata.getData()[11]);

        TextView TextView_type = findViewById(R.id.textView_type);
        TextView_type.setText("기업 형태 : " + jobdata.getData()[12]);

        TextView TextView_phone = findViewById(R.id.textView_phone);
        TextView_phone.setText("연락처 : " + jobdata.getData()[15]);

        TextView TextView_carrer = findViewById(R.id.textView_carrer);
        TextView_carrer.setText("요구 경력 : " + jobdata.getData()[7]);

        TextView TextView_edu = findViewById(R.id.textView_edu);
        TextView_edu.setText("요구 학력 : " + jobdata.getData()[8]);

        TextView TextView_major = findViewById(R.id.textView_major);
        TextView_major.setText("요구 전공 : " + jobdata.getData()[9]);

        TextView TextView_lisence = findViewById(R.id.textView_lisence);
        TextView_lisence.setText("요구 자격증 : " + jobdata.getData()[10]);

        TextView TextView_dam = findViewById(R.id.textView_damdang);
        TextView_dam.setText("담당 기관 : " + jobdata.getData()[13]);

        TextView TextView_in = findViewById(R.id.textView_in);
        TextView_in.setText("인증 구분 : " + jobdata.getData()[16]);

        TextView TextView_rate = findViewById(R.id.textView_rate);
        TextView_rate.setText("등급 : " + jobdata.getData()[17]);

        TextView TextView_startend = findViewById(R.id.textView_startend);
        TextView_startend.setText("시작-종료 일자 : " + jobdata.getData()[20] + " ~ " + jobdata.getData()[21]);
    }
}
