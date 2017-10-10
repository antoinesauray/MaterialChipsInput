package com.pchmn.sample.materialchipsinput;

import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.pchmn.materialchips.SingleChipView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChipExamplesActivity extends AppCompatActivity {

    private static final String TAG = ChipExamplesActivity.class.toString();
    @BindView(R.id.layout) LinearLayout mLayout;
    @BindView(R.id.chip1)
    SingleChipView mChip1;
    @BindView(R.id.chip2)
    SingleChipView mChip2;
    @BindView(R.id.chip3)
    SingleChipView mChip3;
    @BindView(R.id.chip4)
    SingleChipView mChip4;
    @BindView(R.id.chip5)
    SingleChipView mChip5;
    @BindView(R.id.chip6)
    SingleChipView mChip6;
    @BindView(R.id.chip7)
    SingleChipView mChip7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip_examples);
        // butter knife
        ButterKnife.bind(this);

        // chip 1
        mChip1.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip1.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip1.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip1.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 2
        mChip2.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip2.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 3
        mChip3.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip3.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip3.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip3.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 4
        mChip4.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip4.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip4.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip4.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 5
        mChip5.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip5.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 6
        mChip6.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip6.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip6.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip6.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 7
        mChip7.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip7.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip7.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip7.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });


        // programmatically
        Uri uri = null;
        SingleChipView chipView1 = new SingleChipView(this);
        chipView1.setLabel("Pritesh");
        chipView1.setPadding(2,2,2,2);
        chipView1.setHasAvatarIcon(true);

        SingleChipView chipView2 = new SingleChipView(this);
        chipView2.setLabel("Test 1");
        chipView2.setChipBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));
        chipView2.setLabelColor(ContextCompat.getColor(this, R.color.colorPrimary));
        chipView2.setAvatarIcon(uri);
        chipView2.setDeleteIconColor(ContextCompat.getColor(this, R.color.colorPrimary));

        mLayout.addView(chipView1);
        mLayout.addView(chipView2);
    }
}
