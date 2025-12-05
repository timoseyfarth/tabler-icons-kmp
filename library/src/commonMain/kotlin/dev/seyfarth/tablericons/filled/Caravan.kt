package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Caravan: ImageVector
    get() {
        if (_Caravan != null) {
            return _Caravan!!
        }
        _Caravan = ImageVector.Builder(
            name = "Filled.Caravan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.949f, 3.684f)
                lineToRelative(0.771f, 2.316f)
                horizontalLineToRelative(1.28f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-1.17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, 2f)
                horizontalLineToRelative(-6.17f)
                arcToRelative(3.001f, 3.001f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, 0f)
                horizontalLineToRelative(-1.17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-3.5f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.672f, -6.448f)
                lineToRelative(6.934f, -2.971f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.343f, 0.603f)
                moveToRelative(-6.949f, 13.316f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(5.5f, -7f)
                horizontalLineToRelative(-1f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                verticalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
                verticalLineToRelative(-1f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
                moveToRelative(-0.105f, -4.653f)
                lineToRelative(-1.524f, 0.653f)
                horizontalLineToRelative(1.742f)
                close()
            }
        }.build()

        return _Caravan!!
    }

@Suppress("ObjectPropertyName")
private var _Caravan: ImageVector? = null
