package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Melon: ImageVector
    get() {
        if (_Melon != null) {
            return _Melon!!
        }
        _Melon = ImageVector.Builder(
            name = "Filled.Melon",
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
                moveTo(20f, 10f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                arcToRelative(9.967f, 9.967f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.984f, -2.842f)
                lineToRelative(4.343f, -4.153f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.76f, -5.51f)
                lineToRelative(4.342f, -4.153f)
                arcToRelative(9.963f, 9.963f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.539f, 6.658f)
                close()
            }
        }.build()

        return _Melon!!
    }

@Suppress("ObjectPropertyName")
private var _Melon: ImageVector? = null
