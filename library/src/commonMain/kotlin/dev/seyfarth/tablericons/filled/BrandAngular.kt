package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.BrandAngular: ImageVector
    get() {
        if (_BrandAngular != null) {
            return _BrandAngular!!
        }
        _BrandAngular = ImageVector.Builder(
            name = "Filled.BrandAngular",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.665f, 2.174f)
                lineToRelative(7.4f, 2.612f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.316f, 2.156f)
                lineToRelative(-1.323f, 9.703f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.99f, 1.468f)
                lineToRelative(-6.076f, 3.471f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.984f, 0f)
                lineToRelative(-6.076f, -3.47f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.96f, -1.3f)
                lineToRelative(-0.03f, -0.167f)
                lineToRelative(-1.322f, -9.704f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.316f, -2.156f)
                lineToRelative(7.4f, -2.613f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.33f, 0f)
                moveToRelative(0.271f, 4.475f)
                curveToRelative(-0.324f, -0.865f, -1.548f, -0.865f, -1.872f, 0f)
                lineToRelative(-3f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.585f, 1.287f)
                lineToRelative(0.111f, 0.035f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.176f, -0.62f)
                lineToRelative(0.506f, -1.351f)
                horizontalLineToRelative(3.113f)
                lineToRelative(0.508f, 1.352f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.176f, 0.62f)
                lineToRelative(0.111f, -0.035f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.585f, -1.287f)
                close()
                moveTo(12f, 9.848f)
                lineToRelative(0.807f, 2.151f)
                horizontalLineToRelative(-1.614f)
                close()
            }
        }.build()

        return _BrandAngular!!
    }

@Suppress("ObjectPropertyName")
private var _BrandAngular: ImageVector? = null
