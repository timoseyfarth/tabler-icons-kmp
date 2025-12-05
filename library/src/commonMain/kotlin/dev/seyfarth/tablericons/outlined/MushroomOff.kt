package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.MushroomOff: ImageVector
    get() {
        if (_MushroomOff != null) {
            return _MushroomOff!!
        }
        _MushroomOff = ImageVector.Builder(
            name = "Filled.MushroomOff",
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
                moveTo(5.874f, 5.89f)
                arcToRelative(8.128f, 8.128f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.874f, 5.21f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 0.9f)
                horizontalLineToRelative(7.1f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(3.1f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, -0.9f)
                curveToRelative(0f, -4.474f, -3.582f, -8.1f, -8f, -8.1f)
                curveToRelative(-1.43f, 0f, -2.774f, 0.38f, -3.936f, 1.047f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 0f)
                verticalLineToRelative(-5f)
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

        return _MushroomOff!!
    }

@Suppress("ObjectPropertyName")
private var _MushroomOff: ImageVector? = null
