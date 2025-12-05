package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Video: ImageVector
    get() {
        if (_Video != null) {
            return _Video!!
        }
        _Video = ImageVector.Builder(
            name = "Filled.Video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.117f, 7.625f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.564f, 0.1f)
                lineToRelative(-4.553f, 2.275f)
                verticalLineToRelative(4f)
                lineToRelative(4.553f, 2.275f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.447f, -0.892f)
                verticalLineToRelative(-6.766f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.883f, -0.992f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 5f)
                curveToRelative(-1.645f, 0f, -3f, 1.355f, -3f, 3f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.645f, 1.355f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.645f, 0f, 3f, -1.355f, 3f, -3f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.645f, -1.355f, -3f, -3f, -3f)
                close()
            }
        }.build()

        return _Video!!
    }

@Suppress("ObjectPropertyName")
private var _Video: ImageVector? = null
