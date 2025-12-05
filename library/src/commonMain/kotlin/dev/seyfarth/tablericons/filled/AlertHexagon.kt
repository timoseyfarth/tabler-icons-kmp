package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.AlertHexagon: ImageVector
    get() {
        if (_AlertHexagon != null) {
            return _AlertHexagon!!
        }
        _AlertHexagon = ImageVector.Builder(
            name = "Filled.AlertHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.425f, 1.414f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.026f, -0.097f)
                lineToRelative(0.19f, 0.097f)
                lineToRelative(6.775f, 3.995f)
                lineToRelative(0.096f, 0.063f)
                lineToRelative(0.092f, 0.077f)
                lineToRelative(0.107f, 0.075f)
                arcToRelative(3.224f, 3.224f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.266f, 2.188f)
                lineToRelative(0.018f, 0.202f)
                lineToRelative(0.005f, 0.204f)
                verticalLineToRelative(7.284f)
                curveToRelative(0f, 1.106f, -0.57f, 2.129f, -1.454f, 2.693f)
                lineToRelative(-0.17f, 0.1f)
                lineToRelative(-6.803f, 4.302f)
                curveToRelative(-0.918f, 0.504f, -2.019f, 0.535f, -3.004f, 0.068f)
                lineToRelative(-0.196f, -0.1f)
                lineToRelative(-6.695f, -4.237f)
                arcToRelative(3.225f, 3.225f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.671f, -2.619f)
                lineToRelative(-0.007f, -0.207f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0f, -1.106f, 0.57f, -2.128f, 1.476f, -2.705f)
                lineToRelative(6.95f, -4.098f)
                close()
                moveTo(12.01f, 15f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
                moveTo(12f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(4f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-4f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.993f, -0.883f)
                close()
            }
        }.build()

        return _AlertHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _AlertHexagon: ImageVector? = null
