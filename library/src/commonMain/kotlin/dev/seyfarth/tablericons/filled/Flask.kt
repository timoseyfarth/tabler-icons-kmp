package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Flask: ImageVector
    get() {
        if (_Flask != null) {
            return _Flask!!
        }
        _Flask = ImageVector.Builder(
            name = "Filled.Flask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                verticalLineToRelative(4.826f)
                lineToRelative(3.932f, 10.814f)
                lineToRelative(0.034f, 0.077f)
                arcToRelative(1.7f, 1.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.002f, 1.193f)
                lineToRelative(-0.07f, 0.162f)
                arcToRelative(1.7f, 1.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.213f, 0.911f)
                lineToRelative(-0.181f, 0.017f)
                horizontalLineToRelative(-11f)
                lineToRelative(-0.181f, -0.017f)
                arcToRelative(1.7f, 1.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.285f, -2.266f)
                lineToRelative(0.039f, -0.09f)
                lineToRelative(3.927f, -10.804f)
                verticalLineToRelative(-4.823f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(13f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
            }
        }.build()

        return _Flask!!
    }

@Suppress("ObjectPropertyName")
private var _Flask: ImageVector? = null
