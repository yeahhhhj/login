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

public class GalleryFragment extends Fragment implements View.OnClickListener {
   // FragmentManager fragmentManager = getFragmentManager();
   // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    public static GalleryFragment newInstance() {
        return new GalleryFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_gallery, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        ImageView animal = (ImageView) getActivity().findViewById(R.id.animal);
        ImageView animal2 = (ImageView) getActivity().findViewById(R.id.animal2);
        ImageView animal3 = (ImageView) getActivity().findViewById(R.id.animal3);
        ImageView animal4 = (ImageView) getActivity().findViewById(R.id.animal4);
        ImageView animal5 = (ImageView) getActivity().findViewById(R.id.animal5);
        ImageView animal6 = (ImageView) getActivity().findViewById(R.id.animal6);
        ImageView animal7 = (ImageView) getActivity().findViewById(R.id.animal7);
        ImageView animal8 = (ImageView) getActivity().findViewById(R.id.animal8);
        ImageView animal9 = (ImageView) getActivity().findViewById(R.id.animal9);

        animal.setOnClickListener((View.OnClickListener) this);
        animal2.setOnClickListener((View.OnClickListener) this);
        animal3.setOnClickListener((View.OnClickListener) this);
        animal4.setOnClickListener((View.OnClickListener) this);
        animal5.setOnClickListener((View.OnClickListener) this);
        animal6.setOnClickListener((View.OnClickListener) this);
        animal7.setOnClickListener((View.OnClickListener) this);
        animal8.setOnClickListener((View.OnClickListener) this);
        animal9.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v) {

        switch (v.getId()){

            case R.id.animal:
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
                        int minute = 0;
                        int second = 3;
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

            case R.id.animal2:

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
                        int hour = 0;
                        int minute = 45;
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

            case R.id.animal3:

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
                dialog3.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog3.show();
                break;
            case R.id.animal4:

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
                        int minute = 50;
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
            case R.id.animal5:
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
                        int minute = 45;
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
            case R.id.animal6:
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
                        int minute = 0;
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
            case R.id.animal7:
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
                        int minute = 55;
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
            case R.id.animal8:
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
            case R.id.animal9:

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
                dialog9.setNegativeButton("취소",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog9.show();
                break;

            case R.id.tab_first:
               출처: https://mc10sw.tistory.com/16 [Make it possible]
                //GalleryFragment fragment = new GalleryFragment();
                //fragmentTransaction.replace(R.id.nav_host_fragment, fragment);
                //fragmentTransaction.commit();
              break;
            //임시
            case R.id.tab_second:
                  newInstance();
                 break;

            case R.id.tab_third:
                //Third fragment3 = new Third();
                //fragmentTransaction.replace(R.id.nav_host_fragment, fragment3);
                //fragmentTransaction.commit();
                break;

        }
    }



}