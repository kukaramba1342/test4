package kukaramba.example.mytest4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenu: BottomNavigationView
    lateinit var showWebSiteButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)

        bottomNavigationMenu.setOnItemSelectedListener { item->
            var fragment: Fragment? =null
            when (item.itemId) {
                R.id.fragment_1->{
                    fragment=First_Fragment()
                }
                R.id.fragment_2->{
                    fragment=Two_Fragment()
                }
                R.id.fragment_3->{
                    fragment=three_Fragment()
                }

            }
            replaceFragment(fragment!!)

             true
        }
        bottomNavigationMenu.selectedItemId=R.id.fragment_1

        }


    private fun replaceFragment (fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(fragment.tag)
            .commit()
    }

}