/*******************************************************************************
 * Licensed Materials - Property of IBM
 * (C) Copyright IBM Corp. 2018
 * US Government Users Restricted Rights - Use, duplication or disclosure
 * restricted by GSA ADP Schedule Contract with IBM Corp.
 ******************************************************************************/
package com.tl.uic.appDarkHolo;

import com.ibm.eo.EOCore;
import com.tl.uic.Tealeaf;
import com.tl.uic.TealeafEOLifecycleObject;
import com.tl.uic.appDarkHolo.util.TLHelper;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;


public class ControlsActivity3 extends AppCompatActivity {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.controls3);

	    EditText et = (EditText) findViewById(R.id.editText1);
	    
	    TLHelper.addFocusAndRegister(et, this);
	    et = (EditText) findViewById(R.id.editText2);
	    TLHelper.addFocusAndRegister(et, this);
	    et = (EditText) findViewById(R.id.editText3);
	    TLHelper.addFocusAndRegister(et, this);
	    et = (EditText) findViewById(R.id.editText4);
	    TLHelper.addFocusAndRegister(et, this);
	    et = (EditText) findViewById(R.id.editText5);
	    TLHelper.addFocusAndRegister(et, this);

	    final EditText postMessageUrl = findViewById(R.id.postMessageUrl);
		postMessageUrl.setText(EOCore.getConfigItemString(Tealeaf.TLF_POST_MESSAGE_URL, TealeafEOLifecycleObject.getInstance()));

		final EditText appKey = findViewById(R.id.appKey);
		appKey.setText(EOCore.getConfigItemString(Tealeaf.TLF_APP_KEY, TealeafEOLifecycleObject.getInstance()));

	    Button btn = findViewById(R.id.saveButton);
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				boolean configModified = false;
				if (!postMessageUrl.getText().equals((EOCore.getConfigItemString(Tealeaf.TLF_POST_MESSAGE_URL, TealeafEOLifecycleObject.getInstance())))) {
					EOCore.updateConfig(Tealeaf.TLF_POST_MESSAGE_URL, postMessageUrl.getText().toString(), TealeafEOLifecycleObject.getInstance());
					configModified = true;
				}
				if (!appKey.getText().equals((EOCore.getConfigItemString(Tealeaf.TLF_APP_KEY, TealeafEOLifecycleObject.getInstance())))) {
					EOCore.updateConfig(Tealeaf.TLF_APP_KEY, appKey.getText().toString(), TealeafEOLifecycleObject.getInstance());
					configModified = true;
				}

				if (configModified) {
					Tealeaf.disable();
					Tealeaf.enable();
				}

				Tealeaf.logFormCompletion(true);
			}
		});
	    
	    AutoCompleteTextView acet = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, COUNTRIES);
	    acet.setAdapter(adapter);
	    TLHelper.addFocusAndRegister(acet, this);
	}
	
	private static final String[] COUNTRIES = new String[] {
        "Belgium", "France", "Italy", "Germany", "Spain"
    };

    @Override
    public void onBackPressed() {
        this.getParent().onBackPressed();
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
