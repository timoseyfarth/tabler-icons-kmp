package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Basket: ImageVector
    get() {
        if (_Basket != null) {
            return _Basket!!
        }
        _Basket = ImageVector.Builder(
            name = "Filled.Basket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.949f, 3.684f)
                lineToRelative(1.104f, 3.316f)
                horizontalLineToRelative(1.947f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.962f, 3.477f)
                lineToRelative(-1.252f, 7.131f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.954f, 3.392f)
                horizontalLineToRelative(-9.512f)
                arcToRelative(3.994f, 3.994f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.95f, -3.371f)
                lineToRelative(-1.258f, -7.173f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.964f, -3.456f)
                horizontalLineToRelative(1.945f)
                lineToRelative(1.105f, -3.316f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.898f, 0.632f)
                lineToRelative(-0.895f, 2.684f)
                horizontalLineToRelative(5.893f)
                lineToRelative(-0.895f, -2.684f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.898f, -0.632f)
                moveToRelative(-3.949f, 7.316f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.995f, 2.824f)
                lineToRelative(-0.005f, 0.176f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, -3f)
            }
        }.build()

        return _Basket!!
    }

@Suppress("ObjectPropertyName")
private var _Basket: ImageVector? = null
