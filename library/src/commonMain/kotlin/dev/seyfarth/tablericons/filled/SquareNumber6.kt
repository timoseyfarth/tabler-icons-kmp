package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.SquareNumber6: ImageVector
    get() {
        if (_SquareNumber6 != null) {
            return _SquareNumber6!!
        }
        _SquareNumber6 = ImageVector.Builder(
            name = "Filled.SquareNumber6",
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
                moveTo(13f, 7f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.15f, 0.005f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.844f, 1.838f)
                lineToRelative(-0.006f, 0.157f)
                verticalLineToRelative(6f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(2f)
                lineToRelative(0.15f, -0.005f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.844f, -1.838f)
                lineToRelative(0.006f, -0.157f)
                verticalLineToRelative(-2f)
                lineToRelative(-0.005f, -0.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.838f, -1.844f)
                lineToRelative(-0.157f, -0.006f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.993f, -0.117f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.85f, -1.995f)
                lineToRelative(-0.15f, -0.005f)
                close()
                moveTo(13f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()

        return _SquareNumber6!!
    }

@Suppress("ObjectPropertyName")
private var _SquareNumber6: ImageVector? = null
