package ve.org.jure.tipcalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TipDetailActivity extends AppCompatActivity {

    @BindView(R.id.txtBillTotal) TextView txtBillTotal;
    @BindView(R.id.txtTip) TextView txtTip;
    @BindView(R.id.txtTimeStamp) TextView txtTimeStamp;

    public final static String TIP_KEY = "tip";
    public final static String DATE_KEY = "timestamp";
    public final static String BILL_TOTAL_KEY = "total";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_detail);
        ButterKnife.bind(this);

        Intent intent = getIntent();

        String strTotal = String.format(getString(R.string.tipdetail_messsge_bill), intent.getDoubleExtra(BILL_TOTAL_KEY, 0d));
        String strtip = String.format(getString(R.string.global_messsge_tip), intent.getDoubleExtra(TIP_KEY, 0d));

        txtBillTotal.setText(strTotal);
        txtTip.setText(strtip);
        txtTimeStamp.setText(intent.getStringExtra(DATE_KEY));

    }
}
