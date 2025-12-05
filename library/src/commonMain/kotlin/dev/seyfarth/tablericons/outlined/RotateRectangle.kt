package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.RotateRectangle: ImageVector
    get() {
        if (_RotateRectangle != null) {
            return _RotateRectangle!!
        }
        _RotateRectangle = ImageVector.Builder(
            name = "Filled.RotateRectangle",
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
                moveTo(10.09f, 4.01f)
                lineToRelative(0.496f, -0.495f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.828f, 0f)
                lineToRelative(7.071f, 7.07f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.83f)
                lineToRelative(-7.07f, 7.07f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, 0f)
                lineToRelative(-7.07f, -7.07f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.83f)
                lineToRelative(3.535f, -3.535f)
                horizontalLineToRelative(-3.988f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.05f, 11.038f)
                verticalLineToRelative(-3.988f)
            }
        }.build()

        return _RotateRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _RotateRectangle: ImageVector? = null
