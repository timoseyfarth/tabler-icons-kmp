package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ShieldCheckered: ImageVector
    get() {
        if (_ShieldCheckered != null) {
            return _ShieldCheckered!!
        }
        _ShieldCheckered = ImageVector.Builder(
            name = "Filled.ShieldCheckered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.013f, 12f)
                verticalLineToRelative(9.754f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.733f, -9.754f)
                horizontalLineToRelative(8.734f)
                close()
                moveTo(20.297f, 15.794f)
                arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.283f, 5.951f)
                lineToRelative(-0.001f, -9.745f)
                horizontalLineToRelative(8.708f)
                arcToRelative(12.96f, 12.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.424f, 3.794f)
                close()
                moveTo(11.014f, 2.526f)
                lineToRelative(-0.001f, 7.474f)
                horizontalLineToRelative(-8.986f)
                curveToRelative(-0.068f, -1.432f, 0.101f, -2.88f, 0.514f, -4.282f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.005f, -0.717f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.192f, -2.256f)
                lineToRelative(0.276f, -0.219f)
                close()
                moveTo(13.013f, 10f)
                verticalLineToRelative(-7.453f)
                lineToRelative(-0.09f, -0.073f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.189f, 2.537f)
                lineToRelative(0.342f, -0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.005f, 0.717f)
                curveToRelative(0.413f, 1.403f, 0.582f, 2.85f, 0.514f, 4.282f)
                horizontalLineToRelative(-8.96f)
                close()
            }
        }.build()

        return _ShieldCheckered!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCheckered: ImageVector? = null
