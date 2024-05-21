import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class ProductViewModel : ViewModel() {
    private val repository = ProductRepository()

    val products = liveData(Dispatchers.IO) {
        val retrievedProducts = repository.getProducts()
        emit(retrievedProducts)
    }
}
