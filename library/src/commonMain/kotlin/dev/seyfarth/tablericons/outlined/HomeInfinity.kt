package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.HomeInfinity: ImageVector
    get() {
        if (_HomeInfinity != null) {
            return _HomeInfinity!!
        }
        _HomeInfinity = ImageVector.Builder(
            name = "Filled.HomeInfinity",
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
                moveTo(19f, 14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineToRelative(-9f, -9f)
                lineToRelative(-9f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(2.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 21f)
                verticalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.75f, 1.032f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.536f, 17.586f)
                arcToRelative(2.123f, 2.123f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.929f, 0f)
                arcToRelative(1.951f, 1.951f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.828f)
                curveToRelative(0.809f, 0.781f, 2.12f, 0.781f, 2.929f, 0f)
                curveToRelative(0.809f, -0.781f, -0.805f, 0.778f, 0f, 0f)
                lineToRelative(1.46f, -1.41f)
                lineToRelative(1.46f, -1.419f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.54f, 17.582f)
                lineToRelative(1.46f, 1.42f)
                lineToRelative(1.46f, 1.41f)
                curveToRelative(0.809f, 0.78f, -0.805f, -0.779f, 0f, 0f)
                reflectiveCurveToRelative(2.12f, 0.781f, 2.929f, 0f)
                arcToRelative(1.951f, 1.951f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.828f)
                arcToRelative(2.123f, 2.123f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.929f, 0f)
            }
        }.build()

        return _HomeInfinity!!
    }

@Suppress("ObjectPropertyName")
private var _HomeInfinity: ImageVector? = null
