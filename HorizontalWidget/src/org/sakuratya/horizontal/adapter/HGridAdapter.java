package org.sakuratya.horizontal.adapter;


import java.util.ArrayList;

import android.widget.BaseAdapter;

public abstract class HGridAdapter<E> extends BaseAdapter {
	
	protected ArrayList<E> mList;
	
	public abstract int getSectionIndex(int position);
	
	/**
	 * Return the section count by the sectionIndex.
	 * @param position is the section's index in {@link HGridAdapter#mList}
	 * @return the section count.
	 */
	public abstract int getSectionCount(int sectionIndex);

	public boolean hasSection() {
		return mList.size() > 1 ? true:false;
	}
	
	public int getTotalSectionNum() {
		return mList.size();
	}
	
	public abstract String getLabelText(int sectionIndex);
}
