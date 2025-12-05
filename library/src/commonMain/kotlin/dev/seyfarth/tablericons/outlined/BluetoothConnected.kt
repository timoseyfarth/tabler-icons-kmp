package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BluetoothConnected: ImageVector
    get() {
        if (_BluetoothConnected != null) {
            return _BluetoothConnected!!
        }
        _BluetoothConnected = ImageVector.Builder(
            name = "Filled.BluetoothConnected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 8f)
                lineToRelative(10f, 8f)
                lineToRelative(-5f, 4f)
                lineToRelative(0f, -16f)
                lineToRelative(5f, 4f)
                lineToRelative(-10f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 12f)
                lineToRelative(1f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                lineToRelative(1f, 0f)
            }
        }.build()

        return _BluetoothConnected!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothConnected: ImageVector? = null
