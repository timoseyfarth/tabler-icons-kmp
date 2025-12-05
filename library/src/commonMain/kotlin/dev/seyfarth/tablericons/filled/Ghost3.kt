package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Ghost3: ImageVector
    get() {
        if (_Ghost3 != null) {
            return _Ghost3!!
        }
        _Ghost3 = ImageVector.Builder(
            name = "Filled.Ghost3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(6.954f)
                lineToRelative(0.009f, 0.103f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.468f, 2.618f)
                lineToRelative(-0.163f, 0.08f)
                curveToRelative(-1.111f, 0.502f, -2.42f, 0.22f, -3.266f, -0.74f)
                arcToRelative(0.65f, 0.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.024f, 0f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.176f, 0f)
                arcToRelative(0.65f, 0.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.512f, -0.249f)
                curveToRelative(-0.2f, 0f, -0.389f, 0.092f, -0.55f, 0.296f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.859f, -2.005f)
                lineToRelative(0.01f, -0.104f)
                lineToRelative(0.007f, -0.077f)
                lineToRelative(-0.008f, 0.074f)
                verticalLineToRelative(-6.95f)
                lineToRelative(0.004f, -0.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.747f, -7.746f)
                close()
                moveTo(10.01f, 9f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
            }
        }.build()

        return _Ghost3!!
    }

@Suppress("ObjectPropertyName")
private var _Ghost3: ImageVector? = null
