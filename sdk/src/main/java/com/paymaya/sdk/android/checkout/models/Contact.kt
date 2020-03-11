package com.paymaya.sdk.android.checkout.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

/**
 * Buyer's contact details. If the email field is provided, a payment receipt
 * will be sent to the email address.
 *
 * @property phone Phone number of the buyer.
 * @property email Valid email address of the buyer.
 */
@Parcelize
@Serializable
data class Contact(
    val phone: String? = null,
    val email: String? = null
) : Parcelable
