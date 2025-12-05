package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Badge8K: ImageVector
    get() {
        if (_Badge8K != null) {
            return _Badge8K!!
        }
        _Badge8K = ImageVector.Builder(
            name = "Filled.Badge8K",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                close()
                moveTo(17.555f, 8.168f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.387f, 0.277f)
                lineToRelative(-1.168f, 1.751f)
                verticalLineToRelative(-1.196f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-1.196f)
                lineToRelative(1.168f, 1.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.286f, 0.337f)
                lineToRelative(0.1f, -0.059f)
                lineToRelative(0.094f, -0.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.184f, -1.317f)
                lineToRelative(-1.63f, -2.445f)
                lineToRelative(1.63f, -2.445f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.277f, -1.387f)
                moveToRelative(-8.555f, -0.168f)
                horizontalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(1f)
                lineToRelative(0.005f, 0.15f)
                curveToRelative(0.022f, 0.295f, 0.108f, 0.573f, 0.245f, 0.819f)
                lineToRelative(0.019f, 0.031f)
                lineToRelative(-0.02f, 0.031f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.249f, 0.969f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineToRelative(-1f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.245f, -0.819f)
                lineToRelative(-0.019f, -0.031f)
                lineToRelative(0.02f, -0.031f)
                curveToRelative(0.158f, -0.287f, 0.249f, -0.618f, 0.249f, -0.969f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                moveToRelative(0f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                close()
                moveTo(9f, 10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                close()
            }
        }.build()

        return _Badge8K!!
    }

@Suppress("ObjectPropertyName")
private var _Badge8K: ImageVector? = null
