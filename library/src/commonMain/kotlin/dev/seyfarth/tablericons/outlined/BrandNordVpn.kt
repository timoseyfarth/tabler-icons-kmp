package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandNordVpn: ImageVector
    get() {
        if (_BrandNordVpn != null) {
            return _BrandNordVpn!!
        }
        _BrandNordVpn = ImageVector.Builder(
            name = "Filled.BrandNordVpn",
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
                moveTo(9.992f, 15f)
                lineToRelative(-2.007f, -3f)
                lineToRelative(-4.015f, 8f)
                curveToRelative(-2.212f, -3.061f, -2.625f, -7.098f, -0.915f, -10.463f)
                arcToRelative(10.14f, 10.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.945f, -5.537f)
                arcToRelative(10.14f, 10.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.945f, 5.537f)
                curveToRelative(1.71f, 3.365f, 1.297f, 7.402f, -0.915f, 10.463f)
                lineToRelative(-4.517f, -8f)
                lineToRelative(-1.505f, 1.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 15f)
                lineToRelative(-3f, -6f)
                lineToRelative(-2.5f, 4.5f)
            }
        }.build()

        return _BrandNordVpn!!
    }

@Suppress("ObjectPropertyName")
private var _BrandNordVpn: ImageVector? = null
