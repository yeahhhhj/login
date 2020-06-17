package com.example.yeah;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.NumberFormat;
import androidx.appcompat.app.AppCompatActivity;

public class haha extends AppCompatActivity {
    TextView textView2;
    private boolean state;
    ImageButton start;
    ImageView no;

    int h=0;
    int m=0;
    int s=0;
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haha);

        Intent intent = getIntent(); //이전 액티비티에서 수신할 데이터를 받기위해 선언
        String Receive = intent.getExtras().getString("String");       //호출한 액티비티에서 String 이라는 키 값을 가진 데이터 로드
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(Receive);

        ImageView image = (ImageView)findViewById(R.id.imageView2);

        String Name = intent.getExtras().getString("Name");
        switch (Name) {
            case "animal":
                image.setImageResource(R.drawable.elephant);
                break;
        }

        h = intent.getExtras().getInt("hour");
        m = intent.getExtras().getInt("minute");
        s = intent.getExtras().getInt("second");

        NumberFormat numfotmat= NumberFormat.getIntegerInstance();
        numfotmat.setMinimumIntegerDigits(2);

        start = findViewById(R.id.timerstart);
        no = findViewById(R.id.no);
        no.setVisibility(View.INVISIBLE); // 화면에보임

        textView2 = findViewById(R.id.time_number);
        String time = numfotmat.format(h)+":"+numfotmat.format(m)+":"+numfotmat.format(s);
        textView2.setText(time);
    }

    //홈키제어
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        state=false;
//여기서 감지
        Log.d(TAG, "Home Button Touch");

        AlertDialog.Builder alert_confirm = new AlertDialog.Builder(haha.this);
        alert_confirm.setMessage("아이템 획득을 실패하셨습니다.\n확인을 눌러주세요.").setCancelable(false).setPositiveButton("확인",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) { // 'YES'
                        Intent intent = new Intent(getApplicationContext(), failed.class);
                        startActivity(intent);
                    }
                });
        AlertDialog alert = alert_confirm.create();
        alert.show();
    }

    public void onBackPressed() {
//뒤로가기 금지
    }

    protected void onPause() {//메뉴버튼 금지//상태바도
        super.onPause();
        ActivityManager activityManager = (ActivityManager) getApplicationContext().getSystemService(ACTIVITY_SERVICE);
        activityManager.moveTaskToFront(getTaskId(), 0);
    }

    //시작
    public void timer_start(View view) {
        new timer();
        state=true;
        start.setEnabled(false);
        no.setVisibility(View.VISIBLE); // 화면에 d안보임
    }

    //포기
    public void timer_giveup(View view) {
        state=false;
        AlertDialog.Builder alert_confirm = new AlertDialog.Builder(haha.this);
        alert_confirm.setMessage("지금 포기하시면 아이템 획득에 실패합니다.\n그래도 포기하시겠습니까?").setCancelable(false).setPositiveButton("확인",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent7 = new Intent(getApplicationContext(), failed.class);
                        startActivity(intent7);
//                        Toast.makeText(getApplicationContext(),"실패했습니다 실패!",Toast.LENGTH_LONG).show();//임시
                    }
                }).setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // 'No'
                new timer();
                state=true;
            }
        });
        AlertDialog alert = alert_confirm.create();
        alert.show();
    }


    //타이머
    class timer implements Runnable {
        Thread t1;
        public timer() {
            t1 = new Thread(this);
            t1.start();
        }
        @Override
        public void run() {
            // TODO Auto-generated method stub
            while(state) {
                try {
                    String time=iftime();
                    Thread.sleep(1000);
                    textView2.setText(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        private String iftime() {
            NumberFormat numfotmat= NumberFormat.getIntegerInstance();
            numfotmat.setMinimumIntegerDigits(2);

            // TODO Auto-generated method stub
            if(s==0&&m==0) {
                if(h>=1) {
                    h--;
                    s=59;
                    m=59;
                }
                else {
                    state=false;

                    Intent intent6 = new Intent(getApplicationContext(), win.class);
                    startActivity(intent6);
                }
            }
            else if(s>0&&m==0) {
                s--;
            }
            else if(s==0&&m>0) {
                m--;
                s=59;
            }
            else if(s>0&&m>0)
                s--;

            String time =numfotmat.format(h)+":"+numfotmat.format(m)+":"+numfotmat.format(s);
            return time;
        }
    }


}
