package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CoinYen: ImageVector
    get() {
        if (_CoinYen != null) {
            return _CoinYen!!
        }
        _CoinYen = ImageVector.Builder(
            name = "Filled.CoinYen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.995f, -8.336f)
                close()
                moveTo(15.555f, 7.168f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.387f, 0.277f)
                lineToRelative(-2.168f, 3.251f)
                lineToRelative(-2.168f, -3.25f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.286f, -0.337f)
                lineToRelative(-0.1f, 0.059f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.278f, 1.387f)
                lineToRelative(1.63f, 2.445f)
                horizontalLineToRelative(-0.798f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.883f, -0.993f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.993f, -0.883f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-0.799f)
                lineToRelative(1.631f, -2.445f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.184f, -1.317f)
                lineToRelative(-0.093f, -0.07f)
                close()
            }
        }.build()

        return _CoinYen!!
    }

@Suppress("ObjectPropertyName")
private var _CoinYen: ImageVector? = null
