package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Heartbeat: ImageVector
    get() {
        if (_Heartbeat != null) {
            return _Heartbeat!!
        }
        _Heartbeat = ImageVector.Builder(
            name = "Filled.Heartbeat",
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
                moveTo(19.5f, 13.572f)
                lineToRelative(-7.5f, 7.428f)
                lineToRelative(-2.896f, -2.868f)
                moveToRelative(-6.117f, -8.104f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.013f, -3.022f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.5f, 6.572f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 13f)
                horizontalLineToRelative(2f)
                lineToRelative(2f, 3f)
                lineToRelative(2f, -6f)
                lineToRelative(1f, 3f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _Heartbeat!!
    }

@Suppress("ObjectPropertyName")
private var _Heartbeat: ImageVector? = null
