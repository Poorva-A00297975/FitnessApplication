import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WorkoutDao {
    @Insert
    suspend fun insert(workout: Workout)

    @Query("SELECT * FROM Workout")
    suspend fun getAllWorkouts(): List<Workout>
}
