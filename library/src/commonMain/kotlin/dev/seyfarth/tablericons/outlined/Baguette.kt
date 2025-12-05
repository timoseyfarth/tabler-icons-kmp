package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Baguette: ImageVector
    get() {
        if (_Baguette != null) {
            return _Baguette!!
        }
        _Baguette = ImageVector.Builder(
            name = "Filled.Baguette",
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
                moveTo(5.628f, 11.283f)
                lineToRelative(5.644f, -5.637f)
                curveToRelative(2.665f, -2.663f, 5.924f, -3.747f, 8.663f, -1.205f)
                lineToRelative(0.188f, 0.181f)
                arcToRelative(2.987f, 2.987f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.228f)
                lineToRelative(-11.287f, 11.274f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.089f, 0.135f)
                lineToRelative(-0.143f, -0.135f)
                curveToRelative(-2.728f, -2.724f, -1.704f, -6.117f, 1.024f, -8.841f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 7.5f)
                lineToRelative(1.5f, 3.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 10.5f)
                lineToRelative(1.5f, 3.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 4.5f)
                lineToRelative(1.5f, 3.5f)
            }
        }.build()

        return _Baguette!!
    }

@Suppress("ObjectPropertyName")
private var _Baguette: ImageVector? = null
