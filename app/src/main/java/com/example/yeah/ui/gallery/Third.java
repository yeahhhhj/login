package com.example.yeah.ui.gallery;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.yeah.R;
import com.example.yeah.haha;

public class Third extends Fragment implements View.OnClickListener {

    public static Third newInstance() {
        return new Third();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        ImageView extra = (ImageView) getActivity().findViewById(R.id.extra);
        ImageView extra2 = (ImageView) getActivity().findViewById(R.id.extra2);
        ImageView extra3 = (ImageView) getActivity().findViewById(R.id.extra3);
        ImageView extra4 = (ImageView) getActivity().findViewById(R.id.extra4);
        ImageView extra5 = (ImageView) getActivity().findViewById(R.id.extra5);
        ImageView extra6 = (ImageView) getActivity().findViewById(R.id.extra6);
        ImageView extra7 = (ImageView) getActivity().findViewById(R.id.extra7);
        ImageView extra8 = (ImageView) getActivity().findViewById(R.id.extra8);

        extra.setOnClickListener((View.OnClickListener) this);
        extra2.setOnClickListener((View.OnClickListener) this);
        extra3.setOnClickListener((View.OnClickListener) this);
        extra4.setOnClickListener((View.OnClickListener) this);
        extra5.setOnClickListener((View.OnClickListener) this);
        extra6.setOnClickListener((View.OnClickListener) this);
        extra7.setOnClickListener((View.OnClickListener) this);
        extra8.setOnClickListener((View.OnClickListener) this);
        }

    public void onClick(View v) {

        switch (v.getId()){

            case R.id.extra:
                final EditText etEdit = new EditText(getActivity());
                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setTitle("입력");
                dialog.setView(etEdit);

                // OK 버튼 이벤트
                dialog.setPositiveButton ("시작", new DialogInterface.OnClickListener()  {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getActivity(), haha.class);
                        String inputValue = etEdit.getText().toString();
                        intent.putExtra("String",inputValue);
                        intent.putExtra("Name","animal");
                        int hour = 0;
                        int minute = 30;
                        int second = 0;
                        intent.putExtra("hour",hour);
                        intent.putExtra("minute",minute);
                        intent.putExtra("second",second);
                        startActivity(intent);
                    }
                });
                // Cancel 버튼 이벤트
                dialog.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog.show();
                break;

            case R.id.extra2:

                final EditText etEdit2 = new EditText(getActivity());
                AlertDialog.Builder dialog2 = new AlertDialog.Builder(getActivity());
                dialog2.setTitle("입력");
                dialog2.setView(etEdit2);

                // OK 버튼 이벤트
                dialog2.setPositiveButton ("시작", new DialogInterface.OnClickListener()  {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent4 = new Intent(getActivity(), haha.class);
                        String inputValue = etEdit2.getText().toString();
                        intent4.putExtra("String",inputValue);
                        intent4.putExtra("Name","animal2");
                        int hour = 1;
                        int minute = 0;
                        int second = 0;
                        intent4.putExtra("hour",hour);
                        intent4.putExtra("minute",minute);
                        intent4.putExtra("second",second);
                        startActivity(intent4);
                    }
                });
                // Cancel 버튼 이벤트
                dialog2.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog2.show();
                break;

            case R.id.extra3:

                final EditText etEdit3 = new EditText(getActivity());
                AlertDialog.Builder dialog3 = new AlertDialog.Builder(getActivity());
                dialog3.setTitle("입력");
                dialog3.setView(etEdit3);

                // OK 버튼 이벤트
                dialog3.setPositiveButton ("시작", new DialogInterface.OnClickListener()  {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent4 = new Intent(getActivity(), haha.class);
                        String inputValue = etEdit3.getText().toString();
                        intent4.putExtra("String",inputValue);
                        intent4.putExtra("Name","animal3");
                        int hour = 3;
                        int minute = 0;
                        int second = 0;
                        intent4.putExtra("hour",hour);
                        intent4.putExtra("minute",minute);
                        intent4.putExtra("second",second);
                        startActivity(intent4);
                    }
                });
                // Cancel 버튼 이벤트
                dialog3.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog3.show();
                break;
            case R.id.extra4:

                final EditText etEdit4 = new EditText(getActivity());
                AlertDialog.Builder dialog4 = new AlertDialog.Builder(getActivity());
                dialog4.setTitle("입력");
                dialog4.setView(etEdit4);

                // OK 버튼 이벤트
                dialog4.setPositiveButton ("시작", new DialogInterface.OnClickListener()  {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent4 = new Intent(getActivity(), haha.class);
                        String inputValue = etEdit4.getText().toString();
                        intent4.putExtra("String",inputValue);
                        intent4.putExtra("Name","animal4");
                        int hour = 1;
                        int minute = 30;
                        int second = 0;
                        intent4.putExtra("hour",hour);
                        intent4.putExtra("minute",minute);
                        intent4.putExtra("second",second);
                        startActivity(intent4);
                    }
                });
                // Cancel 버튼 이벤트
                dialog4.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog4.show();
                break;
            case R.id.extra5:
                final EditText etEdit5 = new EditText(getActivity());
                AlertDialog.Builder dialog5 = new AlertDialog.Builder(getActivity());
                dialog5.setTitle("입력");
                dialog5.setView(etEdit5);

                // OK 버튼 이벤트
                dialog5.setPositiveButton ("시작", new DialogInterface.OnClickListener()  {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent4 = new Intent(getActivity(), haha.class);
                        String inputValue = etEdit5.getText().toString();
                        intent4.putExtra("String",inputValue);
                        intent4.putExtra("Name","animal5");
                        int hour = 2;
                        int minute = 0;
                        int second = 0;
                        intent4.putExtra("hour",hour);
                        intent4.putExtra("minute",minute);
                        intent4.putExtra("second",second);
                        startActivity(intent4);
                    }
                });
                // Cancel 버튼 이벤트
                dialog5.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog5.show();
                break;
            case R.id.extra6:
                final EditText etEdit6 = new EditText(getActivity());
                AlertDialog.Builder dialog6 = new AlertDialog.Builder(getActivity());
                dialog6.setTitle("입력");
                dialog6.setView(etEdit6);

                // OK 버튼 이벤트
                dialog6.setPositiveButton ("시작", new DialogInterface.OnClickListener()  {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent4 = new Intent(getActivity(), haha.class);
                        String inputValue = etEdit6.getText().toString();
                        intent4.putExtra("String",inputValue);
                        intent4.putExtra("Name","animal6");
                        int hour = 1;
                        int minute = 40;
                        int second = 0;
                        intent4.putExtra("hour",hour);
                        intent4.putExtra("minute",minute);
                        intent4.putExtra("second",second);
                        startActivity(intent4);
                    }
                });
                // Cancel 버튼 이벤트
                dialog6.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog6.show();
                break;
            case R.id.extra7:
                final EditText etEdit7 = new EditText(getActivity());
                AlertDialog.Builder dialog7 = new AlertDialog.Builder(getActivity());
                dialog7.setTitle("입력");
                dialog7.setView(etEdit7);

                // OK 버튼 이벤트
                dialog7.setPositiveButton ("시작", new DialogInterface.OnClickListener()  {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent4 = new Intent(getActivity(), haha.class);
                        String inputValue = etEdit7.getText().toString();
                        intent4.putExtra("String",inputValue);
                        intent4.putExtra("Name","animal7");
                        int hour = 0;
                        int minute = 20;
                        int second = 0;
                        intent4.putExtra("hour",hour);
                        intent4.putExtra("minute",minute);
                        intent4.putExtra("second",second);
                        startActivity(intent4);
                    }
                });
                // Cancel 버튼 이벤트
                dialog7.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog7.show();
                break;
            case R.id.extra8:
                final EditText etEdit8 = new EditText(getActivity());
                AlertDialog.Builder dialog8 = new AlertDialog.Builder(getActivity());
                dialog8.setTitle("입력");
                dialog8.setView(etEdit8);

                // OK 버튼 이벤트
                dialog8.setPositiveButton ("시작", new DialogInterface.OnClickListener()  {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent4 = new Intent(getActivity(), haha.class);
                        String inputValue = etEdit8.getText().toString();
                        intent4.putExtra("String",inputValue);
                        intent4.putExtra("Name","animal8");
                        int hour = 1;
                        int minute = 10;
                        int second = 0;
                        intent4.putExtra("hour",hour);
                        intent4.putExtra("minute",minute);
                        intent4.putExtra("second",second);
                        startActivity(intent4);
                    }
                });
                // Cancel 버튼 이벤트
                dialog8.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog8.show();
                break;

            case R.id.tab_first:
                Fragment fragment = new GalleryFragment();
                break;
            //임시
            case R.id.tab_second:
                Fragment fragment2 = new Second();
                break;

            case R.id.tab_third:
                Fragment fragment3 = new Third();
                break;

        }
    }

}