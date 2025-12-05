package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ShieldHalf: ImageVector
    get() {
        if (_ShieldHalf != null) {
            return _ShieldHalf!!
        }
        _ShieldHalf = ImageVector.Builder(
            name = "Filled.ShieldHalf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.998f, 2f)
                lineToRelative(0.032f, 0.002f)
                lineToRelative(0.086f, 0.005f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.342f, 0.104f)
                lineToRelative(0.105f, 0.062f)
                lineToRelative(0.097f, 0.076f)
                lineToRelative(0.016f, 0.015f)
                lineToRelative(0.247f, 0.21f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.189f, 2.537f)
                lineToRelative(0.342f, -0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.005f, 0.717f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.208f, 16.25f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.502f, 0f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.209f, -16.25f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.005f, -0.717f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.791f, -2.75f)
                lineToRelative(0.046f, -0.036f)
                lineToRelative(0.053f, -0.041f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.217f, -0.112f)
                lineToRelative(0.075f, -0.023f)
                lineToRelative(0.036f, -0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.12f, -0.022f)
                lineToRelative(0.086f, -0.005f)
                close()
                moveTo(12f, 4.296f)
                lineToRelative(-0.176f, 0.135f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.288f, 2.572f)
                lineToRelative(-0.264f, 0.006f)
                lineToRelative(-0.064f, 0.31f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.064f, 7.175f)
                lineToRelative(0.17f, 0.314f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.49f, 5.136f)
                lineToRelative(0.068f, 0.019f)
                close()
            }
        }.build()

        return _ShieldHalf!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldHalf: ImageVector? = null
