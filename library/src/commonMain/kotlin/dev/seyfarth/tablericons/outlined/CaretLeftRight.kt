package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CaretLeftRight: ImageVector
    get() {
        if (_CaretLeftRight != null) {
            return _CaretLeftRight!!
        }
        _CaretLeftRight = ImageVector.Builder(
            name = "Filled.CaretLeftRight",
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
                moveTo(14f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
                verticalLineToRelative(12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 18f)
                lineToRelative(-6f, -6f)
                lineToRelative(6f, -6f)
                verticalLineToRelative(12f)
            }
        }.build()

        return _CaretLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLeftRight: ImageVector? = null
