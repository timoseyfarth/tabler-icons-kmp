package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.TriangleOff: ImageVector
    get() {
        if (_TriangleOff != null) {
            return _TriangleOff!!
        }
        _TriangleOff = ImageVector.Builder(
            name = "Filled.TriangleOff",
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
                moveTo(7.825f, 7.83f)
                lineToRelative(-5.568f, 9.295f)
                arcToRelative(1.914f, 1.914f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.636f, 2.871f)
                horizontalLineToRelative(16.107f)
                moveToRelative(1.998f, -1.99f)
                arcToRelative(1.913f, 1.913f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.255f, -0.88f)
                lineToRelative(-8.106f, -13.536f)
                arcToRelative(1.914f, 1.914f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.274f, 0f)
                lineToRelative(-1.028f, 1.718f)
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

        return _TriangleOff!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleOff: ImageVector? = null
