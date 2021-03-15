// Code generated by Wire protocol buffer compiler, do not edit.
package misk.web.metadata.protos

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.checkElementsNotNull
import com.squareup.wire.`internal`.countNonNull
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

public class Shipment(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  @JvmField
  public val shipment_id: Long? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  public val shipment_token: String? = null,
  @field:WireField(
    tag = 4,
    adapter = "misk.web.metadata.protos.Warehouse#ADAPTER"
  )
  @JvmField
  public val source: Warehouse? = null,
  @field:WireField(
    tag = 5,
    adapter = "misk.web.metadata.protos.Warehouse#ADAPTER"
  )
  @JvmField
  public val destination: Warehouse? = null,
  @field:WireField(
    tag = 6,
    adapter = "misk.web.metadata.protos.Shipment${'$'}State#ADAPTER"
  )
  @JvmField
  public val status: State? = null,
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  @JvmField
  public val load_ratio: Double? = null,
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  public val deleted: Boolean? = null,
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  @JvmField
  public val source_signature: ByteString? = null,
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  @JvmField
  public val destination_signature: ByteString? = null,
  notes: List<String> = emptyList(),
  @field:WireField(
    tag = 13,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  public val account_token: String? = null,
  @field:WireField(
    tag = 14,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  public val card_token: String? = null,
  @field:WireField(
    tag = 15,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  public val transfer_id: String? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<Shipment, Shipment.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 12,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED
  )
  @JvmField
  public val notes: List<String> = immutableCopyOf("notes", notes)

  init {
    require(countNonNull(account_token, card_token, transfer_id) <= 1) {
      "At most one of account_token, card_token, transfer_id may be non-null"
    }
  }

  public override fun newBuilder(): Builder {
    val builder = Builder()
    builder.shipment_id = shipment_id
    builder.shipment_token = shipment_token
    builder.source = source
    builder.destination = destination
    builder.status = status
    builder.load_ratio = load_ratio
    builder.deleted = deleted
    builder.source_signature = source_signature
    builder.destination_signature = destination_signature
    builder.notes = notes
    builder.account_token = account_token
    builder.card_token = card_token
    builder.transfer_id = transfer_id
    builder.addUnknownFields(unknownFields)
    return builder
  }

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Shipment) return false
    if (unknownFields != other.unknownFields) return false
    if (shipment_id != other.shipment_id) return false
    if (shipment_token != other.shipment_token) return false
    if (source != other.source) return false
    if (destination != other.destination) return false
    if (status != other.status) return false
    if (load_ratio != other.load_ratio) return false
    if (deleted != other.deleted) return false
    if (source_signature != other.source_signature) return false
    if (destination_signature != other.destination_signature) return false
    if (notes != other.notes) return false
    if (account_token != other.account_token) return false
    if (card_token != other.card_token) return false
    if (transfer_id != other.transfer_id) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + shipment_id.hashCode()
      result = result * 37 + shipment_token.hashCode()
      result = result * 37 + source.hashCode()
      result = result * 37 + destination.hashCode()
      result = result * 37 + status.hashCode()
      result = result * 37 + load_ratio.hashCode()
      result = result * 37 + deleted.hashCode()
      result = result * 37 + source_signature.hashCode()
      result = result * 37 + destination_signature.hashCode()
      result = result * 37 + notes.hashCode()
      result = result * 37 + account_token.hashCode()
      result = result * 37 + card_token.hashCode()
      result = result * 37 + transfer_id.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    if (shipment_id != null) result += """shipment_id=$shipment_id"""
    if (shipment_token != null) result += """shipment_token=${sanitize(shipment_token)}"""
    if (source != null) result += """source=$source"""
    if (destination != null) result += """destination=$destination"""
    if (status != null) result += """status=$status"""
    if (load_ratio != null) result += """load_ratio=$load_ratio"""
    if (deleted != null) result += """deleted=$deleted"""
    if (source_signature != null) result += """source_signature=$source_signature"""
    if (destination_signature != null) result += """destination_signature=$destination_signature"""
    if (notes.isNotEmpty()) result += """notes=${sanitize(notes)}"""
    if (account_token != null) result += """account_token=${sanitize(account_token)}"""
    if (card_token != null) result += """card_token=${sanitize(card_token)}"""
    if (transfer_id != null) result += """transfer_id=${sanitize(transfer_id)}"""
    return result.joinToString(prefix = "Shipment{", separator = ", ", postfix = "}")
  }

  public fun copy(
    shipment_id: Long? = this.shipment_id,
    shipment_token: String? = this.shipment_token,
    source: Warehouse? = this.source,
    destination: Warehouse? = this.destination,
    status: State? = this.status,
    load_ratio: Double? = this.load_ratio,
    deleted: Boolean? = this.deleted,
    source_signature: ByteString? = this.source_signature,
    destination_signature: ByteString? = this.destination_signature,
    notes: List<String> = this.notes,
    account_token: String? = this.account_token,
    card_token: String? = this.card_token,
    transfer_id: String? = this.transfer_id,
    unknownFields: ByteString = this.unknownFields
  ): Shipment = Shipment(
    shipment_id, shipment_token, source, destination, status, load_ratio,
    deleted, source_signature, destination_signature, notes, account_token, card_token,
    transfer_id, unknownFields
  )

  public class Builder : Message.Builder<Shipment, Builder>() {
    @JvmField
    public var shipment_id: Long? = null

    @JvmField
    public var shipment_token: String? = null

    @JvmField
    public var source: Warehouse? = null

    @JvmField
    public var destination: Warehouse? = null

    @JvmField
    public var status: State? = null

    @JvmField
    public var load_ratio: Double? = null

    @JvmField
    public var deleted: Boolean? = null

    @JvmField
    public var source_signature: ByteString? = null

    @JvmField
    public var destination_signature: ByteString? = null

    @JvmField
    public var notes: List<String> = emptyList()

    @JvmField
    public var account_token: String? = null

    @JvmField
    public var card_token: String? = null

    @JvmField
    public var transfer_id: String? = null

    public fun shipment_id(shipment_id: Long?): Builder {
      this.shipment_id = shipment_id
      return this
    }

    public fun shipment_token(shipment_token: String?): Builder {
      this.shipment_token = shipment_token
      return this
    }

    public fun source(source: Warehouse?): Builder {
      this.source = source
      return this
    }

    public fun destination(destination: Warehouse?): Builder {
      this.destination = destination
      return this
    }

    public fun status(status: State?): Builder {
      this.status = status
      return this
    }

    public fun load_ratio(load_ratio: Double?): Builder {
      this.load_ratio = load_ratio
      return this
    }

    public fun deleted(deleted: Boolean?): Builder {
      this.deleted = deleted
      return this
    }

    public fun source_signature(source_signature: ByteString?): Builder {
      this.source_signature = source_signature
      return this
    }

    public fun destination_signature(destination_signature: ByteString?): Builder {
      this.destination_signature = destination_signature
      return this
    }

    public fun notes(notes: List<String>): Builder {
      checkElementsNotNull(notes)
      this.notes = notes
      return this
    }

    public fun account_token(account_token: String?): Builder {
      this.account_token = account_token
      this.card_token = null
      this.transfer_id = null
      return this
    }

    public fun card_token(card_token: String?): Builder {
      this.card_token = card_token
      this.account_token = null
      this.transfer_id = null
      return this
    }

    public fun transfer_id(transfer_id: String?): Builder {
      this.transfer_id = transfer_id
      this.account_token = null
      this.card_token = null
      return this
    }

    public override fun build(): Shipment = Shipment(
      shipment_id = shipment_id,
      shipment_token = shipment_token,
      source = source,
      destination = destination,
      status = status,
      load_ratio = load_ratio,
      deleted = deleted,
      source_signature = source_signature,
      destination_signature = destination_signature,
      notes = notes,
      account_token = account_token,
      card_token = card_token,
      transfer_id = transfer_id,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Shipment> = object : ProtoAdapter<Shipment>(
      FieldEncoding.LENGTH_DELIMITED,
      Shipment::class,
      "type.googleapis.com/squareup.cash.prospector.data.Shipment",
      PROTO_2,
      null
    ) {
      public override fun encodedSize(value: Shipment): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT64.encodedSizeWithTag(1, value.shipment_id)
        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.shipment_token)
        size += Warehouse.ADAPTER.encodedSizeWithTag(4, value.source)
        size += Warehouse.ADAPTER.encodedSizeWithTag(5, value.destination)
        size += State.ADAPTER.encodedSizeWithTag(6, value.status)
        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, value.load_ratio)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(8, value.deleted)
        size += ProtoAdapter.BYTES.encodedSizeWithTag(9, value.source_signature)
        size += ProtoAdapter.BYTES.encodedSizeWithTag(10, value.destination_signature)
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(12, value.notes)
        size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.account_token)
        size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.card_token)
        size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.transfer_id)
        return size
      }

      public override fun encode(writer: ProtoWriter, value: Shipment) {
        ProtoAdapter.INT64.encodeWithTag(writer, 1, value.shipment_id)
        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.shipment_token)
        Warehouse.ADAPTER.encodeWithTag(writer, 4, value.source)
        Warehouse.ADAPTER.encodeWithTag(writer, 5, value.destination)
        State.ADAPTER.encodeWithTag(writer, 6, value.status)
        ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, value.load_ratio)
        ProtoAdapter.BOOL.encodeWithTag(writer, 8, value.deleted)
        ProtoAdapter.BYTES.encodeWithTag(writer, 9, value.source_signature)
        ProtoAdapter.BYTES.encodeWithTag(writer, 10, value.destination_signature)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 12, value.notes)
        ProtoAdapter.STRING.encodeWithTag(writer, 13, value.account_token)
        ProtoAdapter.STRING.encodeWithTag(writer, 14, value.card_token)
        ProtoAdapter.STRING.encodeWithTag(writer, 15, value.transfer_id)
        writer.writeBytes(value.unknownFields)
      }

      public override fun decode(reader: ProtoReader): Shipment {
        var shipment_id: Long? = null
        var shipment_token: String? = null
        var source: Warehouse? = null
        var destination: Warehouse? = null
        var status: State? = null
        var load_ratio: Double? = null
        var deleted: Boolean? = null
        var source_signature: ByteString? = null
        var destination_signature: ByteString? = null
        val notes = mutableListOf<String>()
        var account_token: String? = null
        var card_token: String? = null
        var transfer_id: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> shipment_id = ProtoAdapter.INT64.decode(reader)
            2 -> shipment_token = ProtoAdapter.STRING.decode(reader)
            4 -> source = Warehouse.ADAPTER.decode(reader)
            5 -> destination = Warehouse.ADAPTER.decode(reader)
            6 -> try {
              status = State.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            7 -> load_ratio = ProtoAdapter.DOUBLE.decode(reader)
            8 -> deleted = ProtoAdapter.BOOL.decode(reader)
            9 -> source_signature = ProtoAdapter.BYTES.decode(reader)
            10 -> destination_signature = ProtoAdapter.BYTES.decode(reader)
            12 -> notes.add(ProtoAdapter.STRING.decode(reader))
            13 -> account_token = ProtoAdapter.STRING.decode(reader)
            14 -> card_token = ProtoAdapter.STRING.decode(reader)
            15 -> transfer_id = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return Shipment(
          shipment_id = shipment_id,
          shipment_token = shipment_token,
          source = source,
          destination = destination,
          status = status,
          load_ratio = load_ratio,
          deleted = deleted,
          source_signature = source_signature,
          destination_signature = destination_signature,
          notes = notes,
          account_token = account_token,
          card_token = card_token,
          transfer_id = transfer_id,
          unknownFields = unknownFields
        )
      }

      public override fun redact(value: Shipment): Shipment = value.copy(
        source = value.source?.let(Warehouse.ADAPTER::redact),
        destination = value.destination?.let(Warehouse.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }

  public enum class State(
    public override val value: Int
  ) : WireEnum {
    VALIDATING(0),
    PICKING_UP(1),
    DELIVERING(2),
    CONSUMING(4),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<State> = object : EnumAdapter<State>(
        State::class,
        PROTO_2,
        VALIDATING
      ) {
        public override fun fromValue(value: Int): State? = State.fromValue(value)
      }

      @JvmStatic
      public fun fromValue(value: Int): State? = when (value) {
        0 -> VALIDATING
        1 -> PICKING_UP
        2 -> DELIVERING
        4 -> CONSUMING
        else -> null
      }
    }
  }
}
