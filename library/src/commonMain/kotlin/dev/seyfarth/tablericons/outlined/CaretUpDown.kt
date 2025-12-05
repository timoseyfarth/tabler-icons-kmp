package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CaretUpDown: ImageVector
    get() {
        if (_CaretUpDown != null) {
            return _CaretUpDown!!
        }
        _CaretUpDown = ImageVector.Builder(
            name = "Filled.CaretUpDown",
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
                moveTo(18f, 10f)
                lineToRelative(-6f, -6f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 14f)
                lineToRelative(-6f, 6f)
                lineToRelative(-6f, -6f)
                horizontalLineToRelative(12f)
            }
        }.build()

        return _CaretUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUpDown: ImageVector? = null
