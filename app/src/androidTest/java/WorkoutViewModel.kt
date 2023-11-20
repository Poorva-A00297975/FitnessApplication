import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers

// WorkoutViewModel.kt
class WorkoutViewModel(application: Application) : AndroidViewModel(application) {
    private val viewModelScope: Any
        get() = TODO()
    private val repository: WorkoutRepository
    val allWorkouts: LiveData<List<Workout>>

    init {
        val workoutDao = WorkoutDatabase.getDatabase(application).workoutDao()
        repository = WorkoutRepository(workoutDao)
        allWorkouts = repository.allWorkouts
    }

    fun insert(workout: Workout) = viewModelScope.launch(Dispatchers.IO) {
        repository.run { this.insert(workout = workout) }
    }
}

private fun Any.launch(any: Any, function: () -> Unit): Any {
    TODO("Not yet implemented")
}
