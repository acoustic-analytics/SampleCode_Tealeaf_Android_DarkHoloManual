/********************************************************************************************
 * Copyright (C) 2018 Acoustic, L.P. All rights reserved.
 *
 * NOTICE: This file contains material that is confidential and proprietary to
 * Acoustic, L.P. and/or other developers. No license is granted under any intellectual or
 * industrial property rights of Acoustic, L.P. except as may be provided in an agreement with
 * Acoustic, L.P. Any unauthorized copying or distribution of content from this file is
 * prohibited.
 ********************************************************************************************/
package com.tl.uic.appDarkHolo;

import com.tl.uic.Tealeaf;
import com.tl.uic.appDarkHolo.util.TLHelper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AnalogClock;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.DigitalClock;
import android.widget.TimePicker;
import android.widget.TwoLineListItem;
import android.widget.ZoomButton;
import android.widget.ZoomControls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

@SuppressWarnings("deprecation")
public class ControlsActivity4 extends Fragment {
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.controls4, container, false);

	    TimePicker tp = (TimePicker) v.findViewById(R.id.timePicker1);
	    tp.setOnClickListener(TLHelper.getOnClickListener());
	    
	    DatePicker dp = (DatePicker) v.findViewById(R.id.datePicker1);
	    //Date now = new Date();
	    //dp.init(now.getYear(), now.getMonth(), now.getDay(), TLHelper.getOnDateChangedListener());
	    dp.setOnClickListener(TLHelper.getOnClickListener());
	    
	    Chronometer c = (Chronometer) v.findViewById(R.id.chronometer1);
	    c.setOnClickListener(TLHelper.getOnClickListener());
	    
	    AnalogClock ac = (AnalogClock) v.findViewById(R.id.analogClock1);
	    ac.setOnClickListener(TLHelper.getOnClickListener());
	    
	    DigitalClock dc = (DigitalClock) v.findViewById(R.id.digitalClock1);
	    dc.setOnClickListener(TLHelper.getOnClickListener());
	    
	    ZoomButton zb = (ZoomButton) v.findViewById(R.id.zoomButton1);
	    zb.setOnClickListener(TLHelper.getOnClickListener());
	    
	    ZoomControls zc = (ZoomControls) v.findViewById(R.id.zoomControls1);
	    zc.setOnZoomInClickListener(TLHelper.getOnClickListener());
	    zc.setOnZoomOutClickListener(TLHelper.getOnClickListener());
/*		Not a common control     
	    DialerFilter df = (DialerFilter) findViewById(R.id.dialerFilter1);
	    df.setOnClickListener(TLHelper.getOnClickListener());
*/	    
	    TwoLineListItem tl = (TwoLineListItem) v.findViewById(R.id.twoLineListItem1);
	    tl.setOnClickListener(TLHelper.getOnClickListener());
	    return v;
	}

	/* Add touch event to collect gestures for Tealeaf.
	 *
	 * (non-Javadoc)
	 * @see android.app.Activity#dispatchTouchEvent(android.view.MotionEvent)
	 */
//	public boolean dispatchTouchEvent(MotionEvent e)
//	{
//		Tealeaf.dispatchTouchEvent(this, e);
//		return super.dispatchTouchEvent(e);
//	}
}
