package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.IroningSteam: ImageVector
    get() {
        if (_IroningSteam != null) {
            return _IroningSteam!!
        }
        _IroningSteam = ImageVector.Builder(
            name = "Filled.IroningSteam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.459f, 3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.945f, 3.343f)
                lineToRelative(0.577f, 3.464f)
                lineToRelative(0.81f, 4.865f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.971f, 2.328f)
                horizontalLineToRelative(-16.82f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(8.652f)
                lineToRelative(-0.22f, -1.329f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.811f, -1.665f)
                lineToRelative(-0.162f, -0.006f)
                horizontalLineToRelative(-7.459f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.106f, 18.553f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.788f, 0.894f)
                lineToRelative(-1f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.788f, -0.894f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.553f, 18.106f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.341f, 0.447f)
                lineToRelative(1f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.788f, 0.894f)
                lineToRelative(-1f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.447f, -1.341f)
            }
        }.build()

        return _IroningSteam!!
    }

@Suppress("ObjectPropertyName")
private var _IroningSteam: ImageVector? = null
