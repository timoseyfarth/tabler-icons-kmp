package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Beer: ImageVector
    get() {
        if (_Beer != null) {
            return _Beer!!
        }
        _Beer = ImageVector.Builder(
            name = "Filled.Beer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.335f, -0.229f, 2.386f, -0.774f, 3.692f)
                lineToRelative(-0.157f, 0.363f)
                lineToRelative(-0.31f, 0.701f)
                arcToRelative(8.902f, 8.902f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.751f, 3.242f)
                lineToRelative(-0.008f, 0.377f)
                verticalLineToRelative(3.625f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-3.625f)
                curveToRelative(0f, -1.132f, -0.21f, -2.25f, -0.617f, -3.28f)
                lineToRelative(-0.142f, -0.34f)
                lineToRelative(-0.31f, -0.699f)
                curveToRelative(-0.604f, -1.358f, -0.883f, -2.41f, -0.925f, -3.698f)
                lineToRelative(-0.006f, -0.358f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(10f)
                close()
                moveTo(17f, 4f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                close()
            }
        }.build()

        return _Beer!!
    }

@Suppress("ObjectPropertyName")
private var _Beer: ImageVector? = null
