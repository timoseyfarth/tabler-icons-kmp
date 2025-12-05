package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.SquareNumber1: ImageVector
    get() {
        if (_SquareNumber1 != null) {
            return _SquareNumber1!!
        }
        _SquareNumber1 = ImageVector.Builder(
            name = "Filled.SquareNumber1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.333f, 2f)
                curveToRelative(1.96f, 0f, 3.56f, 1.537f, 3.662f, 3.472f)
                lineToRelative(0.005f, 0.195f)
                verticalLineToRelative(12.666f)
                curveToRelative(0f, 1.96f, -1.537f, 3.56f, -3.472f, 3.662f)
                lineToRelative(-0.195f, 0.005f)
                horizontalLineToRelative(-12.666f)
                arcToRelative(3.667f, 3.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.662f, -3.472f)
                lineToRelative(-0.005f, -0.195f)
                verticalLineToRelative(-12.666f)
                curveToRelative(0f, -1.96f, 1.537f, -3.56f, 3.472f, -3.662f)
                lineToRelative(0.195f, -0.005f)
                horizontalLineToRelative(12.666f)
                close()
                moveTo(12.994f, 7.886f)
                curveToRelative(-0.083f, -0.777f, -1.008f, -1.16f, -1.617f, -0.67f)
                lineToRelative(-0.084f, 0.077f)
                lineToRelative(-2f, 2f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.226f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.226f, 0f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(0.293f, -0.293f)
                verticalLineToRelative(5.586f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-8f)
                lineToRelative(-0.006f, -0.114f)
                close()
            }
        }.build()

        return _SquareNumber1!!
    }

@Suppress("ObjectPropertyName")
private var _SquareNumber1: ImageVector? = null
