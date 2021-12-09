package kukaramba.example.mytest4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StarsAdapter(private val starsList: List<Stars>) : RecyclerView.Adapter<StarsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StarsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.stars_list_item, parent, false)
        return StarsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: StarsViewHolder, position: Int) {
        val stars = starsList[position]
        holder.bind(stars)
    }

    override fun getItemCount(): Int {
        return starsList.size
    }
}