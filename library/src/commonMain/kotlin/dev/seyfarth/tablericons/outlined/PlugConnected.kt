package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PlugConnected: ImageVector
    get() {
        if (_PlugConnected != null) {
            return _PlugConnected!!
        }
        _PlugConnected = ImageVector.Builder(
            name = "Filled.PlugConnected",
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
                moveTo(7f, 12f)
                lineToRelative(5f, 5f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(3.536f, 3.536f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, -5f)
                lineToRelative(1.5f, -1.5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 12f)
                lineToRelative(-5f, -5f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(3.536f, 3.536f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 5f)
                lineToRelative(-1.5f, 1.5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 21f)
                lineToRelative(2.5f, -2.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 5.5f)
                lineToRelative(2.5f, -2.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 11f)
                lineToRelative(-2f, 2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 14f)
                lineToRelative(-2f, 2f)
            }
        }.build()

        return _PlugConnected!!
    }

@Suppress("ObjectPropertyName")
private var _PlugConnected: ImageVector? = null
