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
import android.widget.AnalogClock;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.DigitalClock;
import android.widget.TimePicker;
import android.widget.TwoLineListItem;
import android.widget.ZoomButton;
import android.widget.ZoomControls;

import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("deprecation")
public class ControlsActivity4 extends AppCompatActivity {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.controls4);

	    TimePicker tp = (TimePicker) findViewById(R.id.timePicker1);
	    tp.setOnClickListener(TLHelper.getOnClickListener());
	    
	    DatePicker dp = (DatePicker) findViewById(R.id.datePicker1);
	    //Date now = new Date();
	    //dp.init(now.getYear(), now.getMonth(), now.getDay(), TLHelper.getOnDateChangedListener());
	    dp.setOnClickListener(TLHelper.getOnClickListener());
	    
	    Chronometer c = (Chronometer) findViewById(R.id.chronometer1);
	    c.setOnClickListener(TLHelper.getOnClickListener());
	    
	    AnalogClock ac = (AnalogClock) findViewById(R.id.analogClock1);
	    ac.setOnClickListener(TLHelper.getOnClickListener());
	    
	    DigitalClock dc = (DigitalClock) findViewById(R.id.digitalClock1);
	    dc.setOnClickListener(TLHelper.getOnClickListener());
	    
	    ZoomButton zb = (ZoomButton) findViewById(R.id.zoomButton1);
	    zb.setOnClickListener(TLHelper.getOnClickListener());
	    
	    ZoomControls zc = (ZoomControls) findViewById(R.id.zoomControls1);
	    zc.setOnZoomInClickListener(TLHelper.getOnClickListener());
	    zc.setOnZoomOutClickListener(TLHelper.getOnClickListener());
/*		Not a common control     
	    DialerFilter df = (DialerFilter) findViewById(R.id.dialerFilter1);
	    df.setOnClickListener(TLHelper.getOnClickListener());
*/	    
	    TwoLineListItem tl = (TwoLineListItem) findViewById(R.id.twoLineListItem1);
	    tl.setOnClickListener(TLHelper.getOnClickListener());
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
