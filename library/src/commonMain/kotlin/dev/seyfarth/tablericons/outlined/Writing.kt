package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Writing: ImageVector
    get() {
        if (_Writing != null) {
            return _Writing!!
        }
        _Writing = ImageVector.Builder(
            name = "Filled.Writing",
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
                moveTo(20f, 17f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.121f, -0.879f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.879f, -2f, 2f)
                verticalLineToRelative(12f)
                lineToRelative(2f, 2f)
                lineToRelative(2f, -2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 7f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 19f)
                horizontalLineToRelative(-13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -4f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                horizontalLineToRelative(-3f)
            }
        }.build()

        return _Writing!!
    }

@Suppress("ObjectPropertyName")
private var _Writing: ImageVector? = null
