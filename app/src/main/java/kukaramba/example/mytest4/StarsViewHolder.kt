package kukaramba.example.mytest4

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StarsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        private val nameTextView: TextView = itemView.findViewById(R.id.stars_name_text_view)
        private val professionTextView: TextView = itemView.findViewById(R.id.stars_profession_text_view)

        fun bind(stars: Stars) {
            nameTextView.text = "Stars - ${stars.name}"
            professionTextView.text = "Profession - ${stars.profession}"
    }


}