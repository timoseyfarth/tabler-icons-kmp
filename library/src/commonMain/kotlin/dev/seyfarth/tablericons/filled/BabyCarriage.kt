package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.BabyCarriage: ImageVector
    get() {
        if (_BabyCarriage != null) {
            return _BabyCarriage!!
        }
        _BabyCarriage = ImageVector.Builder(
            name = "Filled.BabyCarriage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 2f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.49f, 6.858f)
                arcToRelative(1.04f, 1.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.04f, 0.456f)
                arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.757f, 5.103f)
                lineToRelative(0.532f, 1.595f)
                quadToRelative(0.135f, -0.012f, 0.275f, -0.012f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 3f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.894f, -1.966f)
                lineToRelative(-0.634f, -1.903f)
                quadToRelative(-0.377f, 0.045f, -0.765f, 0.045f)
                horizontalLineToRelative(-2.675f)
                quadToRelative(-0.547f, 0f, -1.076f, -0.083f)
                lineToRelative(-0.648f, 1.941f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.101f, 2.142f)
                lineToRelative(0.004f, -0.176f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.27f, -2.812f)
                lineToRelative(0.56f, -1.682f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.652f, -4.117f)
                lineToRelative(-1.402f, -4.213f)
                horizontalLineToRelative(-1.78f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.949f, 0.684f)
                lineToRelative(1.104f, 3.316f)
                horizontalLineToRelative(6.447f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
                moveTo(8f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(10f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
            }
        }.build()

        return _BabyCarriage!!
    }

@Suppress("ObjectPropertyName")
private var _BabyCarriage: ImageVector? = null
