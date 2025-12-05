package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Flask2: ImageVector
    get() {
        if (_Flask2 != null) {
            return _Flask2!!
        }
        _Flask2 = ImageVector.Builder(
            name = "Filled.Flask2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                verticalLineToRelative(5.674f)
                lineToRelative(0.062f, 0.03f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.85f, 5.174f)
                lineToRelative(0.037f, 0.262f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.078f, 6.693f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.553f, 0.167f)
                horizontalLineToRelative(-6.635f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.552f, -0.166f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.807f, -12.134f)
                lineToRelative(0.062f, -0.028f)
                verticalLineToRelative(-5.672f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(13f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.34f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.551f, 0.894f)
                lineToRelative(-0.116f, 0.049f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.92f, 2.717f)
                horizontalLineToRelative(9.172f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.918f, -2.715f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.667f, -0.943f)
                verticalLineToRelative(-6.342f)
                close()
            }
        }.build()

        return _Flask2!!
    }

@Suppress("ObjectPropertyName")
private var _Flask2: ImageVector? = null
