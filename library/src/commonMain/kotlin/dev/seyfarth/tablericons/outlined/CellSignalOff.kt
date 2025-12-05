package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CellSignalOff: ImageVector
    get() {
        if (_CellSignalOff != null) {
            return _CellSignalOff!!
        }
        _CellSignalOff = ImageVector.Builder(
            name = "Filled.CellSignalOff",
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
                moveTo(20f, 20f)
                horizontalLineToRelative(-15.269f)
                arcToRelative(0.731f, 0.731f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.517f, -1.249f)
                lineToRelative(7.265f, -7.264f)
                moveToRelative(2f, -2f)
                lineToRelative(5.272f, -5.272f)
                arcToRelative(0.731f, 0.731f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.249f, 0.517f)
                verticalLineToRelative(11.269f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()

        return _CellSignalOff!!
    }

@Suppress("ObjectPropertyName")
private var _CellSignalOff: ImageVector? = null
