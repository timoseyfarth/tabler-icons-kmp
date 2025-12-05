package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Windsock: ImageVector
    get() {
        if (_Windsock != null) {
            return _Windsock!!
        }
        _Windsock = ImageVector.Builder(
            name = "Filled.Windsock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(1.079f)
                lineToRelative(11.083f, 0.924f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.917f, 0.997f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.917f, 0.997f)
                lineToRelative(-11.083f, 0.923f)
                verticalLineToRelative(8.08f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                moveToRelative(1f, 4.086f)
                verticalLineToRelative(3.827f)
                lineToRelative(3f, -0.25f)
                verticalLineToRelative(-3.327f)
                close()
                moveTo(14f, 6.67f)
                verticalLineToRelative(2.659f)
                lineToRelative(3f, -0.25f)
                verticalLineToRelative(-2.159f)
                close()
            }
        }.build()

        return _Windsock!!
    }

@Suppress("ObjectPropertyName")
private var _Windsock: ImageVector? = null
