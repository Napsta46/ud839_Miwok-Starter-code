package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Andy on 09/09/2020.
 */

public class WordAdapter extends ArrayAdapter<Word>{
    //private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (It doesn't mirror a superclass Constructor)
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     * @param context The current context. used to inflate the layout file.
     * @param words Alist of the WordAdapter oblects to display in a list
     */

    public WordAdapter(Context context, ArrayList<Word> words){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0
        super(context, 0 , words);
    }
    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override

    public View getView(int position,  View convertView, @NonNull ViewGroup parent) {
        //Check if the existing view is being reused , otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent, false);
        }
        //Get the {@link word} object located at this position in the list
        Word currentWord = getItem(position);

        //Find The TextView in the list_item.xml layout with ID default_text_view
        TextView defaultTranslationTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        //Get the version defaultTranslation from the current Word object and
        //set this on the  defaultTranslation Textview
        defaultTranslationTextView.setText(currentWord.getDefaultTranslation());

        //Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTranslationTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current Word object and
        // set this test on the miwok TextView
        miwokTranslationTextView.setText(currentWord.getmMiwokTranslation());

        return listItemView;
    }
}