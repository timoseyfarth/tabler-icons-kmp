package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ToolsOff: ImageVector
    get() {
        if (_ToolsOff != null) {
            return _ToolsOff!!
        }
        _ToolsOff = ImageVector.Builder(
            name = "Filled.ToolsOff",
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
                moveTo(16f, 12f)
                lineToRelative(4f, -4f)
                arcToRelative(2.828f, 2.828f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, -4f)
                lineToRelative(-4f, 4f)
                moveToRelative(-2f, 2f)
                lineToRelative(-7f, 7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                lineToRelative(7f, -7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 5.5f)
                lineToRelative(4f, 4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                lineToRelative(-5f, -5f)
                moveToRelative(-2f, 2f)
                lineToRelative(-2f, 2f)
                lineToRelative(5f, 5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 8f)
                lineToRelative(-1.5f, 1.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                lineToRelative(5f, 5f)
                moveToRelative(-2f, 2f)
                lineToRelative(-2f, 2f)
                lineToRelative(-5f, -5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 17f)
                lineToRelative(-1.5f, 1.5f)
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

        return _ToolsOff!!
    }

@Suppress("ObjectPropertyName")
private var _ToolsOff: ImageVector? = null
