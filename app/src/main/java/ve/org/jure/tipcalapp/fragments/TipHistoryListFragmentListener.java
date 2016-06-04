package ve.org.jure.tipcalapp.fragments;

import ve.org.jure.tipcalapp.models.TipRecord;

/**
 * Created by jure on 6/3/16.
 */
public interface TipHistoryListFragmentListener {
    public void addTolist(TipRecord record);
    public void clearList();
}
