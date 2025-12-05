package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.FidgetSpinner: ImageVector
    get() {
        if (_FidgetSpinner != null) {
            return _FidgetSpinner!!
        }
        _FidgetSpinner = ImageVector.Builder(
            name = "Filled.FidgetSpinner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.584f, 8.488f)
                lineToRelative(-0.012f, 0.012f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.33f, 2.517f)
                lineToRelative(0.018f, 0.101f)
                lineToRelative(0.251f, -0.048f)
                quadToRelative(0.15f, -0.025f, 0.3f, -0.041f)
                lineToRelative(0.304f, -0.024f)
                lineToRelative(0.225f, -0.005f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.89f, 6.046f)
                lineToRelative(-0.032f, -0.164f)
                lineToRelative(-0.24f, 0.048f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.556f, 0.062f)
                lineToRelative(-0.282f, 0.008f)
                quadToRelative(-0.427f, 0f, -0.84f, -0.07f)
                lineToRelative(-0.239f, -0.048f)
                lineToRelative(-0.004f, 0.025f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.331f, 3.834f)
                lineToRelative(-0.22f, 0.068f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.461f, -9.728f)
                lineToRelative(0.173f, 0.036f)
                lineToRelative(0.019f, -0.102f)
                curveToRelative(0.19f, -0.95f, 0.653f, -1.824f, 1.331f, -2.516f)
                lineToRelative(-0.05f, -0.052f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.355f, -2.978f)
                lineToRelative(-0.018f, -0.244f)
                lineToRelative(-0.005f, -0.225f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                moveToRelative(6f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                moveToRelative(-12f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                moveToRelative(6f, -4.995f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.891f, -1.99f, 1.99f)
                verticalLineToRelative(0.02f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.98f, 0f)
                verticalLineToRelative(-0.02f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.99f, -1.99f)
                moveToRelative(0f, -6.005f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
            }
        }.build()

        return _FidgetSpinner!!
    }

@Suppress("ObjectPropertyName")
private var _FidgetSpinner: ImageVector? = null
