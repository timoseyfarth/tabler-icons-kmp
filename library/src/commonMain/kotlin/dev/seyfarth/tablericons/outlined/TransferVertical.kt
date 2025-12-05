package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.TransferVertical: ImageVector
    get() {
        if (_TransferVertical != null) {
            return _TransferVertical!!
        }
        _TransferVertical = ImageVector.Builder(
            name = "Filled.TransferVertical",
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
                moveTo(10f, 4f)
                verticalLineToRelative(16f)
                lineToRelative(-6f, -5.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 20f)
                verticalLineToRelative(-16f)
                lineToRelative(6f, 5.5f)
            }
        }.build()

        return _TransferVertical!!
    }

@Suppress("ObjectPropertyName")
private var _TransferVertical: ImageVector? = null
