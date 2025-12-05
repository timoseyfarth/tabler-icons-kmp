package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ConeOff: ImageVector
    get() {
        if (_ConeOff != null) {
            return _ConeOff!!
        }
        _ConeOff = ImageVector.Builder(
            name = "Filled.ConeOff",
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
                moveTo(20.396f, 16.384f)
                lineToRelative(-7.526f, -13.877f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.74f, 0f)
                lineToRelative(-1.626f, 2.998f)
                moveToRelative(-1.407f, 2.594f)
                lineToRelative(-5.097f, 9.398f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.66f, 4.03f, 3.003f, 9f, 3.003f)
                curveToRelative(3.202f, 0f, 6.014f, -0.558f, 7.609f, -1.398f)
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

        return _ConeOff!!
    }

@Suppress("ObjectPropertyName")
private var _ConeOff: ImageVector? = null
