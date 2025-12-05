package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Pinned: ImageVector
    get() {
        if (_Pinned != null) {
            return _Pinned!!
        }
        _Pinned = ImageVector.Builder(
            name = "Filled.Pinned",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                verticalLineToRelative(4.764f)
                lineToRelative(1.894f, 3.789f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.1f, 0.331f)
                lineToRelative(0.006f, 0.116f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, -0.34f)
                lineToRelative(0.046f, -0.107f)
                lineToRelative(1.894f, -3.791f)
                verticalLineToRelative(-4.762f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(8f)
                close()
            }
        }.build()

        return _Pinned!!
    }

@Suppress("ObjectPropertyName")
private var _Pinned: ImageVector? = null
