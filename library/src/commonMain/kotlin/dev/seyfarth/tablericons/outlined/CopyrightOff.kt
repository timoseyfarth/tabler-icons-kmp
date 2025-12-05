package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CopyrightOff: ImageVector
    get() {
        if (_CopyrightOff != null) {
            return _CopyrightOff!!
        }
        _CopyrightOff = ImageVector.Builder(
            name = "Filled.CopyrightOff",
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
                moveTo(14f, 9.75f)
                arcToRelative(3.016f, 3.016f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.711f, -0.466f)
                moveToRelative(-3.41f, 0.596f)
                arcToRelative(2.993f, 2.993f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.042f, 4.197f)
                arcToRelative(3.016f, 3.016f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.163f, 0.173f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.042f, 16.045f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.087f, -12.087f)
                moveToRelative(-2.318f, 1.677f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.725f, 12.73f)
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

        return _CopyrightOff!!
    }

@Suppress("ObjectPropertyName")
private var _CopyrightOff: ImageVector? = null
