package mobpro.inf.prak.belajarandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import	android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;


public class PhoneNumberSpinner extends AppCompatActivity implements
    AdapterView.OnItemSelectedListener{

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number_spinner);

        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);

            ArrayAdapter<CharSequence>	adapter	=	ArrayAdapter.createFromResource(this,
                    R.array.labels_array,	android.R.layout.simple_spinner_item);

            //	Specify	the	layout	to	use	when	the	list	of	choices	appears.
            adapter.setDropDownViewResource
                    (android.R.layout.simple_spinner_dropdown_item);
            //	Apply	the	adapter	to	the	spinner.
            if	(spinner	!=	null)	{
                spinner.setAdapter(adapter);
            }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            public	class	MainActivity	extends	AppCompatActivity	implements
                    AdapterView.OnItemSelectedListener	{
                private	String	mSpinnerLabel	=	"";
            }
            public	void	onItemSelected(AdapterView<?>	AdapterView,	View view,	int
            i,	long	l)	{
                mSpinnerLabel	=	adapterView.getItemAtPosition(i).toString();
                showText(view);
            }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
