package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CaretRight: ImageVector
    get() {
        if (_CaretRight != null) {
            return _CaretRight!!
        }
        _CaretRight = ImageVector.Builder(
            name = "Filled.CaretRight",
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
                moveTo(10f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
                verticalLineToRelative(12f)
            }
        }.build()

        return _CaretRight!!
    }

@Suppress("ObjectPropertyName")
private var _CaretRight: ImageVector? = null
