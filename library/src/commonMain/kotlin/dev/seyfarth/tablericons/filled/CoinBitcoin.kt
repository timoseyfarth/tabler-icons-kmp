package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.CoinBitcoin: ImageVector
    get() {
        if (_CoinBitcoin != null) {
            return _CoinBitcoin!!
        }
        _CoinBitcoin = ImageVector.Builder(
            name = "Filled.CoinBitcoin",
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
                moveTo(13f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                curveToRelative(0f, 1.333f, 2f, 1.333f, 2f, 0f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.15f)
                curveToRelative(1.167f, -0.394f, 2f, -1.527f, 2f, -2.85f)
                lineToRelative(-0.005f, -0.175f)
                arcToRelative(3.063f, 3.063f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.734f, -1.827f)
                curveToRelative(0.46f, -0.532f, 0.739f, -1.233f, 0.739f, -1.998f)
                curveToRelative(0f, -1.323f, -0.833f, -2.456f, -2f, -2.85f)
                verticalLineToRelative(-0.15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
                moveTo(13.09f, 13f)
                curveToRelative(0.492f, 0f, 0.91f, 0.437f, 0.91f, 1f)
                reflectiveCurveToRelative(-0.418f, 1f, -0.91f, 1f)
                horizontalLineToRelative(-2.09f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.09f)
                close()
                moveTo(13.09f, 9f)
                curveToRelative(0.492f, 0f, 0.91f, 0.437f, 0.91f, 1f)
                curveToRelative(0f, 0.522f, -0.36f, 0.937f, -0.806f, 0.993f)
                lineToRelative(-0.104f, 0.007f)
                horizontalLineToRelative(-2.09f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.09f)
                close()
            }
        }.build()

        return _CoinBitcoin!!
    }

@Suppress("ObjectPropertyName")
private var _CoinBitcoin: ImageVector? = null
