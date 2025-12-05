package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.SortAscendingShapes: ImageVector
    get() {
        if (_SortAscendingShapes != null) {
            return _SortAscendingShapes!!
        }
        _SortAscendingShapes = ImageVector.Builder(
            name = "Filled.SortAscendingShapes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(9.584f)
                lineToRelative(1.293f, -1.291f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.414f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.112f, 0.097f)
                lineToRelative(-0.11f, 0.071f)
                lineToRelative(-0.114f, 0.054f)
                lineToRelative(-0.105f, 0.035f)
                lineToRelative(-0.149f, 0.03f)
                lineToRelative(-0.117f, 0.006f)
                lineToRelative(-0.075f, -0.003f)
                lineToRelative(-0.126f, -0.017f)
                lineToRelative(-0.111f, -0.03f)
                lineToRelative(-0.111f, -0.044f)
                lineToRelative(-0.098f, -0.052f)
                lineToRelative(-0.096f, -0.067f)
                lineToRelative(-0.09f, -0.08f)
                lineToRelative(-3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, -1.414f)
                lineToRelative(1.293f, 1.293f)
                verticalLineToRelative(-9.586f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                moveToRelative(12f, -2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
                moveTo(17.864f, 13.496f)
                lineToRelative(3.5f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.864f, 1.504f)
                horizontalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.864f, -1.504f)
                lineToRelative(3.5f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.728f, 0f)
            }
        }.build()

        return _SortAscendingShapes!!
    }

@Suppress("ObjectPropertyName")
private var _SortAscendingShapes: ImageVector? = null
