package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) {
            return _ShoppingCart!!
        }
        _ShoppingCart = ImageVector.Builder(
            name = "Filled.ShoppingCart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(1.068f)
                lineToRelative(13.071f, 0.935f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.929f, 1.024f)
                lineToRelative(-0.01f, 0.114f)
                lineToRelative(-1f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.877f, 0.853f)
                lineToRelative(-0.113f, 0.006f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.995f, 3.176f)
                lineToRelative(-0.005f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                curveToRelative(0.017f, -0.288f, 0.074f, -0.564f, 0.166f, -0.824f)
                horizontalLineToRelative(-5.342f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.824f, 1.176f)
                lineToRelative(-0.005f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.002f, 3.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.995f, -2.654f)
                verticalLineToRelative(-12.17f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(17f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.build()

        return _ShoppingCart!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCart: ImageVector? = null
