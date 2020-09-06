//package com.example.qrscanner1;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ListView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//import androidx.navigation.fragment.NavHostFragment;
//
//public class SecondFragment extends AppCompatActivity {
//
//    // ...
//
//    private ListView mListView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Find the ListView
//        mListView = (ListView) findViewById(R.id.list_view);
//
////         * Create a DatabaseReference to the data; works with standard DatabaseReference methods
////         * like limitToLast() and etc.
////        DatabaseReference peopleReference = FirebaseDatabase.getInstance().getReference()
////                .child("people");
//
//        // Now set the adapter with a given layout
//        mListView.setAdapter(new FirebaseListAdapter<Person>(this, Person.class,
//                android.R.layout.one_line_list_item, peopleReference) {
//
//            // Populate view as needed
//            @Override
//            protected void populateView(View view, Person person, int position) {
//                ((TextView) view.findViewById(android.R.id.text1)).setText(person.getName());
//            }
//        });
//    }
//}
//
