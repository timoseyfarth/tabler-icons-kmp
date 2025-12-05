package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.DogBowl: ImageVector
    get() {
        if (_DogBowl != null) {
            return _DogBowl!!
        }
        _DogBowl = ImageVector.Builder(
            name = "Filled.DogBowl",
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
                moveTo(10f, 15f)
                lineToRelative(5.586f, -5.585f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.414f, -1.415f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.413f, 3.414f)
                lineToRelative(-3.587f, 3.586f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                lineToRelative(-3.586f, -3.585f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.414f, -1.415f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.413f, 3.414f)
                lineToRelative(3.587f, 3.586f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 20f)
                horizontalLineToRelative(18f)
                curveToRelative(-0.175f, -1.671f, -0.046f, -3.345f, -2f, -5f)
                horizontalLineToRelative(-14f)
                curveToRelative(-1.333f, 1f, -2f, 2.667f, -2f, 5f)
                close()
            }
        }.build()

        return _DogBowl!!
    }

@Suppress("ObjectPropertyName")
private var _DogBowl: ImageVector? = null
