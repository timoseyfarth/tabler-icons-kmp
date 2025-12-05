package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.LayoutSidebarLeftExpand: ImageVector
    get() {
        if (_LayoutSidebarLeftExpand != null) {
            return _LayoutSidebarLeftExpand!!
        }
        _LayoutSidebarLeftExpand = ImageVector.Builder(
            name = "Filled.LayoutSidebarLeftExpand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(12f)
                close()
                moveTo(18f, 5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                close()
                moveTo(13.613f, 9.21f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(2f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-2f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(1.292f, -1.293f)
                lineToRelative(-1.292f, -1.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.32f, -0.083f)
                close()
            }
        }.build()

        return _LayoutSidebarLeftExpand!!
    }

@Suppress("ObjectPropertyName")
private var _LayoutSidebarLeftExpand: ImageVector? = null
