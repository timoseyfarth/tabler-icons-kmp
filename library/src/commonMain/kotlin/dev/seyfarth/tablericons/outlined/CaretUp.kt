package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CaretUp: ImageVector
    get() {
        if (_CaretUp != null) {
            return _CaretUp!!
        }
        _CaretUp = ImageVector.Builder(
            name = "Filled.CaretUp",
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
                moveTo(18f, 14f)
                lineToRelative(-6f, -6f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(12f)
            }
        }.build()

        return _CaretUp!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUp: ImageVector? = null
