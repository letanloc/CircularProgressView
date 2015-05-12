package momentum.circularprogress;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

import junit.framework.Assert;

import momentum.circularprogressview.CircularProgressView;

/**
 * Created by mlostek on 04.05.2015.
 *
 * Demo activity to demonstrate the CircularProgressView
 */
public class DemoActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_demo);
	}

	/**
	 * Start the progress
	 */
	public void onStartClicked(final View view)
	{
		view.setEnabled(false);
		final CircularProgressView progressView = (CircularProgressView)this.findViewById(R.id.circularprogress);
		Assert.assertNotNull(progressView);
		new AsyncTask<Void, Void, Void>()
		{
			@Override
			protected Void doInBackground(Void... voids)
			{
				for(float progress = 0f; progress <= 1f; progress += 0.005)
				{
					progressView.setProgress(progress);
					try
					{
						Thread.sleep(30);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				return null;
			}

			@Override
			protected void onPostExecute(Void aVoid)
			{
				progressView.setProgress(1f);
				view.setEnabled(true);
			}
		}.execute();
	}
}
