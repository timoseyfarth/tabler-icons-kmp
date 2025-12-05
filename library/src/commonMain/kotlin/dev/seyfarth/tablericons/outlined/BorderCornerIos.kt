package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BorderCornerIos: ImageVector
    get() {
        if (_BorderCornerIos != null) {
            return _BorderCornerIos!!
        }
        _BorderCornerIos = ImageVector.Builder(
            name = "Filled.BorderCornerIos",
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
                moveTo(4f, 20f)
                curveToRelative(0f, -6.559f, 0f, -9.838f, 1.628f, -12.162f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.21f, -2.21f)
                curveToRelative(2.324f, -1.628f, 5.602f, -1.628f, 12.162f, -1.628f)
            }
        }.build()

        return _BorderCornerIos!!
    }

@Suppress("ObjectPropertyName")
private var _BorderCornerIos: ImageVector? = null
