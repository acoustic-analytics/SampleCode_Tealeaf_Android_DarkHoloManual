/*******************************************************************************
 * Licensed Materials - Property of IBM
 * (C) Copyright IBM Corp. 2018
 * US Government Users Restricted Rights - Use, duplication or disclosure
 * restricted by GSA ADP Schedule Contract with IBM Corp.
 ******************************************************************************/
package com.tl.uic.appDarkHolo;

import com.tl.uic.Tealeaf;
import com.tl.uic.appDarkHolo.util.TLHelper;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author ohernandezltmac
 *
 */
public class ControlsActivity2 extends AppCompatActivity {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.controls2);

	    RadioButton rb = (RadioButton) findViewById(R.id.radioButton1);
	    rb.setOnClickListener(TLHelper.getOnClickListener());
	    
	    Spinner s = (Spinner) findViewById(R.id.spinner1);
	    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    s.setAdapter(adapter);
	    s.setSelection(0, false);
	    s.setOnItemSelectedListener(TLHelper.onItemSelected());
	    
	    
	    ProgressBar pb1 = (ProgressBar) findViewById(R.id.progressBar1);
	    pb1.setOnClickListener(TLHelper.getOnClickListener());
	    
	    ProgressBar pb2 = (ProgressBar) findViewById(R.id.progressBar2);
	    pb2.setOnClickListener(TLHelper.getOnClickListener());
	    
	    ProgressBar pb3 = (ProgressBar) findViewById(R.id.progressBar3);
	    pb3.setOnClickListener(TLHelper.getOnClickListener());
	    
	    ProgressBar pb4 = (ProgressBar) findViewById(R.id.progressBar4);
	    pb4.setMax(100);
	    pb4.setProgress(45);
	    pb4.setOnClickListener(TLHelper.getOnClickListener());
	    
	    SeekBar sb = (SeekBar) findViewById(R.id.seekBar1);
	    sb.setOnSeekBarChangeListener(TLHelper.getOnSeekBarChangeListener());
	    
	    RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
	    rg.setOnCheckedChangeListener(TLHelper.getOnCheckedChangeListener());
	    
	    RatingBar rab = (RatingBar) findViewById(R.id.ratingBar1);
	    rab.setOnRatingBarChangeListener(TLHelper.getOnRatingBarChangeListener());
	}

	/* Add touch event to collect gestures for Tealeaf.
	 *
	 * (non-Javadoc)
	 * @see android.app.Activity#dispatchTouchEvent(android.view.MotionEvent)
	 */
	public boolean dispatchTouchEvent(MotionEvent e)
	{
		Tealeaf.dispatchTouchEvent(this, e);
		return super.dispatchTouchEvent(e);
	}
}
