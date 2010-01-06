package it.unibz.pomodroid;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

class SharedMenu {
	private static final int AIS = 0;
	private static final int TTS = 1;
	private static final int TS = 2;
	private static final int PRE = 3;
	private static final int SET = 4;

	private static Context context = null;

	public static Context getContext() {
		return context;
	}

	public static void setContext(Context context) {
		SharedMenu.context = context;
	}

	public static boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, AIS, 0, "Activity Inventory Sheet").setIcon(
				android.R.drawable.ic_menu_upload);
		menu.add(0, TTS, 0, "Todo Today Sheet").setIcon(
				android.R.drawable.ic_menu_upload);
		menu.add(0, TS, 0, "Trash Sheet").setIcon(
				android.R.drawable.ic_menu_delete);
		menu.add(0, PRE, 0, "TRAC/PROM").setIcon(
				android.R.drawable.ic_menu_send);
		menu.add(0, SET, 0, "Settings").setIcon(
				android.R.drawable.ic_menu_preferences);
		return true;
	}

	public static boolean onOptionsItemSelected(MenuItem item) {
		Intent i;
		switch (item.getItemId()) {
		case AIS:
			i = new Intent(SharedMenu.context, ActivityInventorySheet.class);
			SharedMenu.context.startActivity(i);
			return true;
		case TTS:
			i = new Intent(SharedMenu.context, TodoTodaySheet.class);
			SharedMenu.context.startActivity(i);
			return true;
		case TS:
			i = new Intent(SharedMenu.context, TrashSheet.class);
			SharedMenu.context.startActivity(i);
			return true;
		case PRE:
			i = new Intent(SharedMenu.context, TracPromMenu.class);
			SharedMenu.context.startActivity(i);
			return true;
		case SET:
			i = new Intent(SharedMenu.context, TabPreferences.class);
			SharedMenu.context.startActivity(i);
			return true;
		}
		return false;
	}
}