import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WorkoutAdapter(private val workouts: List<Workout>) :
    RecyclerView.Adapter<WorkoutAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val durationTextView: TextView = itemView.findViewById(R.id.durationTextView)
        val caloriesTextView: TextView = itemView.findViewById(R.id.caloriesTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.workout_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentWorkout = workouts[position]
        holder.nameTextView.text = currentWorkout.name
        holder.durationTextView.text = "Duration: ${currentWorkout.duration} mins"
        holder.caloriesTextView.text = "Calories Burned: ${currentWorkout.caloriesBurned} cal"
    }

    override fun getItemCount(): Int {
        return workouts.size
    }
}
