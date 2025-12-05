package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandRust: ImageVector
    get() {
        if (_BrandRust != null) {
            return _BrandRust!!
        }
        _BrandRust = ImageVector.Builder(
            name = "Filled.BrandRust",
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
                moveTo(10.139f, 3.463f)
                curveToRelative(0.473f, -1.95f, 3.249f, -1.95f, 3.722f, 0f)
                arcToRelative(1.916f, 1.916f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.859f, 1.185f)
                curveToRelative(1.714f, -1.045f, 3.678f, 0.918f, 2.633f, 2.633f)
                arcToRelative(1.916f, 1.916f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.184f, 2.858f)
                curveToRelative(1.95f, 0.473f, 1.95f, 3.249f, 0f, 3.722f)
                arcToRelative(1.916f, 1.916f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.185f, 2.859f)
                curveToRelative(1.045f, 1.714f, -0.918f, 3.678f, -2.633f, 2.633f)
                arcToRelative(1.916f, 1.916f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.858f, 1.184f)
                curveToRelative(-0.473f, 1.95f, -3.249f, 1.95f, -3.722f, 0f)
                arcToRelative(1.916f, 1.916f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.859f, -1.185f)
                curveToRelative(-1.714f, 1.045f, -3.678f, -0.918f, -2.633f, -2.633f)
                arcToRelative(1.916f, 1.916f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.184f, -2.858f)
                curveToRelative(-1.95f, -0.473f, -1.95f, -3.249f, 0f, -3.722f)
                arcToRelative(1.916f, 1.916f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.185f, -2.859f)
                curveToRelative(-1.045f, -1.714f, 0.918f, -3.678f, 2.633f, -2.633f)
                arcToRelative(1.914f, 1.914f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.858f, -1.184f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(8f)
                verticalLineToRelative(-4f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineToRelative(-1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8f)
                horizontalLineToRelative(-4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 16f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _BrandRust!!
    }

@Suppress("ObjectPropertyName")
private var _BrandRust: ImageVector? = null
