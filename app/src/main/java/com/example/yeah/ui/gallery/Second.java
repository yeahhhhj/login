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

public class Second extends Fragment implements View.OnClickListener {

    public static Second newInstance() {
        return new Second();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {


        super.onActivityCreated(savedInstanceState);
        ImageView plant = (ImageView) getActivity().findViewById(R.id.plant);
        ImageView plant2 = (ImageView) getActivity().findViewById(R.id.plant2);
        ImageView plant3 = (ImageView) getActivity().findViewById(R.id.plant3);
        ImageView plant4 = (ImageView) getActivity().findViewById(R.id.plant4);
        ImageView plant5 = (ImageView) getActivity().findViewById(R.id.plant5);
        ImageView plant6 = (ImageView) getActivity().findViewById(R.id.plant6);
        ImageView plant7 = (ImageView) getActivity().findViewById(R.id.plant7);
        ImageView plant8 = (ImageView) getActivity().findViewById(R.id.plant8);
        ImageView plant9 = (ImageView) getActivity().findViewById(R.id.plant9);

        plant.setOnClickListener((View.OnClickListener) this);
        plant2.setOnClickListener((View.OnClickListener) this);
        plant3.setOnClickListener((View.OnClickListener) this);
        plant4.setOnClickListener((View.OnClickListener) this);
        plant5.setOnClickListener((View.OnClickListener) this);
        plant6.setOnClickListener((View.OnClickListener) this);
        plant7.setOnClickListener((View.OnClickListener) this);
        plant8.setOnClickListener((View.OnClickListener) this);
        plant9.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v) {

        switch (v.getId()){

            case R.id.plant:
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

            case R.id.plant2:

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

            case R.id.plant3:

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
                dialog3.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog3.show();
                break;
            case R.id.plant4:

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
                        int hour = 0;
                        int minute = 40;
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
            case R.id.plant5:
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
                        int hour = 0;
                        int minute = 30;
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
            case R.id.plant6:
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
                        int minute = 10;
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
            case R.id.plant7:
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
                        int minute = 35;
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
            case R.id.plant8:
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
                        int minute = 0;
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
            case R.id.plant9:

                final EditText etEdit9 = new EditText(getActivity());
                AlertDialog.Builder dialog9 = new AlertDialog.Builder(getActivity());
                dialog9.setTitle("입력");
                dialog9.setView(etEdit9);

                // OK 버튼 이벤트
                dialog9.setPositiveButton ("시작", new DialogInterface.OnClickListener()  {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent4 = new Intent(getActivity(), haha.class);
                        String inputValue = etEdit9.getText().toString();
                        intent4.putExtra("String",inputValue);
                        intent4.putExtra("Name","animal8");
                        int hour = 1;
                        int minute = 20;
                        int second = 0;
                        intent4.putExtra("hour",hour);
                        intent4.putExtra("minute",minute);
                        intent4.putExtra("second",second);
                        startActivity(intent4);
                    }
                });
                // Cancel 버튼 이벤트
                dialog9.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog9.show();
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