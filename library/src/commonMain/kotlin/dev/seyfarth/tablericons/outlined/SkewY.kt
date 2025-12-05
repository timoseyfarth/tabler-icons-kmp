package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.SkewY: ImageVector
    get() {
        if (_SkewY != null) {
            return _SkewY!!
        }
        _SkewY = ImageVector.Builder(
            name = "Filled.SkewY",
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
                moveTo(4.326f, 19f)
                horizontalLineToRelative(15.348f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.962f, -1.275f)
                lineToRelative(-3.429f, -12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.961f, -0.725f)
                horizontalLineToRelative(-8.492f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.961f, 0.725f)
                lineToRelative(-3.429f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.962f, 1.275f)
                close()
            }
        }.build()

        return _SkewY!!
    }

@Suppress("ObjectPropertyName")
private var _SkewY: ImageVector? = null
