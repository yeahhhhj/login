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
        }
    }
}