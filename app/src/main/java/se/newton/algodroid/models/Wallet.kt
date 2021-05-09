package se.newton.algodroid.models

// TODO change Wallet.amount to a list of WalletAssets
// TODO add a list of wallet transactions
data class Wallet(
    private val address: String,
    private val name: String,
    private val amount: Double,
)