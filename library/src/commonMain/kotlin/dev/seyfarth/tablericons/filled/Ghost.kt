package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Ghost: ImageVector
    get() {
        if (_Ghost != null) {
            return _Ghost!!
        }
        _Ghost = ImageVector.Builder(
            name = "Filled.Ghost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.996f, 7.75f)
                lineToRelative(0.004f, 0.25f)
                lineToRelative(-0.001f, 6.954f)
                lineToRelative(0.01f, 0.103f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.468f, 2.618f)
                lineToRelative(-0.163f, 0.08f)
                curveToRelative(-1.053f, 0.475f, -2.283f, 0.248f, -3.129f, -0.593f)
                lineToRelative(-0.137f, -0.146f)
                arcToRelative(0.65f, 0.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.024f, 0f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.176f, 0f)
                arcToRelative(0.65f, 0.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.512f, -0.25f)
                curveToRelative(-0.2f, 0f, -0.389f, 0.092f, -0.55f, 0.296f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.859f, -2.005f)
                lineToRelative(0.008f, -0.091f)
                lineToRelative(0.001f, -6.966f)
                lineToRelative(0.004f, -0.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.996f, -7.75f)
                close()
                moveTo(14.82f, 13.429f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.391f, -0.25f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.858f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.142f, 1.642f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.142f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, -1.392f)
                close()
                moveTo(10.01f, 9f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.117f, -1.993f)
                close()
                moveTo(14.01f, 9f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.117f, -1.993f)
                close()
            }
        }.build()

        return _Ghost!!
    }

@Suppress("ObjectPropertyName")
private var _Ghost: ImageVector? = null
