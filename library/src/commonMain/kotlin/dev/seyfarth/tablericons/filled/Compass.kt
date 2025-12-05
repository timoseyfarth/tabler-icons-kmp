package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Compass: ImageVector
    get() {
        if (_Compass != null) {
            return _Compass!!
        }
        _Compass = ImageVector.Builder(
            name = "Filled.Compass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.995f, -8.336f)
                close()
                moveTo(12f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(15.684f, 7.051f)
                lineToRelative(-6f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.633f, 0.633f)
                lineToRelative(-2.007f, 6.026f)
                lineToRelative(-0.023f, 0.086f)
                lineToRelative(-0.017f, 0.113f)
                lineToRelative(-0.004f, 0.068f)
                verticalLineToRelative(0.044f)
                lineToRelative(0.009f, 0.111f)
                lineToRelative(0.012f, 0.07f)
                lineToRelative(0.04f, 0.144f)
                lineToRelative(0.045f, 0.1f)
                lineToRelative(0.054f, 0.095f)
                lineToRelative(0.064f, 0.09f)
                lineToRelative(0.069f, 0.075f)
                lineToRelative(0.084f, 0.074f)
                lineToRelative(0.098f, 0.07f)
                lineToRelative(0.1f, 0.054f)
                lineToRelative(0.078f, 0.033f)
                lineToRelative(0.105f, 0.033f)
                lineToRelative(0.109f, 0.02f)
                lineToRelative(0.043f, 0.005f)
                lineToRelative(0.068f, 0.004f)
                horizontalLineToRelative(0.044f)
                lineToRelative(0.111f, -0.009f)
                lineToRelative(0.07f, -0.012f)
                lineToRelative(0.02f, -0.006f)
                lineToRelative(0.019f, -0.002f)
                lineToRelative(0.074f, -0.022f)
                lineToRelative(6f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.633f, -0.633f)
                lineToRelative(2f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.265f, -1.265f)
                close()
                moveTo(14.419f, 9.58f)
                lineToRelative(-1.21f, 3.629f)
                lineToRelative(-3.629f, 1.21f)
                lineToRelative(1.21f, -3.629f)
                lineToRelative(3.629f, -1.21f)
                close()
                moveTo(5f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(19f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(12f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.build()

        return _Compass!!
    }

@Suppress("ObjectPropertyName")
private var _Compass: ImageVector? = null
