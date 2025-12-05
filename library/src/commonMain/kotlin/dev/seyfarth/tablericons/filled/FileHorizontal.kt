package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.FileHorizontal: ImageVector
    get() {
        if (_FileHorizontal != null) {
            return _FileHorizontal!!
        }
        _FileHorizontal = ImageVector.Builder(
            name = "Filled.FileHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.876f, -0.876f)
                lineToRelative(-0.117f, -0.007f)
                horizontalLineToRelative(-4f)
                lineToRelative(-0.15f, -0.005f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.844f, -1.838f)
                lineToRelative(-0.006f, -0.157f)
                verticalLineToRelative(-4f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.876f, -0.876f)
                lineToRelative(-0.117f, -0.007f)
                horizontalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.995f, 2.824f)
                lineToRelative(-0.005f, 0.176f)
                verticalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.824f, 2.995f)
                lineToRelative(0.176f, 0.005f)
                horizontalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.995f, -2.824f)
                lineToRelative(0.005f, -0.176f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 5f)
                verticalLineToRelative(4f)
                lineToRelative(4.001f, 0.001f)
                close()
            }
        }.build()

        return _FileHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _FileHorizontal: ImageVector? = null
