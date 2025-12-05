package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Diamonds: ImageVector
    get() {
        if (_Diamonds != null) {
            return _Diamonds!!
        }
        _Diamonds = ImageVector.Builder(
            name = "Filled.Diamonds",
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
                moveTo(10.831f, 20.413f)
                lineToRelative(-5.375f, -6.91f)
                curveToRelative(-0.608f, -0.783f, -0.608f, -2.223f, 0f, -3f)
                lineToRelative(5.375f, -6.911f)
                arcToRelative(1.457f, 1.457f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.338f, 0f)
                lineToRelative(5.375f, 6.91f)
                curveToRelative(0.608f, 0.783f, 0.608f, 2.223f, 0f, 3f)
                lineToRelative(-5.375f, 6.911f)
                arcToRelative(1.457f, 1.457f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.338f, 0f)
                close()
            }
        }.build()

        return _Diamonds!!
    }

@Suppress("ObjectPropertyName")
private var _Diamonds: ImageVector? = null
