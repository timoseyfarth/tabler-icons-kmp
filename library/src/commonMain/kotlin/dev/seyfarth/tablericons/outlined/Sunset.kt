package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Sunset: ImageVector
    get() {
        if (_Sunset != null) {
            return _Sunset!!
        }
        _Sunset = ImageVector.Builder(
            name = "Filled.Sunset",
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
                moveTo(3f, 17f)
                horizontalLineToRelative(1f)
                moveToRelative(16f, 0f)
                horizontalLineToRelative(1f)
                moveToRelative(-15.4f, -6.4f)
                lineToRelative(0.7f, 0.7f)
                moveToRelative(12.1f, -0.7f)
                lineToRelative(-0.7f, 0.7f)
                moveToRelative(-9.7f, 5.7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 21f)
                lineToRelative(18f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineToRelative(6f)
                lineToRelative(3f, -3f)
                moveToRelative(-6f, 0f)
                lineToRelative(3f, 3f)
            }
        }.build()

        return _Sunset!!
    }

@Suppress("ObjectPropertyName")
private var _Sunset: ImageVector? = null
