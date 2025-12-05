package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ChartAreaLine: ImageVector
    get() {
        if (_ChartAreaLine != null) {
            return _ChartAreaLine!!
        }
        _ChartAreaLine = ImageVector.Builder(
            name = "Filled.ChartAreaLine",
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
                moveTo(4f, 19f)
                lineToRelative(4f, -6f)
                lineToRelative(4f, 2f)
                lineToRelative(4f, -5f)
                lineToRelative(4f, 4f)
                lineToRelative(0f, 5f)
                lineToRelative(-16f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 12f)
                lineToRelative(3f, -4f)
                lineToRelative(4f, 2f)
                lineToRelative(5f, -6f)
                lineToRelative(4f, 4f)
            }
        }.build()

        return _ChartAreaLine!!
    }

@Suppress("ObjectPropertyName")
private var _ChartAreaLine: ImageVector? = null
