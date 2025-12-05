package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.MoonOff: ImageVector
    get() {
        if (_MoonOff != null) {
            return _MoonOff!!
        }
        _MoonOff = ImageVector.Builder(
            name = "Filled.MoonOff",
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
                moveTo(7.962f, 3.949f)
                arcToRelative(8.97f, 8.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.038f, -0.957f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(0.393f)
                arcToRelative(7.478f, 7.478f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.07f, 3.308f)
                moveToRelative(-0.141f, 3.84f)
                curveToRelative(0.186f, 0.823f, 0.514f, 1.626f, 0.989f, 2.373f)
                arcToRelative(7.49f, 7.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.586f, 3.268f)
                moveToRelative(3.893f, -0.11f)
                curveToRelative(0.223f, -0.067f, 0.444f, -0.144f, 0.663f, -0.233f)
                arcToRelative(9.088f, 9.088f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.274f, 0.597f)
                moveToRelative(-1.695f, 2.337f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.71f, -12.749f)
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

        return _MoonOff!!
    }

@Suppress("ObjectPropertyName")
private var _MoonOff: ImageVector? = null
