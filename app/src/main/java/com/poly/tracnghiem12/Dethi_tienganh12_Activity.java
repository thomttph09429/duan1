package com.poly.tracnghiem12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.poly.tracnghiem12.Model.Category;

public class Dethi_tienganh12_Activity extends AppCompatActivity implements View.OnClickListener {
    Button btn_hientaidon, btn_hientaitiepdien, btn_hientaihoanthanh,
            btn_hientaihoanthanhtiepdien, btn_quakhudon, btn_quakhutiepdien,
            btn_tuonglaitiepdien, btn_tuonglaihoanthanh, btn_tuonglaihoanthanhtiepdien, btn_quakhuhoanthanh,
            btn_quakhuhoanthanhtiepdien, btn_tuonglaidon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienganh12_);
        setTitle("Các thì trong tiếng anh");
        btn_hientaidon = findViewById(R.id.btn_hientaidon);
        btn_hientaihoanthanh = findViewById(R.id.btn_hientaihoanthanh);
        btn_hientaihoanthanhtiepdien = findViewById(R.id.btn_hientaihoanthanhtiepdien);
        btn_hientaitiepdien = findViewById(R.id.btn_hientaitiepdien);
        btn_quakhudon = findViewById(R.id.btn_quakhudon);
        btn_quakhutiepdien = findViewById(R.id.btn_quakhutiepdien);
        btn_tuonglaihoanthanh = findViewById(R.id.btn_tuonglaihoanthanh);
        btn_tuonglaihoanthanhtiepdien = findViewById(R.id.btn_tuonglaihoanthanhtiepdien);
        btn_tuonglaitiepdien = findViewById(R.id.btn_tuonglaitiepdien);
        btn_tuonglaidon = findViewById(R.id.btn_tuonglaidon);
        btn_quakhuhoanthanhtiepdien = findViewById(R.id.btn_quakhuhoanthanhtiepdien);
        btn_quakhuhoanthanh = findViewById(R.id.btn_quakhuhoanthanh);


        btn_hientaidon.setOnClickListener(this);
        btn_hientaihoanthanh.setOnClickListener(this);
        btn_hientaitiepdien.setOnClickListener(this);
        btn_hientaihoanthanhtiepdien.setOnClickListener(this);
        btn_quakhutiepdien.setOnClickListener(this);
        btn_quakhudon.setOnClickListener(this);
        btn_tuonglaitiepdien.setOnClickListener(this);
        btn_tuonglaihoanthanhtiepdien.setOnClickListener(this);
        btn_tuonglaihoanthanh.setOnClickListener(this);
        btn_quakhuhoanthanh.setOnClickListener(this);
        btn_quakhuhoanthanhtiepdien.setOnClickListener(this);
        btn_tuonglaidon.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_hientaidon:
                Intent intent1 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent1.putExtra("1", "Thì hiện tại đơn");
                intent1.putExtra("category", Category.CATEGORY_DETHISO1);
                startActivity(intent1);
                break;
            case R.id.btn_hientaitiepdien:
                Intent intent2 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent2.putExtra("1", "Thì hiện tiếp diễn");
                intent2.putExtra("category", Category.CATEGORY_DETHISO2);
                startActivity(intent2);
                break;
            case R.id.btn_hientaihoanthanh:
                Intent intent3 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent3.putExtra("1", "Thì hiện tại hoàn thành");
                intent3.putExtra("category", Category.CATEGORY_DETHISO3);
                startActivity(intent3);
                break;
            case R.id.btn_hientaihoanthanhtiepdien:
                Intent intent4 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent4.putExtra("1", "Thì hiện tại hoàn thành tiếp diễn");
                intent4.putExtra("category", Category.CATEGORY_DETHISO4);
                startActivity(intent4);
                break;
            case R.id.btn_quakhudon:
                Intent intent5 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent5.putExtra("1", "Qúa khứ đơn");
                intent5.putExtra("category", Category.CATEGORY_DETHISO5);
                startActivity(intent5);
                break;
            case R.id.btn_quakhutiepdien:
                Intent intent6 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent6.putExtra("1", "Thì quá khứ tiếp diễn");
                intent6.putExtra("category", Category.CATEGORY_DETHISO6);
                startActivity(intent6);
                break;
            case R.id.btn_quakhuhoanthanh:
                Intent intent7 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent7.putExtra("1", "Thì quá khứ hoàn thành");
                intent7.putExtra("category", Category.CATEGORY_DETHISO7);
                startActivity(intent7);
                break;
            case R.id.btn_quakhuhoanthanhtiepdien:
                Intent intent8 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent8.putExtra("1", "Thì quá khứ hoàn thành tiếp diễn");
                intent8.putExtra("category", Category.CATEGORY_DETHISO8);
                startActivity(intent8);
                break;
            case R.id.btn_tuonglaidon:
                Intent intent9 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent9.putExtra("1", "Thì tương lai đơn");
                intent9.putExtra("category", Category.CATEGORY_DETHISO9);
                startActivity(intent9);
                break;
            case R.id.btn_tuonglaitiepdien:
                Intent intent10 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent10.putExtra("1", "Thì tương lai tiếp diễn");
                intent10.putExtra("category", Category.CATEGORY_DETHISO10);
                startActivity(intent10);
                break;
            case R.id.btn_tuonglaihoanthanh:
                Intent intent11 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent11.putExtra("1", "Thì tương lai hoàn thành");
                intent11.putExtra("category", Category.CATEGORY_DETHISO11);
                startActivity(intent11);
                break;
            case R.id.btn_tuonglaihoanthanhtiepdien:
                Intent intent12 = new Intent(Dethi_tienganh12_Activity.this, Quiz_tienganh12_Activity.class);
                intent12.putExtra("1", "Thì tương lai hoàn thành tiếp diễn");
                intent12.putExtra("category", Category.CATEGORY_DETHISO12);
                startActivity(intent12);
                break;

        }


    }
}