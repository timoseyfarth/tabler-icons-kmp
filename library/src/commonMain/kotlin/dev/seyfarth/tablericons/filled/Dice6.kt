package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.Dice6: ImageVector
    get() {
        if (_Dice6 != null) {
            return _Dice6!!
        }
        _Dice6 = ImageVector.Builder(
            name = "Filled.Dice6",
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
                moveTo(15.5f, 15f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                close()
                moveTo(8.5f, 15f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                close()
                moveTo(8.5f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                close()
                moveTo(15.5f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                close()
                moveTo(8.5f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                close()
                moveTo(15.5f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
                close()
            }
        }.build()

        return _Dice6!!
    }

@Suppress("ObjectPropertyName")
private var _Dice6: ImageVector? = null
