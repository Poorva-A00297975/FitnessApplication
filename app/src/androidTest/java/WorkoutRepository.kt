import androidx.lifecycle.LiveData

// WorkoutRepository.kt
class WorkoutRepository(private val workoutDao: WorkoutDao) {
    val allWorkouts: LiveData<List<Workout>> = workoutDao.getAllWorkouts().asLiveData()

    suspend fun insert(workout: Workout) {
        workoutDao.insert(workout)
    }
}

private fun Any.asLiveData() {

    return TODO("Provide the return value")
}
