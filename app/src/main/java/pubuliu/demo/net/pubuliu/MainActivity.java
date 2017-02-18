package pubuliu.demo.net.pubuliu;

import java.util.zip.Inflater;

import com.liangfeizc.flowlayout.FlowLayout;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import pubuliu.demo.net.pubuliu.R;

public class MainActivity extends Activity implements OnClickListener{
    String[]s={
            "孙磊","我的名字叫做孙蕾","我来自和别承德，哈哈","demodemoemdeodemodmeo",
            "一脚行哇啊哇哇","艺术培训机构怎么选择？试试",
            "舞蹈","跳舞","河北省承德市围场先","到脖子想顺下村5组","别境岛石家庄的车票是128元"
    };
    FlowLayout f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f=(FlowLayout) findViewById(R.id.flow_layout);
        for(int i=0;i<s.length;i++){
            View v=MainActivity.this.getLayoutInflater().inflate(R.layout.item,null);

            TextView btn = (TextView) v.findViewById(R.id.tv);
            btn.setTag(i);
            btn.setOnClickListener(this);
            btn.setHeight(dp2px(32));
            btn.setTextSize(16);
            //btn.setTextColor(getResources().getColorStateList(R.color.checkable_text_color));
            btn.setBackgroundResource(R.drawable.checkable_default_border);

            btn.setText(s[i]);

            f.addView(v);
        }
    }
    public int dp2px(int dpValue) {
        return (int) (dpValue * getResources().getDisplayMetrics().density);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch(v.getId()){
            case R.id.tv:
                if(null!=v.getTag()){
                    Integer position=(Integer) v.getTag();
                    Toast.makeText(MainActivity.this,position+"",1000).show();
                }
                break;
        }
    }

}
