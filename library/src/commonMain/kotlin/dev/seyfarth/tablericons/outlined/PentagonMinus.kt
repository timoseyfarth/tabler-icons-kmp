package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PentagonMinus: ImageVector
    get() {
        if (_PentagonMinus != null) {
            return _PentagonMinus!!
        }
        _PentagonMinus = ImageVector.Builder(
            name = "Filled.PentagonMinus",
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
                moveTo(12.5f, 21f)
                quadToRelative(-1.82f, 0f, -5.458f, 0.005f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.881f, -1.367f)
                lineToRelative(-3.064f, -9.43f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.719f, -2.212f)
                lineToRelative(8.021f, -5.828f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.326f, 0f)
                lineToRelative(8.021f, 5.828f)
                curveToRelative(0.694f, 0.504f, 0.984f, 1.397f, 0.719f, 2.212f)
                lineToRelative(-1.559f, 4.792f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
        }.build()

        return _PentagonMinus!!
    }

@Suppress("ObjectPropertyName")
private var _PentagonMinus: ImageVector? = null
