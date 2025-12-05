package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ChartGridDots: ImageVector
    get() {
        if (_ChartGridDots != null) {
            return _ChartGridDots!!
        }
        _ChartGridDots = ImageVector.Builder(
            name = "Filled.ChartGridDots",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(0.171f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, 1.83f)
                lineToRelative(0.17f, -0.001f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.828f, 1.829f)
                lineToRelative(-0.001f, 2.171f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.171f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, 1.83f)
                lineToRelative(0.17f, -0.001f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.828f, 1.829f)
                lineToRelative(-0.001f, 0.171f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-0.17f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.829f, -1.83f)
                horizontalLineToRelative(-2.171f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.171f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.828f, 1.829f)
                lineToRelative(-0.001f, 0.171f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-0.17f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.829f, -1.83f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(0.17f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, -1.83f)
                verticalLineToRelative(-0.34f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.829f, -1.83f)
                horizontalLineToRelative(-0.171f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(0.17f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, -1.83f)
                verticalLineToRelative(-2.17f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.17f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, -1.83f)
                verticalLineToRelative(-0.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(-2.171f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.828f, 1.829f)
                verticalLineToRelative(0.342f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.828f, 1.829f)
                horizontalLineToRelative(2.171f)
                verticalLineToRelative(-4f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2.17f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, -1.83f)
                verticalLineToRelative(-2.17f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.171f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, 1.83f)
                lineToRelative(2.17f, -0.001f)
                verticalLineToRelative(-4f)
                close()
                moveTo(15.171f, 7f)
                horizontalLineToRelative(-2.171f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.17f)
                arcToRelative(3.008f, 3.008f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.829f, -1.83f)
                close()
            }
        }.build()

        return _ChartGridDots!!
    }

@Suppress("ObjectPropertyName")
private var _ChartGridDots: ImageVector? = null
