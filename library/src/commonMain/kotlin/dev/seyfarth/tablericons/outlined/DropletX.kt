package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.DropletX: ImageVector
    get() {
        if (_DropletX != null) {
            return _DropletX!!
        }
        _DropletX = ImageVector.Builder(
            name = "Filled.DropletX",
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
                moveTo(18.953f, 13.467f)
                arcToRelative(6.572f, 6.572f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.889f, -2.59f)
                lineToRelative(-4.89f, -7.26f)
                curveToRelative(-0.42f, -0.625f, -1.287f, -0.803f, -1.936f, -0.397f)
                arcToRelative(1.376f, 1.376f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.41f, 0.397f)
                lineToRelative(-4.893f, 7.26f)
                curveToRelative(-1.695f, 2.838f, -1.035f, 6.441f, 1.567f, 8.546f)
                arcToRelative(7.179f, 7.179f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.633f, 1.49f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                lineToRelative(-5f, -5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 22f)
                lineToRelative(5f, -5f)
            }
        }.build()

        return _DropletX!!
    }

@Suppress("ObjectPropertyName")
private var _DropletX: ImageVector? = null
