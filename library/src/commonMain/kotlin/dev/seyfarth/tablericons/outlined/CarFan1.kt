package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CarFan1: ImageVector
    get() {
        if (_CarFan1 != null) {
            return _CarFan1!!
        }
        _CarFan1 = ImageVector.Builder(
            name = "Filled.CarFan1",
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
                moveTo(12f, 12f)
                verticalLineToRelative(-9f)
                lineToRelative(4.912f, 1.914f)
                arcToRelative(1.7f, 1.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.428f, 2.925f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.424f, 15.03f)
                lineToRelative(-2.424f, -3.03f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                horizontalLineToRelative(-9f)
                lineToRelative(1.914f, -4.912f)
                arcToRelative(1.7f, 1.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.925f, -0.428f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                verticalLineToRelative(9f)
                lineToRelative(-4.912f, -1.914f)
                arcToRelative(1.7f, 1.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.428f, -2.925f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 17f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(6f)
            }
        }.build()

        return _CarFan1!!
    }

@Suppress("ObjectPropertyName")
private var _CarFan1: ImageVector? = null
