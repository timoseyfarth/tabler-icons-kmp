package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Bong: ImageVector
    get() {
        if (_Bong != null) {
            return _Bong!!
        }
        _Bong = ImageVector.Builder(
            name = "Filled.Bong",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                verticalLineToRelative(5.587f)
                lineToRelative(2.293f, -2.294f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(2f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.414f)
                lineToRelative(-3.116f, 3.115f)
                lineToRelative(0.086f, 0.233f)
                curveToRelative(0.311f, 0.907f, 0.396f, 1.865f, 0.263f, 2.794f)
                lineToRelative(-0.062f, 0.36f)
                lineToRelative(-0.012f, 0.052f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.121f, 2.41f)
                lineToRelative(-0.16f, 0.199f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.396f, -2.378f)
                lineToRelative(-0.068f, -0.288f)
                lineToRelative(-0.009f, -0.046f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.833f, -6.324f)
                lineToRelative(0.055f, -0.031f)
                verticalLineToRelative(-6.803f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(12f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7.416f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.483f, 0.856f)
                lineToRelative(-0.117f, 0.06f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.4f, 3.668f)
                horizontalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.486f, -1.914f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, -1.185f)
                lineToRelative(2.902f, -2.901f)
                lineToRelative(-0.586f, -0.586f)
                lineToRelative(-2.9f, 2.902f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.067f, 0.226f)
                lineToRelative(-0.12f, -0.056f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.316f, -0.155f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.597f, -0.915f)
                close()
            }
        }.build()

        return _Bong!!
    }

@Suppress("ObjectPropertyName")
private var _Bong: ImageVector? = null
