package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CarCrane: ImageVector
    get() {
        if (_CarCrane != null) {
            return _CarCrane!!
        }
        _CarCrane = ImageVector.Builder(
            name = "Filled.CarCrane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.06f, 5.66f)
                lineToRelative(0.035f, -0.085f)
                lineToRelative(0.07f, -0.125f)
                lineToRelative(0.033f, -0.048f)
                lineToRelative(0.063f, -0.075f)
                lineToRelative(0.064f, -0.065f)
                lineToRelative(0.098f, -0.079f)
                lineToRelative(0.106f, -0.065f)
                lineToRelative(0.067f, -0.033f)
                lineToRelative(0.048f, -0.02f)
                lineToRelative(0.139f, -0.041f)
                lineToRelative(18.053f, -3.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.164f, 0.986f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-0.82f)
                lineToRelative(-13.802f, 2.3f)
                lineToRelative(1.25f, 0.626f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.552f, 0.894f)
                lineToRelative(-0.001f, 3f)
                horizontalLineToRelative(2.001f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-1.17f)
                arcToRelative(3.001f, 3.001f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, 0f)
                horizontalLineToRelative(-6.34f)
                arcToRelative(3.001f, 3.001f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.83f, -1f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                verticalLineToRelative(-4.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, -0.35f)
                moveToRelative(1.94f, 10.34f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(12f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.992f, 1.124f)
                lineToRelative(0.008f, -0.132f)
                lineToRelative(-0.007f, -0.109f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, -0.883f)
                moveToRelative(-0.652f, -7.985f)
                lineToRelative(0.895f, 2.985f)
                horizontalLineToRelative(2.63f)
                lineToRelative(-0.042f, -0.155f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.223f, -2.8f)
                close()
            }
        }.build()

        return _CarCrane!!
    }

@Suppress("ObjectPropertyName")
private var _CarCrane: ImageVector? = null
