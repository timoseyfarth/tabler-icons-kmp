package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Helicopter: ImageVector
    get() {
        if (_Helicopter != null) {
            return _Helicopter!!
        }
        _Helicopter = ImageVector.Builder(
            name = "Filled.Helicopter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                curveToRelative(4.642f, 0f, 8f, 2.218f, 8f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.652f, 0f, -3f, -1.348f, -3f, -3f)
                verticalLineToRelative(-1.001f)
                lineToRelative(-6f, 0.001f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.894f, -0.553f)
                lineToRelative(-1f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.788f, -0.894f)
                lineToRelative(0.724f, 1.447f)
                lineToRelative(5.382f, -0.001f)
                lineToRelative(0.005f, -0.175f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.995f, -2.824f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(16.001f, 10.174f)
                lineToRelative(-0.001f, 1.826f)
                horizontalLineToRelative(3.36f)
                curveToRelative(-0.665f, -0.906f, -1.825f, -1.539f, -3.359f, -1.826f)
            }
        }.build()

        return _Helicopter!!
    }

@Suppress("ObjectPropertyName")
private var _Helicopter: ImageVector? = null
