package kukaramba.example.mytest4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Two_Fragment : Fragment() {

    lateinit var starsRecyclerView: RecyclerView
    lateinit var showWebSiteButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two_, container, false)

        val starsList: List<Stars> = listOf(
            Stars("LABODA", "МУЗЫКАНТ, ПЕВИЦА, ДИЗАЙНЕР, АВТОР" ),
            Stars("ЭЛДЖЕЙ", "МУЗЫКАНТ, ПЕВЕЦ"),
            Stars("НАСТЯ ИВЛЕЕВА", "ВЕДУЩИЙ"),
            Stars("ИЛЬДАР ДЖАХАРОВ", "Певец"),
            Stars("ЭЛДЖЕЙ", "МУЗЫКАНТ, ПЕВЕЦ"),
        )

        showWebSiteButton=view.findViewById(R.id.show_web_site_button)
        starsRecyclerView = view.findViewById(R.id.stars_recycler_view)
        starsRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        starsRecyclerView.adapter = StarsAdapter(starsList)

        showWebSiteButton.setOnClickListener {
            val link = Uri.parse("https://google.com/")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }
        return view
    }


}