package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.PanoramaHorizontal: ImageVector
    get() {
        if (_PanoramaHorizontal != null) {
            return _PanoramaHorizontal!!
        }
        _PanoramaHorizontal = ImageVector.Builder(
            name = "Filled.PanoramaHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.31f, 4.591f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.69f, 1.873f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.382f, -1.38f, 2.38f, -2.694f, 1.897f)
                curveToRelative(-4.879f, -1.845f, -9.734f, -1.845f, -14.612f, 0f)
                curveToRelative(-1.304f, 0.495f, -2.694f, -0.481f, -2.694f, -1.871f)
                verticalLineToRelative(-11.032f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.676f, -1.87f)
                lineToRelative(0.025f, 0.012f)
                lineToRelative(0.448f, 0.162f)
                curveToRelative(4.572f, 1.623f, 9.123f, 1.622f, 13.703f, -0.003f)
                close()
            }
        }.build()

        return _PanoramaHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaHorizontal: ImageVector? = null
