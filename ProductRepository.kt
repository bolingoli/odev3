class ProductRepository {
    suspend fun getProducts() = RetrofitInstance.api.getProducts()
}
