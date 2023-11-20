import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import firstcom.poorva.fitnessapplication.R
import firstcom.poorva.fitnessapplication.WorkoutAdapter

class MainActivity : AppCompatActivity() {

    private val viewModel: WorkoutViewModel by viewModel
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel.allWorkouts.observe(this, { workouts ->
            val adapter = WorkoutAdapter(workouts)
            recyclerView.adapter = adapter
        })
    }

    fun onAddWorkoutClick(view: Button) {
        // Implement logic to add a workout
    }
}

private fun Any.observe(mainActivity: MainActivity, any: Any) {


}

class WorkoutViewModel {

    val allWorkouts: Any
}
