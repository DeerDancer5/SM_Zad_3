package pl.edu.pb.todoapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class TaskListActivity extends SingleFragmentActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment createFragment() {

       /* FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);
        if(fragment==null) {
            fragment = new TaskFragment();
            fragmentManager.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }*/

        return  new TaskListFragment();
    }

}