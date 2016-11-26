package com.pacificresearchalliance.charter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.pacificresearchalliance.charter.document.DocumentContent;

/**
 * A fragment representing a single Section detail screen.
 * This fragment is either contained in a {@link SectionListActivity}
 * in two-pane mode (on tablets) or a {@link SectionDetailActivity}
 * on handsets.
 */
public class SectionDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The document content this fragment is presenting.
     */
    private DocumentContent.DocumentItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public SectionDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the document content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DocumentContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_section_detail, container, false);

        // Show the document content as text in a TextView.
        /*if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.section_detail)).setText(mItem.content);
        }*/
        if (mItem != null) {
            ((WebView) rootView.findViewById(R.id.section_detail)).loadUrl("file:///android_asset/" + mItem.id + ".html");
        }

       // ((SectionDetailActivity) getActivity()).setActionBarTitle(mItem.content);
       // getActivity().getSupportActionBar().setSubtitle("foo");


        return rootView;
    }
}
